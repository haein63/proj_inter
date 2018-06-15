package com.homepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.MusicalDao;
import com.homepage.dto.Musical;

@Service
public class MusicalServiceImpl implements MusicalService{

	@Autowired
	MusicalDao mDao;
	
	@Override
	public List<Musical> getCurrentMusicals() {
	
		return null;
	}

	@Override
	public List<Musical> getPastMusicals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Musical> getFutureMusicals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Musical> getMusicals() {
		// TODO Auto-generated method stub
		return null;
	}

}
