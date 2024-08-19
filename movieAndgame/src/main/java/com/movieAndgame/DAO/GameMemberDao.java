package com.movieAndgame.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.movieAndgame.Dto.GameMember;

@Mapper
public interface GameMemberDao {
	
	public int insert(GameMember gameMember);
	
	
	
	public GameMember login(GameMember gameMember);
}
