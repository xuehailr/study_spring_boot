package com.lr.study.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lr.study.boot.common.Response;
import com.lr.study.boot.service.WxUserService;
@RestController
@RequestMapping("/wxcust")
public class UserController {
	
	@Autowired
	private WxUserService wxUserService;
	
	@RequestMapping("/login")
	public Response Login(Long account,String password){
		return wxUserService.validateUser(account, password);
	}
}
