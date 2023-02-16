package member.model.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import member.model.vo.Member;
import member.model.vo.Pagination;

public interface MemberStore {
	
	/**
	 * 멤버 등록 Store
	 * @param session
	 * @param member
	 * @return int
	 */
	public int insertMember(SqlSession session, Member member);
	
	/**
	 * 회원 정보 수정 Store
	 * @param session
	 * @param member
	 * @return
	 */
	public int updateMember(SqlSession session, Member member);
	
	/**
	 * 멤버 삭제 Store
	 * @param session
	 * @param memberId
	 * @return
	 */
	public int deleteMember(SqlSession session, String memberId);
	
	/**
	 * 전체 회원 정보 조회 Store
	 * @param session
	 * @return
	 */
	public List<Member> selectAllMembers(SqlSession session, Pagination pn);
	
	/**
	 * 아이디로 회원 조회 Store
	 * @param memberId
	 * @return
	 */
	public Member selectOneById(SqlSession session, String memberId);
	
	/**
	 * 멤버 로그인 Store
	 * @param member
	 * @return Member
	 */
	public Member checkMemberLogin(SqlSession session, Member member);
	
	/**
	 * 페이지 네비 생성 Store
	 * @param session
	 * @param currentPage
	 * @return
	 */
	public String generateNavi(SqlSession session, int currentPage);
	
	/**
	 * 전체 회원의 수 Store
	 * @param session
	 * @return
	 */
	public int getTotalCount(SqlSession session);
	
}
