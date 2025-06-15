import static JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Member;

public class MemberDAO {

	public Member login(Connection conn, Member mem) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member m = null;
		
		
		String query = "select * from Member where member_id =? and member_PWD = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mem.getMemberId());
			pstmt.setString(2, mem.getMemberPwd());
			rset = pstmt.executeQuery();
			if(rset.next()) {
				m = new Member(rset.getString("member_id"),
							   rset.getString("member_pwd"),
							   rset.getString("member_name"),
							   rset.getString("gender").charAt(0),
							   rset.getString("email"),
							   rset.getString("phone"),
							   rset.getInt("age"),
							   rset.getString("address"),
							   rset.getDate("enroll_date"));
//String memberId,String memberPwd,String memberName,
//			char gender,String email
//			,String phone,int age,String address,
//			Date enrollDate
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return m;
	}

}
