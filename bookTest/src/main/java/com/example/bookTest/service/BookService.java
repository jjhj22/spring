package com.example.bookTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookTest.Dao.BookDAO;
import com.example.bookTest.Dto.bookDto;

@Service
public class BookService {
	private final BookDAO bookDao;
	
	@Autowired
	public BookService(BookDAO bookDAO) {
		this.bookDao=bookDAO;
	}
	
	//도서정보 데이터베이스에서 가져와서 list에 저장되어 있는거 받아서
	//control에게 넘겨주기
	public List<bookDto> selectAll(){
		return bookDao.select();
	}
	
	//도서정보 저장
	public void bookSave(bookDto bookDto) {
		
		if(bookDto != null) {
			//도서 코드가 이미 데이터베이스에 저장 되어있는지 확인 후 저장
			bookDao.insert(bookDto); // DAO 클래스의 insert메서드 실행해서 저장
		}
		
	}
}
