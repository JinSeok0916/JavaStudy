package _10_ClassTest4Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage_M {
	Scanner in = new Scanner(System.in);
	
	// Manage_C의 객체를 만든 것이 아니라
	// Manage_C 객체의 주소값을 저장할 배열을 생성한 것이다.
	// cList는 참조변수이고 Manage_C 객체의 주소를 저장한다.
//	Manage_C[] cList = new Manage_C[10];
	ArrayList<Manage_C> cList = new ArrayList<>();
	Manage_EM eventM = null;
	
	public void restart() {
		while (true) {
			System.out.println();
			System.out.println(" - 고객관리 - ");
			System.out.println("1. 고객가입");
			System.out.println("2. 정보보기");
			System.out.println("3. 수정하기");
			System.out.println("4. 삭제하기");
			System.out.println("5. 진행중인 이벤트 보기");
			System.out.println("6. 처음으로");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				System.out.println();				
				join();
			} else if (selNum == 2) {
				System.out.println();				
				info();
			} else if (selNum == 3) {
				System.out.println();				
				mod();
			} else if (selNum == 4) {
				System.out.println();				
				del();
			} else if (selNum == 5) {
				System.out.println();				
				eventList();
			} else if (selNum == 6) {
				break;
			} else {
				System.out.println();
				System.out.println("1에서 5 사이의 숫자를 입력하세요.");
			}
		}
	}
	
	int cnt = 0;
	Manage_C cus = new Manage_C();
	public void join() {
		System.out.println("ID를 입력해주세요");
		cus.id = in.nextLine();
		System.out.println("이름을 입력해주세요");
		cus.name = in.nextLine();
		cList.add(cus);
		cnt++;
		System.out.println("등록되었습니다.");
	}
	
	public void info() {
		if (cnt == 0)
			System.out.println("입력된 고객 정보가 없습니다.");
		else 
			for (int i = 0; i < cList.size(); i++) {
				System.out.println((i+1)+"번 고객");
				cList.get(i).data();
				for (int j = 0; j < eventM.eList.length; j++) {
					if (eventM.eList[j] != null && eventM.eList[j].id.equals(cList.get(i).id)) {
						eventM.eList[j].list();
						System.out.println();
					}
				}
			}
	}
	
	public void mod() {
		int count = 0;
		System.out.println("수정할 ID를 입력하세요.");
		String id = in.nextLine();
		for (int i = 0; i < cList.size(); i++) {
			if (cList.get(i).id.equals(id)) {
				System.out.println("수정할 이름을 입력하세요.");
				String name = in.nextLine();
				cList.get(i).name = name;
				count = 1;
			}
		}
		if (count == 0)
			System.out.println("해당 ID의 고객 정보가 없습니다.");
	}
	
	public void del() {
		int count = 0;
		System.out.println("삭제할 ID를 입력하세요.");
		String id = in.nextLine();
		for (int i = 0; i < cList.size(); i++) {
			if (cList.get(i).id.equals(id)) {
				cList.remove(i);
				System.out.println("삭제되었습니다.");
				cnt--;
				count = 1;
			}
		}
		if (count == 0)
			System.out.println("해당 ID의 고객 정보가 없습니다.");
	}
	
	public void eventList() {
		eventM.list();
	}
	
}
