package com.homepage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.homepage.dto.Users;

public interface UserDao {
	Users join(Users user);
	Users login(Users user);
	
}
