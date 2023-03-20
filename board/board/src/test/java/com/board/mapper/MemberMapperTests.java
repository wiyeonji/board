package com.board.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper membermapper; //MemberMapper.java �씤�꽣�럹�씠�뒪 �쓽議댁꽦 二쇱엯
	
	/*
	@Test
	public void memberJoin() throws Exception{
		MemberVO member = new MemberVO();
		
		member.setMemberId("spring_test1"); //�븘�씠�뵒
		member.setMemberPw("spring_test"); //鍮꾨�踰덊샇
		member.setMemberName("spring_test"); //�씠由�
		member.setMemberMail("spring_test"); //硫붿씪
		
		membermapper.memberJoin(member);
	}
	 */
	//아이디 중복 검사
	@Test
	public void memberIdChe() throws Exception{
		String id = "asdf"; //존재하는 아이디
		String id2 = "test1234"; //존재하지 않는 아이디
		membermapper.idCheck(id);
		membermapper.idCheck(id2);
	}
	
}
