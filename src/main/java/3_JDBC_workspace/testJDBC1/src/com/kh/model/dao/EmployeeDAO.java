import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Employee;

public class EmployeeDAO {

	public ArrayList<Employee> selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		try {
			// 0. Class.forName()을 이용한 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//1. DriverManager.getConnection()을 통한 데이터베이스 계정 연결
			//jdbc:oracle:thin:-드라이버 설명 -@127.0.0.1 무조건 내 컴퓨터 주소  - 나의 오라클 포트번호
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "SCOTT", "SCOTT");
			
			// 2 . 쿼리 작성
			String query = "select * from emp"; // 쿼리 뒤에 세미콜론 x
			
			// 3 . 쿼리를 전달할 Statement객체 생성
			stmt = conn.createStatement();
			// 커넥션안에 크리에이트스테이먼트를 만드는 스테이먼트
			rset = stmt.executeQuery(query); // 쿼리를 보내주기위한 리절트 셋반환
			
			while(rset.next()) { // 다음 값이 있으면 다음 행을 가져옴
				int empNo = rset.getInt("empno");
				String empName = rset.getString("ENAME");
				String job = rset.getString("JOB");
				int mgr = rset.getInt("mgr");
				Date hireDate = rset.getDate("hireDate");
				int sal = rset.getInt("sal");
				int comm = rset.getInt("comm");
				int deptNo = rset.getInt("deptNo");
				//null은 기본자료형에 없고 참조자료형에만 있어서  null값은 기본형으로 바뀝니다.
				// 이 부분은 int라 0이 됩니다.
				
				Employee e = new Employee(empNo,empName,job,mgr,hireDate,sal,comm,deptNo);
				list.add(e);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public Employee selectEmployee(int empNo) {
		Employee emp = null;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","SCOTT");
			//쿼리는 스트링타입
			String query = "select * from emp where empno = "+ empNo;
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				int eNo = rset.getInt("empNo");
				String empName = rset.getString("ename");
				String job = rset.getString("job");
				int mgr = rset.getInt("mgr");
				Date hireDate = rset.getDate("hireDate");
				int sal = rset.getInt("sal");
				int comm = rset.getInt("comm");
				int deptNo = rset.getInt("deptNo");
				
				emp = new Employee(eNo,empName,job,mgr,hireDate,sal,comm,deptNo);
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return emp;
	}
	
	public Employee selectEmployeePS(int empNo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		Employee emp = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","SCOTT");
			//쿼리는 스트링타입
			String query = "select * from emp where empno = ?";// <-이거 ?가 아니라 위치홀더라캄
			
//			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,empNo);
			//setint의 첫번째는 몇번쨰 인자에 집어넣을지 정함,2는 어떤 값을 넣을지 결정
			
			
			
//			rset = stmt.executeQuery(query);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				int eNo = rset.getInt("empNo");
				String empName = rset.getString("ename");
				String job = rset.getString("job");
				int mgr = rset.getInt("mgr");
				Date hireDate = rset.getDate("hireDate");
				int sal = rset.getInt("sal");
				int comm = rset.getInt("comm");
				int deptNo = rset.getInt("deptNo");
				
				emp = new Employee(eNo,empName,job,mgr,hireDate,sal,comm,deptNo);
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return emp;
	}

	public int insertEmployee(Employee e) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","SCOTT","SCOTT");
			conn.setAutoCommit(false);
			
//			String query = "insert into emp values(" + e.getEmpNo()+ "," + e.getEmpName() + "," + e.getJob()
//			 + "," + e.getMgr() + ", sysdate," + e.getSal() + ","
//			 + e.getComm() + "," + e.getDeptNo() + ")";
			// 완성형 문장이지만 실수가 생길수도있고 한눈에 보기 어렵다 그래서 미완성문장으로
			// 인자가 많으니 비완성형인 preparedStatement를 쓰는게 더 좋아요
			String query = "insert into emp values(?,?,?,?,sysdate,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,e.getEmpNo()); // 1
			pstmt.setString(2, e.getEmpName()); // 2번째 자리에 넣습니다.
			pstmt.setString(3, e.getJob());
			pstmt.setInt(4,e.getMgr());
			pstmt.setInt(5,e.getSal());
			pstmt.setInt(6,e.getComm());
			pstmt.setInt(7, e.getDeptNo());
			
			result = pstmt.executeUpdate(); // execute...의 반환타입이 int
	// result가 성공했는지 실패했는지 알기위해서, 그걸 알기위해서 반환합니다.
			// 근데 이해가 안됌 더 봐야함.
			if(result > 0) {
				conn.commit(); // 커밋과 롤백을 해줘야합니다.
			}else {
				conn.rollback(); // 커밋,롤백도 SQLException을 throws하고 있습니다.
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return result;
	}

	public int updateEmployee(Employee emp) {
		Connection conn = null;
		PreparedStatement ptmt = null;
		int rset = 0;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","SCOTT","SCOTT");
			conn.setAutoCommit(false);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String query = "UPDATE emp SET JOB =?,SAL =?, COMM =? where empno=?";
	// 완성문 제작 방식 
	//String query = "UPDATE EMP SET job = 
//			'" + emp.getJob()+"',sal =""+emp.getSal()+,
//					"comm ="+emp.getComm()+"
//					"where empno = "+emp.getEmpno();
			ptmt = conn.prepareStatement(query);
			ptmt.setString(1, emp.getJob());
			ptmt.setInt(2, emp.getSal());
			ptmt.setInt(3, emp.getComm());
			ptmt.setInt(4, emp.getEmpNo());
			
			rset = ptmt.executeUpdate();
			
			if(rset >0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ptmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rset;
	}

	public int deleteEmployee(int empNo) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		int result = 0;
		try {
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","SCOTT","SCOTT");
			conn.setAutoCommit(false);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String query = "delete from emp where empNo =?";
			pstmt = conn.prepareStatement(query);
	//stmt = conn.createStatement();		
			pstmt.setInt(1, empNo);
			
			result = pstmt.executeUpdate();
	//result = stmt.executeUpdate(query);
			if(result >0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	
	
	
	
}


