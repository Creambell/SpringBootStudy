import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import MemberDAO;
import Member;

import common.JDBCTemplate;

public class MemberService {

	
	/*
	 * service가 하는 일
	 * 	1) Controller로부터 인자 전달 받음
	 * 	2) Connection객체 생성(from JDBCTemplate)
	 *  3) DAO객체생성
	 *  4) DAO에 Connection객체와 Controller한테 전달받은 인자 전달
	 *  5) DAO에 수행 결과를 가지고 비즈니스 로직 및 트랜젝션 관리
	 * 
	 */
	private MemberDAO mDAO = new MemberDAO();
	
	public int insertMember(Member m) {
		Connection conn = JDBCTemplate.getConnection();
		//JDBCTemplate도 생략하고싶다면 import static common.메소드() 해주면됩니다.
		int result = mDAO.insertMember(conn,m);
		//트랜잭션 처리
		if(result > 0) {
//			JDBCTemplate.commit(conn); 임포트참조
			commit(conn);
		}else {
//			JDBCTemplate.rollback(conn); 임포트참조
			rollback(conn);
		}
		return result;
	}

	public ArrayList<Member> selectAll() {
		Connection conn = getConnection(); // JDBCTemplate 임포트에 의해 생략됨.
		ArrayList<Member> list = mDAO.selectAll(conn);
		return list;
		
	}

	public ArrayList<Member> selectMemberId(String id) { // 서비스가 하는일 참고
		Connection conn = getConnection();
		ArrayList<Member> list = mDAO.selectMemberId(conn,id);
		return list;
	}

	public ArrayList<Member> selectGender(char gen) { // 1번
		Connection conn = getConnection(); //2번
		ArrayList<Member> list = mDAO.selectGender(conn,gen); // 3,4번
		return list; // 여기에서 list는 dao의 list입니다.
	}

	public int checkMember(String memberId) {
		Connection conn = getConnection();
		int result = mDAO.checkMember(conn,memberId);
		return result;
	}

	public int updateMember(String memberId, String update, String input) {
		Connection conn = getConnection();
		int result = mDAO.updateMember(conn,memberId,update,input);
		if(result > 0 ) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}

	public void deleteMember(String memberId) {
		
		
	}
	
	
	
	
	
	

}
