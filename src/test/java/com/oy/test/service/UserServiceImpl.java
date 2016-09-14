package com.oy.test.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oy.test.mapper.UserMapper;
import com.oy.test.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
