package com.homepage.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homepage.dto.Musical;

@Repository
public class MusicalImpl implements MusicalDao{
	private final String ns = "com.homepage.dto.Musical.";
	
	@Autowired
	SqlSessionTemplate session;

	@Override
	public List<Musical> getCurrentMusicals() {
		String statement = ns+"getCurrentMusicals";
		return session.selectList(statement);
	}

	@Override
	public List<Musical> getPastMusicals() {
		String statement = ns+"getPastMusicals";
		return session.selectList(statement);
	}

	@Override
	public List<Musical> getFutureMusicals() {
		String statement = ns+"getFutureMusicals";
		return session.selectList(statement);
	}

	@Override
	public List<Musical> getMusicals() {
		String statement = ns+"getMusicals";
		return session.selectList(statement);
	}

	
	}
	

	


