import java.util.ArrayList;

import EmployeeDAO;
import Employee;
import Menu;

public class EmployeeController {
	
	private EmployeeDAO empDAO = new EmployeeDAO();
	// 뷰로 돌아갈 객체 생성
	private Menu menu = new Menu();
	// 전체 사원 정보 조회
	public void selectAll() {
		ArrayList<Employee> list = empDAO.selectAll();
		
		if(!list.isEmpty()) {
			menu.selectAll(list);
		}else {
			menu.displayError("조회 결과가 없습니다.");
		}
	}
	// 사번으로 사원 정보 조회
	public void selectEmployee() {
		// 사번 임력 view 호출
		int empNo = menu.selectEmpNo();
		
//		Employee e  = empDAO.selectEmployee(empNo); // Statement버전
		Employee e = empDAO.selectEmployeePS(empNo); // preparedsta버전
		
		
		
		if(e != null) { // 조회 결과가 있는 경우
			menu.selectEmployee(e);
		}else { // 조회 결과가 없는 경우
			menu.displayError("해당 사번의 검색 결과가 없습니다.");
		}
		
	}
	public void insertEmployee() {
		// 컨트롤러의 역할
		// 1. 모델과 뷰를 연결해주는 역할 2. 데이터 가공 3. 모델로부터 받은값을 반환
		Employee e = menu.insertEmployee();
		
		int result = empDAO.insertEmployee(e); 
		// 매개변수에 e를 추가해야 받아온데이터를 전달가능
		if(result >0) {
			menu.displaySuccess(result + "개의 행이 삽입되었습니다.");
		}else {
			menu.displayError("데이터 삽입 과정 중 오류 발생");
		}
	}
	public void updateEmployee() {
		int empNo = menu.selectEmpNo();
		
		Employee emp = menu.updateEmployee();
		emp.setEmpNo(empNo); // 위에 둘을 합쳤습니다.
		int rset = empDAO.updateEmployee(emp);// 합치지않으면 empNo,emp로 해야해요.
		if(rset>0) {
			menu.displaySuccess(rset + " 개의 행이 수정 완료");
		}else {
			menu.displayError(" 수정 중 오류 발생");
		}
		
	}
	public void deleteEmployee() {
		int empNo = menu.selectEmpNo();// 현재 사번 출력
		
		char answer = menu.deleteEmployee();
		if(answer == 'y') {
			int result = empDAO.deleteEmployee(empNo);
			if(result > 0) {
				System.out.print(empNo + "번의 사원 정보 삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		}else if(answer =='n') {
			menu.displaySuccess("사원 정보 삭제 취소");
		}else {
			menu.displayError("y나 n중에 입력해주세요");
		}
		
		
	}
	
}
