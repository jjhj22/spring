package com.movieAndgame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieAndgame.DAO.GameMemberDao;
import com.movieAndgame.Dto.GameMember;

@Service
public class GameMemberService {
	
	@Autowired
	private GameMemberDao gameMemberDao;
	
	//회원가입 데이터베이스 저장
	public void signUpSave(GameMember gameMember) {
		gameMemberDao.insert(gameMember);
	}
	
}
