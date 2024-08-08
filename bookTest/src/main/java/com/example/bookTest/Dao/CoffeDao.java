package com.example.bookTest.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bookTest.Dto.CoffeDto;

@Repository
public class CoffeDao {
	
	private final JdbcTemplate db;
	
	@Autowired
	public CoffeDao(JdbcTemplate jdbc) {
		this.db = jdbc;
	}
	
	public List<CoffeDto> select(){
		String sql="select *from coffe";
		List<CoffeDto>list=db.query(sql, new CoffeDtoRowMapper());
		return list;
	}

	public void insert(CoffeDto coffeDto) {
		// TODO Auto-generated method stub
		String sql="insert into coffe(item_name,"
				+ " price, decaffein) values(?,?,?)";		
		db.update(sql, coffeDto.getItemName(), coffeDto.getPrice(), coffeDto.getDecaffein());
	}
	
	public class CoffeDtoRowMapper implements RowMapper<CoffeDto>{

		@Override
		public CoffeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			CoffeDto coffedto = new CoffeDto();
			coffedto.setDecaffein(rs.getInt("decaffein"));
			coffedto.setItemName(rs.getString("item_name"));
			coffedto.setPrice(rs.getInt("price"));
			return coffedto;
		}
		
	}
}