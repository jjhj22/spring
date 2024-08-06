package com.example.test1.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.test1.dto.BoardDTO;


@Controller
public class BoardController {

	@GetMapping("/board")
	public ModelAndView boardHome() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("board/boardList");
		
		return mav;
				
	}
	@GetMapping("/boardWrite")
	public String board() {
		return "board/write";
	}
	
	@PostMapping("/write")
	public ModelAndView boardwrite(@ModelAttribute BoardDTO boarddto) {
		String btitle = boarddto.getTitle();
		String bwriter = boarddto.getWriter();
		String bcontent = boarddto.getContent();
		String bboardPw = boarddto.getBoardPw();
		ModelAndView mvv=new ModelAndView("board/view");
		mvv.addObject("Btitle",btitle); 
		mvv.addObject("Bwriter",bwriter);
		mvv.addObject("Bcontent",bcontent);
		mvv.addObject("BboardPw",bboardPw);
		return mvv;
	}
}
