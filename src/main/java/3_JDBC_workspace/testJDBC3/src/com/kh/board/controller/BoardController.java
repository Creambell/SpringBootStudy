import java.util.ArrayList;

import BoardService;
import Board;
import View;

public class BoardController {
	private View view = new View();
	private BoardService bService = new BoardService();
	
	public void selectAll() {
		ArrayList<Board> list = bService.selectAll();
		
		if(!list.isEmpty()) {
			view.selectAll(list);
		} else {
			view.displayError("조회 결과가 없습니다.");
		}
		
	}

	public void insertBoard() {
		Board b = view.insertBoard();
		int result = bService.insertBoard(b);
		
		if(result > 0) {
			view.displaySuccess(result + "개의 게시글이 등록되었습니다.");
		}else {
			view.displayError("게시글 등록 과정 중 오류 발생");
		}
		
	}

	public void selectOne() {
		int bNo = view.inputBNo();
		
		Board b = bService.selectOne(bNo);
		if( b != null) {
			view.selectOne(b);
		}else {
			view.displayError("해당 글이 존재하지않습니다.");
		}
	}

	public void updateBoard() {
		int bNo = view.inputBNo();
		
		Board b = bService.selectOne(bNo);
		if(b == null) {
			View.displayError("해당 번호의 글이 존재하지 않습니다.");
		}else {
			String memberId = view.getMemberId();
			if(memberId.equals(b.getWriter())) {
				int sel = view.updateMenu();
				
				String column = null;
				String update = null;
				switch(sel) {
				case 1: 
					column = "title";
					update = view.updateTitle();
					break;
				case 2:
					column = "content";
					update = view.updateContent();
					break;
				case 0: return;
				}
				
				int result = bService.updateBoard(bNo,column,update);
				if(result > 0) {
					view.displaySuccess(result + "개의 게시글이 수정되었습니다.");
				}else {
					view.displayError("게시글 수정 과정 중 오류 발생");
				}
			}else {
				view.displayError("해당 글을 수정할 권한이 없습니다.");
			}
		}
	}

	public void deleteBoard() {
		int bNo = view.inputBNo();
		
		Board board = bService.selectOne(bNo);
		if(board != null) {
			String memberId = view.getMemberId();
			if(board.getWriter().equals(memberId)) {
				char yn =view.deleteBoard();
				
				if(yn == 'Y') {
					int result = bService.deleteBoard(bNo);
					if(result > 0) {
						view.displaySuccess(result + " 개의 행이 삭제되었습니다.");
					}else {
						View.displayError("게시글 삭제 과정 중 오류 발생");
					}
				}else {
					return;
				}
			}else {
				View.displayError("해당 글을 삭제할 권한이 없습니다.");
			}
		}else {
			View.displayError("해당 번호의 글이 존재하지않습니다.");
		}
	}
	
}
