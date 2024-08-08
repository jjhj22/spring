package com.example.bookTest.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bookTest.Dto.bookDto;

@Repository
public class BookDAO {
	
	private final JdbcTemplate jt;
	
	@Autowired
	public BookDAO(JdbcTemplate jdbcTemplate) {
		this.jt = jdbcTemplate;
	}
	
	//book 테이블 전체 데이터 가져오기 - 첫화면에 목록으로 출력하기 위해
	public List<bookDto> select(){
		String sql="select *from book";
		List<bookDto>list=jt.query(sql, new BookDtoRowMapper());
		return list;
	}
	public void insert(bookDto bookDto) { // 도서정보 데이터베이스에 저장
		String sql="insert into book(book_title, book_author, "+
					"book_cost, book_page, publisher) values(?,?,?,?,?)";
		
		jt.update(sql, bookDto.getBookTitle(), bookDto.getBookAuthor(), bookDto.getBookCost(),
				bookDto.getBookPage(), bookDto.getPublisher());
		
	}
	
	public class BookDtoRowMapper implements RowMapper<bookDto>{

		@Override
		public bookDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			bookDto bookdto = new bookDto();
			bookdto.setBookAuthor(rs.getString("book_author"));
			bookdto.setBookCost(rs.getInt("book_cost"));
			bookdto.setBookPage(rs.getInt("book_page"));
			bookdto.setBookTitle(rs.getString("book_title"));
			bookdto.setPublisher(rs.getString("publisher"));
			bookdto.setBookId(rs.getInt("book_id"));
			return bookdto;
			
		}
		
	}
}
