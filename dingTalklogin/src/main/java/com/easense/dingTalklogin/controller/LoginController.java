package com.easense.dingTalklogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.easense.dingTalklogin.bean.BaseUser;
import com.easense.dingTalklogin.service.impl.BaseUserImplService;

@Controller
public class LoginController {
	
	@Autowired
	private BaseUserImplService baseUserImplService;
	
	@RequestMapping("/index")
	public @ResponseBody List<BaseUser> login() {
		return baseUserImplService.selectAll();
	}
}
