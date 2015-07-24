package com.ksign.service.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ksign.service.member.Member;
import com.ksign.service.member.MemberNotFoundException;
import com.ksign.service.member.MemberService;
import com.ksign.service.member.PasswordMismatchException;




@SessionAttributes("session_member")
@Controller
public class MemberLoginController {
	@Autowired
	MemberService memberService;
	
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam(value="uid")String uid,
						@RequestParam(value="upw")String upw,
						Model memberModel){
		String forwardPath = "";
//		System.out.println("login post");
		try {
			Member member = memberService.login(uid, upw);
			memberModel.addAttribute("session_member", member);
			forwardPath = "redirect:index";
		}
		catch (MemberNotFoundException e) {
			memberModel.addAttribute("memberNotFoundMsg", e.getMessage());
			
			Member failMember = new Member();
			failMember.setUid(uid);
			failMember.setUpw(upw);
			memberModel.addAttribute("fail_member", failMember);
			
//			e.printStackTrace();
			forwardPath = "member/member_login";
		}
		catch (PasswordMismatchException e) {
			memberModel.addAttribute("passwordMismatchMsg", e.getMessage());
			
			Member failMember = new Member();
			failMember.setUid(uid);
			failMember.setUpw(upw);
			memberModel.addAttribute("fail_member", failMember);

			forwardPath = "member/member_login";
//			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return forwardPath;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginForm(){
		return "member/member_login";
	}

}
