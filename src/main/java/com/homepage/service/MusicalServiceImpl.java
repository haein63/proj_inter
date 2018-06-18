package com.homepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homepage.dao.MusicalDao;
import com.homepage.dto.Musical;

@Service
public class MusicalServiceImpl implements MusicalService {

	@Autowired
	MusicalDao mDao;

	@Override
	public List<Musical> getCurrentMusicals() {
		List<Musical> result = mDao.getCurrentMusicals();
		return result;
	}

	@Override
	public List<Musical> getPastMusicals() {
		List<Musical> result = mDao.getPastMusicals();
		return result;
	}

	@Override
	public List<Musical> getFutureMusicals() {
		List<Musical> result = mDao.getFutureMusicals();
		return result;
	}

	@Override
	public List<Musical> getMusicals(String title) {
		List<Musical> result = mDao.getMusicals(title);
		return result;
	}

}
