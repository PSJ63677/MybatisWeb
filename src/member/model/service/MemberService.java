package member.model.service;

import java.util.List;

import member.model.vo.Member;
import member.model.vo.PageData;

public interface MemberService {
	
	/**
	 * 멤버 등록 Service
	 * @param mOne
	 */
	public int registerMember(Member mOne);
	
	/**
	 * 멤버 정보 수정 Service
	 * @param member
	 * @return
	 */
	public int modifyMember(Member member);

	/**
	 * 멤버 삭제 Service
	 * @param memberId
	 * @return
	 */
	public int deleteMember(String memberId);
	
	/**
	 * 전체회원 목록 조회 Service
	 * @param currntPage
	 * @return List<Member>
	 */
	public PageData selectAllMembers(int currntPage);
	
	/**
	 * 아이디로 회원 조회 Service
	 * @param memberId
	 * @return
	 */
	public Member selectOneById(String memberId);
	
	/**
	 * 멤버 로그인 Service
	 * @param member
	 * @return Member
	 */
	public Member checkMemberLogin(Member member);
}
