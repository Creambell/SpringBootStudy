import static JDBCTemplate.getConnection;
import static JDBCTemplate.close;
import java.sql.Connection;

import MemberDAO;
import Member;

public class MemberService {
	
	private MemberDAO mDAO = new MemberDAO();

	public Member login(Member mem) { // select문 쓸거라서 커밋롤백은 안써요.
		Connection conn = getConnection();
		Member m = mDAO.login(conn,mem);
		return m;
	}

	public void exitProgram() {
		close(getConnection());
	}

}
