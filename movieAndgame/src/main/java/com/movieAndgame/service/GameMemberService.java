package com.movieAndgame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieAndgame.DAO.GameMemberDao;
import com.movieAndgame.DAO.GameMemberDaoImpl;
import com.movieAndgame.Dto.GameMember;
import com.movieAndgame.Dto.GameMemberLogin;

@Service
public class GameMemberService {
	@Autowired
	private GameMemberDaoImpl gameMemberDao;
	
	public GameMember login(GameMemberLogin gameMemberDto) {
		
		return gameMemberDao.login(gameMemberDto);
	}
	
	public boolean joinSave(GameMember gameMemberDto) {
		
		
		List<String> emailList = gameMemberDao.findAllEmail();
		
		if( emailList.contains( gameMemberDto.getEmail()) )
			return true;
		
		
		
		
		gameMemberDao.insert(gameMemberDto);
		
		
		return false;
	}
}