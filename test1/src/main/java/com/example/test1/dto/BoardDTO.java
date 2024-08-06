package com.example.test1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	private String title;
	private String writer;
	private String content;
	private String boardPw;
}
