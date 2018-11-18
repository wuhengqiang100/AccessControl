package com.java1234.controller;

import com.java1234.entity.Control;
import com.java1234.service.ControlService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/login")
public class LoginController {


	@Resource
	private ControlService controlService;

	/**
	 * 获得所有请求的信息.初始化
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/init")
	public String save(HttpServletRequest request, HttpSession session) throws Exception {
		JSONObject result=new JSONObject();
		List<Control> controlList=controlService.getControlAll();
//		List<String> requestAimList=new ArrayList<String>();
		session.setAttribute("controList",controlList);
		if (controlList.size()>0){
			result.put("success",true);
			result.put("controList",controlList);
		}else{
			request.setAttribute("errorInfo", "没有请求信息!");
		}
		return null;
	}


}
