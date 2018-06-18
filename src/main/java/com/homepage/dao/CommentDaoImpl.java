package com.homepage.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.homepage.dto.Comments;
@Repository
public class CommentDaoImpl implements CommentDao {
	private final String ns = "com.homepage.dto.Comments.";

	@Autowired
	SqlSessionTemplate session;

	@Override
	public void insertCmt(Comments comments) {
		System.out.println("dao>>>>>>"+comments.toString());
		session.insert("insertCmt",comments);
	}

	@Override
	public int deleteCmt(int commentNo) {
		String statement = ns + "delete";

		int result = session.delete(statement, commentNo);
		if (result == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	

}
