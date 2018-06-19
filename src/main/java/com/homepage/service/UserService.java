package com.homepage.service;

import com.homepage.dto.Users;

public interface UserService {
	Users join(Users user);
	Users login(Users user);
	
}
