import static JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import BoardDAO;
import Board;
import View;

public class BoardService {

	private BoardDAO bDAO = new BoardDAO();
	
	public ArrayList<Board> selectAll() {
		Connection conn = getConnection();
		ArrayList<Board> list = bDAO.selectAll(conn);
		
		
		return list;
	}

	public int insertBoard(Board b) {
		Connection conn = getConnection();
		int result = bDAO.insertBoard(conn,b);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
	}

	public Board selectOne(int bNo) {
		Connection conn = getConnection();
		Board b = bDAO.selectOne(conn,bNo);
		return b;
	}

	public int updateBoard(int bNo, String column, String update) {
		Connection conn = getConnection();
		int result = bDAO.updateBoard(conn,bNo,column,update);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		return result;
	}

	public int deleteBoard(int bNo) {
		Connection conn = getConnection();
		int result = bDAO.deleteBoard(conn, bNo);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		return result;
	}

}
