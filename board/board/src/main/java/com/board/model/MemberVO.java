package com.board.model;

/*
create table board_member(
memeberId varchar(50) primary key,
memperPw varchar(50) not null,
memberName varchar(30) not null,
memeberMail varchar(50) not null,
regDate date not null
);
 */

public class MemberVO {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberMail;
	private int regDate;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberMail() {
		return memberMail;
	}
	public void setMemberMail(String memberMail) {
		this.memberMail = memberMail;
	}
	public int getRegDate() {
		return regDate;
	}
	public void setRegDate(int regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName
				+ ", memberMail=" + memberMail + ", regDate=" + regDate + "]";
	}
	
	
}
