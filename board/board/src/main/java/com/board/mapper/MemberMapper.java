package com.board.mapper;

import com.board.model.MemberVO;

public interface MemberMapper {
	//회원가입
	public void memberJoin(MemberVO member);

	//아이디 중복 검사
	public int idCheck(String memberId);
}

