package com.homepage.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.homepage.dao.UserDao;
import com.homepage.dto.Users;
@Service
public class UserServiceImpl implements UserService{
	private static Logger mylog = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserDao mDao;
	
	@Override
	@Transactional
	public Users join(Users member) {
		Users user = null;
		try {
			user = mDao.join(member);
		}catch(Exception e) {
			mylog.error("회원 가입 실패: ", e);
		}
		mylog.trace("축하합니다. 회원 가입 성공!");
		return user;
	}
}
