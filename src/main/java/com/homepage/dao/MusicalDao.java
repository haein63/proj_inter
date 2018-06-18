package com.homepage.dao;

import java.util.List;

import com.homepage.dto.Musical;

public interface MusicalDao {
	List<Musical> getCurrentMusicals();

	List<Musical> getPastMusicals();
	
	List<Musical> getFutureMusicals();
	
	List<Musical> getMusicals(String title);
	
	int currentMusicalCnt();
}