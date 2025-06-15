import static JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Board;

public class BoardDAO {

	public ArrayList<Board> selectAll(Connection conn) {
		String query="select * from board where delete_yn = 'N'";
		ArrayList<Board> list = new ArrayList<Board>();
		Statement stmt = null;
		ResultSet rset = null;
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()) { // 한번 더 확인
				Board b = new Board(rset.getInt("bNo"),
									rset.getString("title"),
									rset.getString("content"),
									rset.getDate("create_date"),
									rset.getString("writer"));
				list.add(b);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		
		
		
		return list;
	}

	public int insertBoard(Connection conn, Board b) {
		String query ="insert into board values(seq_board.nextval,?,?,sysdate,?,'N')";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setString(3, b.getWriter());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public Board selectOne(Connection conn, int bNo) {
		// 05-10 JDBC3
		String query = "select * from board where bNo = ? and delete_yn = 'N'";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Board b = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bNo);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				b = new Board(
			rset.getInt("bNo"),
			rset.getString("title"),
			rset.getString("content"),
			rset.getDate("create_date"),
			rset.getString("writer"));
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return b;
		
	}

	public int updateBoard(Connection conn, int bNo, String column, String update) {
		String query = "update board set "+ column + "=? where bNo = ?";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, update);
			pstmt.setInt(2, bNo);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int deleteBoard(Connection conn, int bNo) {
		String query = "update board set delete_yn = 'Y' where bNo = " + bNo;
		
		Statement stmt = null;
		int result = 0;
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
		}
		return result;
	}
}
