package com.board.mapper;

import com.board.model.MemberVO;

public interface MemberMapper {
	//ȸ������
	public void memberJoin(MemberVO member);

	//���̵� �ߺ� �˻�
	public int idCheck(String memberId);
}

