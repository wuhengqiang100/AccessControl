package com.java1234.controller;

import com.java1234.entity.Control;
import com.java1234.entity.User;
import com.java1234.service.ControlService;
import com.java1234.service.UserService;
import com.java1234.util.DateUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 用户登录control登录实体类
 */
@Controller
public class LoginController {

	@Resource
	private UserService userService;
	@Resource
	private ControlService controlService;


	@ResponseBody
	@RequestMapping("/login")
	public ModelAndView login(Control controlLogin, HttpServletRequest request) throws Exception{
		ModelAndView mav=new ModelAndView();
		int id=controlLogin.getId();
		String account=controlLogin.getAccount();
		String password=controlLogin.getPassword();
		String tellphone=controlLogin.getPassword();
		Date requestTime=controlLogin.getRequestTime();
		String requestLocation=controlLogin.getRequestLocation();
		String  identity=controlLogin.getIdentity();
		String work=controlLogin.getWork();
		String age=controlLogin.getAge();
		String sex=controlLogin.getSex();
		String nickName=controlLogin.getNickName();
		//获得真实的令牌数据
		Control trueControl=controlService.getControlById(id);
		if (StringUtils.isNotEmpty(account)){
			if (!account.equals(trueControl.getAccount())){
				mav.addObject("error", "账号不对!");
				mav.setViewName("login");
			}
		}
		if (StringUtils.isNotEmpty(password)){
			if (!password.equals(trueControl.getPassword())){
				mav.addObject("error", "密码不对!");
				mav.setViewName("login");
			}
		}
		if (StringUtils.isNotEmpty(tellphone)){
			if (!tellphone.equals(trueControl.getTellphone())){
				mav.addObject("error", "电话号码不对!");
				mav.setViewName("login");
			}
		}
	/*	if (StringUtils.isNotEmpty(DateUtil.formatDate(requestTime))){
			if (!requestTime.equals(trueControl.getRequestTime())){
				mav.addObject("error", "请求时间不对!");
				mav.setViewName("login");
			}
		}*/
		if (StringUtils.isNotEmpty(requestLocation)){
			if (!requestLocation.equals(trueControl.getRequestLocation())){
				mav.addObject("error", "请求地址不对!");
				mav.setViewName("login");
			}
		}
		if (StringUtils.isNotEmpty(identity)){
			if (!identity.equals(trueControl.getIdentity())){
				mav.addObject("error", "身份不对!");
				mav.setViewName("login");
			}
		}
		if (StringUtils.isNotEmpty(password)){
			if (!password.equals(trueControl.getPassword())){
				mav.addObject("error", "密码不对!");
				mav.setViewName("login");
			}
		}
		if (StringUtils.isNotEmpty(work)){
			if (!work.equals(trueControl.getWork())){
				mav.addObject("error", "工作不对!");
				mav.setViewName("login");
			}
		}
		if (StringUtils.isNotEmpty(age)){
			if (!age.equals(trueControl.getAge())){
				mav.addObject("error", "年龄不对!");
				mav.setViewName("login");
			}
		}
		if (StringUtils.isNotEmpty(sex)){
			if (!sex.equals(trueControl.getSex())){
				mav.addObject("error", "性别不对!");
				mav.setViewName("login");
			}
		}
		if (StringUtils.isNotEmpty(nickName)){
			if (!nickName.equals(trueControl.getNickName())){
				mav.addObject("error", "昵称不对!");
				mav.setViewName("login");
			}
		}

		try {
			User user= userService.getUserByLoginUser(controlLogin);
			if(user.getReputation()<0.5||user.getReputation()>1){
				mav.addObject("error", "该用户信誉度太低不能访问!");
			}
			if (user.getReputation()<trueControl.getReputation()){
				mav.addObject("error", "该用户信誉度太低不能访问!");
			}
			mav.setViewName("/admin/main");
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("error", "没有该用户!请重新登录");
			mav.setViewName("a");
		}

		return mav;
		/*try {
			//根据登录表单用户得到系统用户
			User loginUser=userService.getUserByLoginUser(user);
			try {
				Control loginContrl=controlService.getControlByLoginUser(user);
				mav.addObject("user",user);
				mav.setViewName("/admin/main");
				return mav;

			} catch (Exception e) {
				e.printStackTrace();
				mav.addObject("user",user);
				mav.addObject("error", "访问错误,您不能访问!");
				return mav;
			}
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("user",user);
			mav.addObject("error", "系统没有该用户!");
			mav.setViewName("login");
			return mav;
		}*/
	}


}
