package com.dong.common.service.impl;

import com.dong.common.dao.UserMapper;
import com.dong.common.model.User;
import com.dong.common.model.UserExample;
import com.dong.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cheguangai
 * @date 2018/11/25 0025
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> list() {
		return this.userMapper.selectByExample(new UserExample());
	}
}
