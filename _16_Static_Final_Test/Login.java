package _16_Static_Final_Test;

import java.util.Scanner;

public class Login {
	Scanner in = new Scanner(System.in);
	StudentM stdM = null;
	SubjectM subM = null;
	int z = 0;
	
	
	public void login() {
		int cnt = 0;
		System.out.println();
		System.out.println("ID를 입력해주세요.");
		while (true) {
			System.out.print(" ID : ");
			String id = in.nextLine();
			for (int i = 0; i < stdM.sList.size(); i++) {
				if (stdM.sList.get(i).getId().equals(id)) {
					System.out.println();
					System.out.println("로그인 되었습니다.");
					cnt = 1;
					z = i;
					manage();
					break;
				}
			}
			if (cnt == 0) {
				System.out.println();
				System.out.println("등록된 ID가 없습니다.");
				break;
			}
		}
	}
	
	public void manage() {
		while (true) {
			System.out.println();
			System.out.println(" - 로그인 - ");
			System.out.println("1. 수강신청");
			System.out.println("2. 수강신청 리스트");
			System.out.println("3. 이전으로");
			String selNum = in.nextLine();
			if (selNum.equals("1"))
				enroll();
			else if (selNum.equals("2"))
				list();
			else if (selNum.equals("3"))
				break;
			else
				System.out.println("다시 입력해주세요.");
		}
	}
	
	public void enroll() {
		System.out.println();
		System.out.println("전체 교과목 리스트입니다.");
		for (int i = 0; i < subM.sList.size(); i++) {
			System.out.println();
			System.out.print(" " + (i+1) + "번 강의 : ");
			subM.list();
		}
		System.out.println();
		System.out.println("수강신청할 교과목의 번호를 선택해주세요");
		int num = in.nextInt();
		in.nextLine();
		stdM.sList.get(z).setsName(subM.sList.get(num-1).getName());
	}
	
	public void list() {
		System.out.println(stdM.sList.get(z).getsList());
	}
	
	
	
}
