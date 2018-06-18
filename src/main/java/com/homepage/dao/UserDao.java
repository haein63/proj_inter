package com.homepage.dao;

import com.homepage.dto.Users;

public interface UserDao {
	Users join(Users user);
	Users login(Users user);
	
}
