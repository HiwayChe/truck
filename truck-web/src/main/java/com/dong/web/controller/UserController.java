package com.dong.web.controller;

import com.dong.common.model.User;
import com.dong.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author cheguangai
 * @date 2018/11/25 0025
 */
@Component
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/list")
	public List<User> list(){
		List<User> list = this.userService.list();
		return list;
	}
}
