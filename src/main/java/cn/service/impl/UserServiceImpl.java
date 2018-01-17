package cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.entity.User;
import cn.mapper.UserMapper;
import cn.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectUserInfo(String userName) {
		// TODO Auto-generated method stub
		return userMapper.selectUserInfo(userName);
	}

}
