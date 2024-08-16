package com.movieAndgame.control;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieAndgame.Dto.GameMember;

import com.movieAndgame.service.GameMemberService;

@Controller
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	private GameMemberService gameMemberService;
	
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
		boolean isDup = gameMemberService.signUpSave(gameMember);
		if(isDup) {
			bindingResult.rejectValue("email", "error.email", "가입된 이메일입니다");
			return "game/member/join";
		}
		gameMemberService.signUpSave(gameMember);
		
		return "redirect:login";
	}
	
	@PostMapping("/signIn")
	public String signIn(GameMember gameMember, HttpSession session
			,Model model) {
		GameMember user = gameMemberService.login(gameMember);
		if(user==null) {
			model.addAttribute("member", gameMember);
			model.addAttribute("fail","<script> alert('이메일 또는 비밀번호가 잘못되었습니다');</script>");
			return "game/member/login";
		}
		session.setAttribute("user", user);
		
		return "redirect:/game/index";
	}
	
}
