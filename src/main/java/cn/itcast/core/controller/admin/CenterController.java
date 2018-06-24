package cn.itcast.core.controller.admin;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.bean.TestTb;


/**
 * 后台管理
 * 测试
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/control")
public class CenterController {
	//第一个springmvc
	@RequestMapping(value="/test/springmvc.do")
	public String test(TestTb testTb,ModelMap model) {
		
		System.out.println(testTb);
		return "success";
	}
	
//	@InitBinder
//	public void initBinder(ServletRequestDataBinder binder,HttpServletRequest request) {
//		
//		//转换日期格式
//		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,true));
//	}

	//跳转入口页面
	@RequestMapping(value="/index.do")
	public String index() {
		
		return"/index";
	}
	
	//跳转入口页面
	@RequestMapping(value="/top.do")
	public String top() {
			
		return"/top";
	}
		
	//跳转主页面
	@RequestMapping(value="/main.do")
	public String main() {
			
		return"/main";
	}
		
	//跳转左页面
	@RequestMapping(value="/left.do")
	public String left() {
			
		return"/left";
	}
		
	//跳转页面右
	@RequestMapping(value="/right.do")
	public String right() {
			
		return"/right";
	}
	
}
