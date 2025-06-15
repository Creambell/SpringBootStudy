import java.util.ArrayList;

import MemberService;
import Member;
import MemberMenu;

public class MemberController {
	private MemberMenu menu = new MemberMenu();
	private MemberService mService = new MemberService();
	
	public void insertMember() {
		Member m = menu.insertMember();
		//메뉴의 인서트 멤버입니다.
		int result = mService.insertMember(m);
		// 멤버서비스 안의 인서트멤버입니다.
		if(result > 0) {
			menu.displaySuccess(result+"개의 행이 추가되었습니다.");
		}else {
			menu.displayError("데이터 삽입 과정 중 오류 발생");
		}
	}

	public void selectAll() {
		ArrayList<Member> list = mService.selectAll();
		if(!list.isEmpty()) {
			menu.displayMember(list);
		}else {
			menu.displayError("조회 결과가 없습니다.");
		}
		
	}

	public void selectMember() {
		int sel = menu.selectMember(); // 받아올 조건을 위해 셀렉멤버를 제작합니다.
		//int sel을 반환해서 가져올수있어요.
		ArrayList<Member> list =null; // list는 cas1안에 있어서 빼줬습니다.
		switch(sel) {
		case 1: String id = menu.inputMemberId(); // return으로 받아와서 String id를 받아올수있어요.
			list = mService.selectMemberId(id);
			break;
		case 2: char gen = menu.inputGender();
			list = mService.selectGender(gen); // 이곳의 list는 service의 list입니다
			break;
		case 0: return; // 메뉴로 넘어가기떄문에 바로 리턴시켜서 view로 넘어갈수있게합니다.
		}
		if(!list.isEmpty()) {
			menu.displayMember(list);
		} else {
			menu.displayError("조회 결과가 없습니다");
		}
	}

	public void updateMember() { // 존나 어려운거 !! 복습해야함 05-07
		String memberId = menu.inputMemberId();
		
		int check = mService.checkMember(memberId);
		if(check !=1) {
			menu.displayError("입력한 아이디가 존재하지 않습니다");
		} else {
			int sel =menu.updateMember();
			if(sel == 0) {
				return;
			}
			String update = null;
			switch(sel) {
			case 1 : update = "member_pwd"; break;
			case 2 : update = "email"; break;
			case 3 : update = "phone"; break;
			case 4 : update = "address";
			}
			
			String input = menu.intputUpdate();
			int result = mService.updateMember(memberId, update,input);
			if(result > 0) {
				menu.displaySuccess(result + "개의 행이 수정되었습니다.");
			}else {
				menu.displayError("데이터 수정 과정 중 오류 발생");
			}
			
		}
	}

	public void deleteMember() {
		String memberId = menu.inputMemberId();
		int check = mService.checkMember(memberId);
		if(check !=1) {
			menu.displayError("입력한 아이디가 존재하지 않습니다");
		} else {
			char yn =menu.checkDelete();
			if(yn != 'Y')return;
			mService.deleteMember(memberId);
		}
	}

}
