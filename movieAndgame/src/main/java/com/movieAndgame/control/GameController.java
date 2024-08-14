package com.movieAndgame.control;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieAndgame.Dto.GameMember;
import com.movieAndgame.Dto.MovieMember;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@GetMapping("/index")
	public String Home(Model model) {
		
		return "game/index";
	}
	
	@GetMapping("/login")
	public String loginHome(Model model) {
		
		model.addAttribute("member", new GameMember());
		
		return "game/member/login";
	}
	
	@GetMapping("/signUp")
	public String memberShip(Model model) {
		model.addAttribute("memberShip", new GameMember());
		
		return "game/member/join";
	}
	
	
	// 회원가입 작성 후
	@PostMapping("/signUp")
	public String signup(@Valid GameMember gameMember, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			System.out.println("유효하지 않은값이 입력되었다");
			
			return "game/member/join";
		}
		return "redirect:login";
	}
}
