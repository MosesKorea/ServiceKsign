package com.ksign.service.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ksign.service.member.ExistedMemberException;
import com.ksign.service.member.Member;
import com.ksign.service.member.MemberService;


@Controller
public class MemberIdCheckController {
	@Autowired
	MemberService memberService;
	
	public MemberIdCheckController() {
		System.out.println("###MemberIdCheckController 생성자");
	}
	
	@RequestMapping(value="/memberIdCheck",method=RequestMethod.GET,produces="text/plain;charset=utf-8")
	public @ResponseBody String idCheck(@RequestParam(value="uid") String uid) throws Exception{
//		System.out.println("idCheck() 실행 member_id = "+member_id);
		String msg ="";
		try {
			boolean existedMember = memberService.existedMember(uid);
			if(existedMember==false){
				msg = "사용가능한 아이디입니다.";
				return msg;
			}
		} catch (ExistedMemberException e) {
			msg = e.getMessage();
		}
		
		return msg;
	}
	
	@RequestMapping(value="/isLogin",method=RequestMethod.GET,produces="text/plain;charset=utf-8")
	public @ResponseBody String isLogin(HttpSession session){
		//로그인 아니면 index로
		System.out.println("MemberIdCheckController isLogin 실행");
		Member member = (Member)session.getAttribute("session_member");
		System.out.println(member);
		if(member==null){
			return "NoLogin";
		}

		return "Login";
	}
}
