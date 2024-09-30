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
			l = new Cooking_L();
			l.m = this;
			l.addC();
			list.add(l);
			System.out.println("입력되었습니다.");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + " " + list.get(i).chef);
			}
		} else if (selNum.equals("2")) {
			l.addD();
		} else
			System.out.println("다시 입력해주세요.");
		
	}
	
	public void mod() {
		int cnt = 0;
		while (true) {
			System.out.println();
			System.out.println("수정할 요리사 혹은 요리를 선택하세요.");
			System.out.println("1. 요리사");
			System.out.println("2. 요리");
			System.out.print("번호 : ");
			selNum = in.nextLine();
			if (selNum.equals("1")) {
				System.out.println();
				System.out.println("수정할 요리사 이름을 입력하세요.");
				System.out.print("요리사 이름 : ");
				String name = in.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).chef.equals(name)) {
						cnt = 1;
						list.get(i).chef = name;
						System.out.println();
						System.out.println("수정되었습니다.");
					}
				}
				if (cnt == 0) {
					System.out.println();
					System.out.println("입력하신 정보가 없습니다.");
				} else if (cnt == 1)
					break;
			} else if (selNum.equals("2")) {
				System.out.println();
				System.out.println("수정할 요리 이름을 입력하세요.");
				System.out.print("요리 이름 : ");
				String name = in.nextLine();
				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < list.get(0).dish.size(); j++)
					if (list.get(i).dish.get(j).equals(name)) {
						cnt = 1;
						list.get(i).dish.set(j, name);
						System.out.println();
						System.out.println("수정되었습니다.");
					}
				}
				if (cnt == 0) {
					System.out.println();
					System.out.println("입력하신 정보가 없습니다.");
				} else if (cnt == 1)
					break;
			} else
				System.out.println("다시 입력해주세요.");
		}
	}
	
	public void list() {
		int cnt = 0;
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
					cnt = 1;
					System.out.println();
					System.out.println("요리사 이름 : "+list.get(i).chef);
					System.out.println("요리사의 요리 목록 : "+list.get(i).dish);
				}
			}
			if (cnt == 0) {
				System.out.println();
				System.out.println("등록되지 않은 요리사입니다.");
			}
		} else if (selNum.equals("2")) {
			System.out.println();
			System.out.println("조회할 요리 이름을 입력하세요.");
			System.out.print("요리 이름 : ");
			String name = in.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).dish.get(i).equals(name)) {
					System.out.println();
					System.out.println("입력한 요리 : "+list.get(i).dish.get(i));
					System.out.println("요리를 한 요리사 : "+list.get(i).chef);
				}
			}	
		} else
			System.out.println("다시 입력해주세요.");
	}
	
	public void del() {
		int cnt = 0;
		while (true) {
			System.out.println();
			System.out.println("삭제할 요리사 혹은 요리를 선택하세요.");
			System.out.println("1. 요리사");
			System.out.println("2. 요리");
			System.out.print("번호 : ");
			selNum = in.nextLine();
			if (selNum.equals("1")) {
				System.out.println();
				System.out.println("삭제할 요리사 이름을 입력하세요.");
				System.out.print("요리사 이름 : ");
				String name = in.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).chef.equals(name)) {
						cnt = 1;
						list.remove(i);
						System.out.println("삭제되었습니다.");
					}
				}
				if (cnt == 0) {
					System.out.println();
					System.out.println("입력하신 정보가 없습니다.");
				} else if (cnt == 1)
					break;
			} else if (selNum.equals("2")) {
				System.out.println();
				System.out.println("삭제할 요리 이름을 입력하세요.");
				System.out.print("요리 이름 : ");
				String name = in.nextLine();
				for (int i = 0; i < list.size(); i++) {
					for (int j = 0; j < list.get(0).dish.size(); j++)
					if (list.get(i).dish.get(i).equals(name)) {
						cnt = 1;
						list.get(i).dish.remove(i);
						System.out.println();
						System.out.println("삭제되었습니다.");
					}
				}
				if (cnt == 0) {
					System.out.println();
					System.out.println("입력하신 정보가 없습니다.");
				} else if (cnt == 1)
					break;
			} else
				System.out.println("다시 입력해주세요.");
		}
	}

	
	
}
