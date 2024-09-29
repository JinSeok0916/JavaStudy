package _10_ClassTest5Cooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Cooking_M {
	Scanner in = new Scanner(System.in);
	ArrayList<Cooking_L> list = new ArrayList<>();
	Cooking_L l = null;
	String selNum = null;
	
	public void start() {
		while (true) {
			System.out.println();
			System.out.println("요리 및 요리사 리스트 프로그램");
			System.out.println("번호를 입력하세요.");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.print("번호 : ");
			selNum = in.nextLine();
			System.out.println();
			if (selNum.equals("1")) {
				add();
			} else if (selNum.equals("2")) {
				mod();
			} else if (selNum.equals("3")) {
				list();
			} else if (selNum.equals("4")) {
				del();
			} else
				System.out.println("다시 입력해주세요.");
		}
	}
		
	public void add() {
		System.out.println("입력하실 요리사 혹은 요리를 입력하세요.");
		System.out.println("1. 요리사");
		System.out.println("2. 요리");
		System.out.print("번호 : ");
		selNum = in.nextLine();
		if (selNum.equals("1")) {
			l.addC();
			list.add(0, l);
		} else if (selNum.equals("2")) {
			l.addD();
			list.add(0, l);
		} else
			System.out.println("다시 입력해주세요.");
		
	}
	
	public void mod() {
		
	}
	
	public void list() {
		System.out.println();
		System.out.println("조회할 요리사 혹은 요리를 선택하세요.");
		System.out.println("1. 요리사");
		System.out.println("2. 요리");
		System.out.print("번호 : ");
		selNum = in.nextLine();
		if (selNum.equals("1")) {
			System.out.println();
			System.out.println("조회할 요리사 이름을 입력하세요.");
			System.out.print("요리사 이름 : ");
			String name = in.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).chef.equals(name)) {
					System.out.println(list.get(i).chef);
				}
			}
		} else if (selNum.equals("2")) {
			System.out.println();
			System.out.println("조회할 요리 이름을 입력하세요.");
			System.out.print("요리 이름 : ");
			String name = in.nextLine();
			
		} else
			System.out.println("다시 입력해주세요.");
	}
	
	public void del() {
		
	}

	
	
}
