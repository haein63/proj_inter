package com.homepage.service;

import java.util.List;

import com.homepage.dto.Musical;

public interface MusicalService {
	List<Musical> getCurrentMusicals();

	List<Musical> getPastMusicals();
	
	List<Musical> getFutureMusicals();
	
	List<Musical> getMusicals();
}
