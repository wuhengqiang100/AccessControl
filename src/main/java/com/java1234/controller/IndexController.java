package com.java1234.controller;

import com.java1234.entity.Control;
import com.java1234.service.ControlService;
import com.java1234.util.ResponseUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 主页Controller
 * 
 * @author 巫恒强
 * 
 */
@Controller
@RequestMapping("/")
public class IndexController {

	@Resource
	private ControlService controlService;

	/**
	 * 管理其他无关请求
	 * @return
	 * @throws Exception
	 */

	@RequestMapping("/")
	public ModelAndView init()throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		return mav;
	}

	/**
	 * 登录请求,初始化登录表单数据
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/index")
	public ModelAndView index()throws Exception{
		ModelAndView mav=new ModelAndView();

		//获得所有请求令牌,String
		List<String> requestAimList=controlService.getRequestAimAll();
		//获得所有求情令牌,Control实体形式
		List<Control> controlAllList=controlService.getControlAll();
		for (int i=0;i<controlAllList.size();i++){
			//获得第一个请求的所有非空属性
			mav.addObject("firstRequest",controlAllList.get(0));
		}
	/*	for(Control control:controlAllList){
			if (StringUtils.isNotEmpty(control.getRequestAim())){
				//获得第一个请求的所有非空属性
				mav.addObject("firstRequest",control);
			}
		}*/
		if (requestAimList.size()>0){
			mav.addObject("requestAimList", requestAimList);
			mav.addObject("controlAllList",controlAllList);
		}else{
			mav.addObject("errorInfo","没有请求可以获取!");
		}
		mav.setViewName("login");
		return mav;
	}

	/**
	 * 选择请求数据更新请求
	 * @param id
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/property")
	public StringBuffer property(@RequestParam(value="id",required=false) String id, HttpServletResponse response)throws Exception{
		Control control=controlService.getControlById(Integer.parseInt(id));
		StringBuffer strPro=new StringBuffer();
		strPro.append(" <INPUT id='id' name='id' class='ipt' type='hidden' value='Integer.parseInt(id)'>");
		if (StringUtils.isNotEmpty(control.getAccount())){
			strPro.append("<input id='account' name='account' class='ipt' type='text' placeholder='请输入账号' value=''/>");
//			strPro.append("<INPUT id=\"account\" name=\"account\" class=\"ipt\" type=\"text\" placeholder=\"请输入账号\" value=\"\"></INPUT>");
		}

		if (StringUtils.isNotEmpty(control.getPassword())){
			strPro.append("<INPUT id='password' name='password' class='ipt' type='password' placeholder='请输入密码' value=''>");
		}
		if (StringUtils.isNotEmpty(control.getTellphone())){
			strPro.append(" <INPUT id='tellphone' name='tellphone' class='ipt' type='text' placeholder='请输入电话号码' value=''>");
		}
		if (control.getRequestTime()!=null){
			strPro.append(" <INPUT id='requestTime' name='requestTime' class='ipt' type='text' placeholder='请输入请求发起时间' value=''>");
		}
		if (StringUtils.isNotEmpty(control.getRequestLocation())){
			strPro.append("<INPUT id='requestLocation' name='requestLocation' class='ipt' type='text' placeholder='请输入请求发起地址' value=''>");
		}
		if (StringUtils.isNotEmpty(control.getIdentity())){
			strPro.append(" <INPUT id='identity' name='identity' class='ipt' type='text' placeholder='请输入请求身份' value=''>");
		}
		if (StringUtils.isNotEmpty(control.getWork())){
			strPro.append("<INPUT id='work' name='work' class='ipt' type='text' placeholder='请输入请求人的工作' value=''>");
		}
		if (StringUtils.isNotEmpty(control.getAge())){
			strPro.append("<INPUT id='age' name='age' class='ipt' type='text' placeholder='请输入年龄' value=''>");
		}

		if (StringUtils.isNotEmpty(control.getSex())){
			strPro.append(" <INPUT id='sex' name='sex' class='ipt' type='text' placeholder='请选择性别' value=''>");
		}
		if (StringUtils.isNotEmpty(control.getNickName())){
			strPro.append("<INPUT id='nickName' name='nickName' class='ipt' type='text' placeholder='请输入昵称' value=''>");
		}
//		JSONObject result=new JSONObject();
/*		if(control.size()>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}*/
		//拼接好的输入框
//		result.put("control",control);
//		result.put("strPro",strPro);
		ResponseUtil.write(response, strPro);

		return null;

	}
}
