package _16_Static_Final_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class SubjectM {
	// 교과목을 등록할 수 있다. 과목명은 중복될 수 없다.
	// 교과목 전체리스트
	Scanner in = new Scanner(System.in);
	ArrayList<SubjectL> sList = new ArrayList<>();
	StudentM stdM = null;
	Login log = null;
	
	public void sManage() {
		while (true) {
			System.out.println();
			System.out.println(" - 교과목 관리 - ");
			System.out.println("1. 교과목 등록");
			System.out.println("2. 교과목 전체 리스트");
			System.out.println("3. 이전으로");
			System.out.print("번호 : ");
			String selNum = in.nextLine();
			if (selNum.equals("1")) {
				System.out.println();
				add();
			} else if (selNum.equals("2")) {
				list();
			} else if (selNum.equals("3"))
				break;
			else
				System.out.println("다시 입력해주세요.");
		}
	}
	
	public void add() {
		SubjectL sub = new SubjectL();
		while (true) {
			int cnt = 0;
			System.out.println();
			System.out.print("교과명 : ");
			String name = in.nextLine();
			for (int i = 0; i < sList.size(); i++) {
				if (name.equals(sList.get(i).getName())) {
					System.out.println();
					System.out.println("이미 등록된 교과입니다.");
					System.out.println("다시 입력해주세요.");
					cnt = 1;
					break;
				}
			}
			if (cnt == 0) {
				sub.setName(name);
				break;
			}
		}
		System.out.print("강의실 : ");
		String num = in.nextLine();
		sub.setNum(num);
		System.out.print("담당교수 : ");
		String proName = in.nextLine();
		sub.setProName(proName);
		sList.add(sub);
	}
	
	public void list() {
		for (int i = 0; i < sList.size(); i++) {
			System.out.println();
			System.out.println(" 교과목	: "+sList.get(i).getName());
			System.out.println(" 강의실	: "+sList.get(i).getNum());
			System.out.println(" 담당교수	: "+sList.get(i).getProName());
		}
		if (sList.size() == 0) {
			System.out.println();
			System.out.println("등록된 교과의 정보가 없습니다.");
		}
	}
	
	
}
