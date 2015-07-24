package com.ksign.service.member.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksign.service.member.Member;


@Controller
public class MemberLoginCheckController {
	public MemberLoginCheckController() {
		System.out.println("MemberLoginCheckController 생성자");
	}
	
	@RequestMapping(value="/loginCheck", method=RequestMethod.GET)
	public @ResponseBody String loginCheck(HttpSession session) throws JsonProcessingException{
		Member member = (Member)session.getAttribute("session_member");
//		System.out.println("세션에 있는 멤버" + member);
		if(member!=null){
			ObjectMapper mapper = new ObjectMapper();
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("uid", member.getUid());
//			System.out.println(mapper.writeValueAsString(map));
			return mapper.writeValueAsString(map);
		}
		
		return "{\"uid\" : \"nolog\"}";
	}
}
