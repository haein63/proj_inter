package com.homepage.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homepage.dto.Users;

@Repository
public class UserDaoImpl implements UserDao{
	private final String ns = "com.homepage.dto.Users.";
	
	@Autowired
	SqlSessionTemplate session;

	@Override
	public Users join(Users user) {
		String statement = ns+"join";
		int result = session.insert(statement, user);
		if(result==1) {
			return user;
		}else {
			return null;
		}
	}

	@Override
	public Users login(Users user) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
