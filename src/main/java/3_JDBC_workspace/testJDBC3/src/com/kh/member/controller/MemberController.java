import MemberService;
import Member;
import View;

public class MemberController {
	private View view = new View();
	private MemberService mService = new MemberService();
	
	
	public void login() {
		Member mem = view.inputLogin();
		Member m = mService.login(mem); // 로그인은 리턴이 *를 받아올수밖에없어요.
		// DAO에서 준 m 초기값은 null이기때문에 로그인안되면 null값이 들어가요.
		if(m !=null){
			View.displayLoginSuccess(m);
		} else {
			View.displayError("로그인 정보를 확인해주세요.");
		}
	}

	public void exitProgram() {
		mService.exitProgram();
		
	}
}
