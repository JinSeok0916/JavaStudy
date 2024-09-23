package _10_ClassTest3Manage;

import java.util.Scanner;

public class Manage_EM {
	Scanner in = new Scanner(System.in);
	Manage_E[] eList = new Manage_E[10];
	Manage_EM() {
		
	}
	
	public void restart() {
		while (true) {
			System.out.println();
			System.out.println(" - 이벤트관리 - ");
			System.out.println("1. 이벤트 등록");
			System.out.println("2. 전체보기");
			System.out.println("3. 이벤트 수정");
			System.out.println("4. 이벤트 삭제");
			System.out.println("5. 처음으로");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				System.out.println();				
				add();
			} else if (selNum == 2) {
				System.out.println();				
				list();
			} else if (selNum == 3) {
				System.out.println();				
				mod();
			} else if (selNum == 4) {
				System.out.println();				
				del();
			} else if (selNum == 5)
				break;
			else {
				System.out.println();				
				System.out.println("1 에서 5 사이의 숫자를 입력하세요.");
			}
		}
	}
	
	int cnt = 0;
	public void add() {
		Manage_E event = new Manage_E();
		System.out.println("이벤트 제목을 입력하세요.");
		event.title = in.nextLine();
		System.out.println("이벤트 내용을 입력하세요.");
		event.con = in.nextLine();
		for (int i = 0; i < eList.length; i++) {
			if (eList[i] == null) {
				eList[i] = event;
				cnt++;
				System.out.println("등록되었습니다.");
				break;
			}
		}
	}
	
	public void list() {
		System.out.println();
		if (cnt == 0)
			System.out.println("입력된 이벤트 정보가 없습니다.");
		else
			for (int i = 0; i < eList.length; i++) {
				if (eList[i] != null) {
					System.out.println((i+1)+"번 이벤트");
					eList[i].data();
					System.out.println();
				}
		}
	}
	
	public void mod() {
		System.out.println("수정할 이벤트 제목을 입력하세요.");
		String title = in.nextLine();
		for (int i = 0; i < eList.length; i++) {
			if (eList[i] != null && eList[i].title.equals(title)) {
				System.out.println("수정할 제목을 입력하세요.");
				title = in.nextLine();
				eList[i].title = title;
				System.out.println("수정할 내용을 입력하세요.");
				String con = in.nextLine();
				eList[i].con = con;
				System.out.println("수정되었습니다.");
			}
		}
	}
	
	public void del() {
		System.out.println("삭제할 이벤트 제목을 입력하세요.");
		String title = in.nextLine();
		for (int i = 0; i < eList.length; i++) {
			if (eList[i] != null && eList[i].title.equals(title)) {
				eList[i] = null;
				cnt--;
				System.out.println("삭제되었습니다.");
			}
		}
	}
	

}
