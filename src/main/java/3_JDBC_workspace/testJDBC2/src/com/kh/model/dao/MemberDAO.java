import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Member;

public class MemberDAO {
	/*
	 * 이전 프로젝트에서 DAO가 맡은 업무
	 * 		1)JDBC드라이버 등록
	 * 		2)DB 연결 및 Connection 객체 생성
	 * 		3)SQL 실행
	 *		4)처리 결과에 따른 트랜잭션 처리
	 *		5)자원 반환
	 *
	 * 실제로 DAO가 처리해야하는 업무는 SQL문을 DB로 전달하고 반환 값을 받아오는 
	 * 3번의 역할만 있음 -> 1,2,4,5번 분리
	 * ->공통적으로 이루어지는 업무(공통적업무를 해주는 템플릿)
	 * JDBCTemplate은 그냥 모아둔거고
	 * 그걸 사용하기위한 DAO보조를 위한 서비스 패키지를 생성합니다.
	 * 뷰-컨트롤러-서비스(보조)-dao-db 순서
	 */

	public int insertMember(Connection conn, Member m) {
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String query = "insert into Member values(?,?,?,?,?,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberId());
			pstmt.setString(2, m.getMemberPwd());
			pstmt.setString(3, m.getMemberName());
			pstmt.setString(4, m.getGender()+"");
			pstmt.setString(5, m.getEmail());
			pstmt.setString(6, m.getPhone());
			pstmt.setString(7, m.getAddress());
			pstmt.setInt(8, m.getAge());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt); // JDBCT..에서 클로즈를 만들어놨습니다.
			//import에서 close참조문을 써주어서 앞부분을 지워도 오류가 안생깁니다.
		}
		return result;
	}

	public ArrayList<Member> selectAll(Connection conn) {
		String query = "select * from member"; // 전체 조회
		ArrayList<Member> list = new ArrayList<Member>();
		Statement stmt = null;
		ResultSet rset = null;
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			// 셀렉문 받아오는 exeQuery에 셀렉문이기에 resultset
			while(rset.next()) {
				String memberId = rset.getString("member_id");
				String memberPwd = rset.getString("member_pwd");
				String memberName =rset.getString("member_name");
				char gender = rset.getString("gender").charAt(0);
				String email = rset.getString("email");
				String phone = rset.getString("phone");
				String address = rset.getString("address");
				int age = rset.getInt("age");
				Date enrollDate = rset.getDate("enroll_date");
				
				Member mem = new Member(memberId, memberPwd, memberName, gender, email, phone, age, address, enrollDate);
				list.add(mem);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset); // 템플릿에 만들어놓은것을 가져다 씁니다.
			close(stmt);
		}
		return list;
	}

	public ArrayList<Member> selectMemberId(Connection conn, String id) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> list = new ArrayList<Member>();
//		String query = "select * from Member where Member_Id Like '%?%' "; // %+ id +% 완성형쿼리
		String query = "select * from Member where Member_Id Like ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%"+id+"%");
			rset = pstmt.executeQuery();
			while(rset.next()) {
				String memberId = rset.getString("member_id");
				String memberPwd = rset.getString("member_pwd");
				String memberName =rset.getString("member_name");
				char gender = rset.getString("gender").charAt(0);
				String email = rset.getString("email");
				String phone = rset.getString("phone");
				String address = rset.getString("address");
				int age = rset.getInt("age");
				Date enrollDate = rset.getDate("enroll_date");
				
				Member mem = new Member(memberId, memberPwd, memberName, gender, email, phone, age, address, enrollDate);
				list.add(mem);
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
			return list;
	}

	public ArrayList<Member> selectGender(Connection conn, char gen) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> list = new ArrayList<Member>();
		try {
			String query = "select * from member where gender = ? ";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, gen+"");
			rset = pstmt.executeQuery();
		while(rset.next()) {
			String memberId = rset.getString("member_id");
			String memberPwd = rset.getString("member_pwd");
			String memberName =rset.getString("member_name");
			char gender = rset.getString("gender").charAt(0);
			String email = rset.getString("email");
			String phone = rset.getString("phone");
			String address = rset.getString("address");
			int age = rset.getInt("age");
			Date enrollDate = rset.getDate("enroll_date");
			
			Member mgen = new Member(memberId, memberPwd, memberName, gender, email, phone, age, address, enrollDate);
			list.add(mgen);
		}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

	public int checkMember(Connection conn, String memberId) {
		String query = "select count(*) from member where member_id = ?";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rset = pstmt.executeQuery();
		if(rset.next()) { // next를 해야 다음행을 갈수있다.
			result = rset.getInt(1); // 넘버타입을 인트로 가져왔습니다.
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return result;
	}

	public int updateMember(Connection conn, String memberId, String update, String input) {
		String query ="update member set "+update+" = ? where member_id = ? ";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, update); // 싱글컷텐션이 자동으로 들어가서 리터럴이 됩니다.
			pstmt.setString(1, input);
			pstmt.setString(2, memberId);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	
	
	
	
	
	
}
