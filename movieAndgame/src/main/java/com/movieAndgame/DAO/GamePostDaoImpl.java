package com.movieAndgame.DAO;


import org.apache.ibatis.annotations.Mapper;

import com.movieAndgame.Dto.GamePostDto;

@Mapper
public interface GamePostDaoImpl {

	public int save(GamePostDto gamePostDto);

}