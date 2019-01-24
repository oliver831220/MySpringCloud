package com.hyy.invo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hyy.invo.dao.UserMapper;
import com.hyy.invo.domain.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> getUser() {
		return userMapper.getUser();
	}

	@Transactional(rollbackFor = Exception.class)
	public int insert(User user) throws Exception {

		int rs = userMapper.insert(user);

		return rs;
	}
}
