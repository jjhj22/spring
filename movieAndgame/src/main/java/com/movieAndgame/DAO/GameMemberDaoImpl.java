package com.movieAndgame.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.movieAndgame.Dto.GameMember;
import com.movieAndgame.Dto.GameMemberLogin;

@Mapper
public interface GameMemberDaoImpl {
	public int insert(GameMember gameMemberDto);
	public GameMember login(GameMemberLogin gameMemberLogin);// 로그인
	public List<String> findAllEmail();
}