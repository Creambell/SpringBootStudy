package pratice1.chap01_poly.view;

import java.util.Scanner;

import chap01_poly.controller.LibraryController;
import chap01_poly.model.vo.Book;
import chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		
		Member m = new Member(name, age, gender);
		lc.insertMember(m);
		
		int menu = 0;
		while(true) {
			System.out.println();
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: System.out.println(lc.myInfo()); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}
		
	}
	
	public void selectAll() {
		Book[] b = lc.selectAll();
		for(int i = 0; i < b.length; i++) {
			System.out.println(i + "�� ���� : " + b[i]);
		}
	}

	public void searchBook() {
		System.out.println();
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.next();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) {
			if(searchList[i] != null) {
				System.out.println(searchList[i]);
			}
		}
	}
	
	public void rentBook() {
		System.out.println();
		selectAll();
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		if(result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		} else if(result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		} else {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
	}
}
