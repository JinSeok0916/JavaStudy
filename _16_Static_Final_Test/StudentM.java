package _16_Static_Final_Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentM {
	// 학생을 등록 중복 불가 - O
	// 학생을 이름으로 검색 동일한 이름 모두 검색 - O
	// 학생을 아이디로 입력하여 삭제 - O
	// 학생은 10명까지만 등록가능 일반배열사용하지 않고 - O
	// 학생 전체 리스트 - O
	// 학생 전체 리스트 확인 시 수강신청한 과목의 수를 숫자로 표시함
	
	Scanner in = new Scanner(System.in);
	ArrayList<StudentL> sList = new ArrayList<>();
	SubjectM subM = null;
	Login log = null;
	
	
	public void sManage() {
		while (true) {
			System.out.println();
			System.out.println(" - 학생 관리 - ");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 검색");
			System.out.println("3. 학생 삭제");
			System.out.println("4. 학생 전체 리스트");
			System.out.println("5. 이전으로");
			System.out.print("번호 : ");
			String selNum = in.nextLine();
			if (selNum.equals("1")) {
				System.out.println();
				add();
			} else if (selNum.equals("2")) {
				search();
			} else if (selNum.equals("3")) {
				del();
			} else if (selNum.equals("4")) {
				list();
			} else if (selNum.equals("5"))
				break;
			else
				System.out.println("다시 입력해주세요.");
		}
	}
	
	public void add() {
		if (sList.size() <= 10) {
			StudentL std = new StudentL();
			System.out.println();
			System.out.println("아이디와 이름, 전화번호, 학년을 입력해주세요.");
			while (true) {
				int cnt = 0;
				System.out.print(" 아이디	: ");
				String id = in.nextLine();
				for (int i = 0; i < sList.size(); i++) {
					if (id.equals(sList.get(i).getId())) {
						System.out.println();
						System.out.println("이미 등록된 ID입니다.");
						System.out.println("다시 입력해주세요.");
						cnt = 1;
						break;
					}
				}
				if (cnt == 0) {
					System.out.println("사용 가능한 ID입니다.");
					std.setId(id);
					break;
				}
			}
			System.out.print(" 이름	: ");
			String name = in.nextLine();
			std.setName(name);
			System.out.print(" 전화번호	: ");
			String pNum = in.nextLine();
			std.setpNum(pNum);
			System.out.print(" 학년	: ");
			String grade = in.nextLine();
			std.setGrade(grade);
			sList.add(std);
		} else
			System.out.println("최대 등록 가능한 인원이 넘었습니다.");
	}
	
	public void search() {
		int cnt = 0;
		System.out.println();
		System.out.println("검색할 학생의 이름을 입력하세요.");
		System.out.print("이름 : ");
		String name = in.nextLine();
		for (int i = 0; i < sList.size(); i++) {
			for (int j = 0; j < sList.get(i).getName().length()-name.length()+1; j++) {
				if (sList.get(i).getName().charAt(j) == name.charAt(0)) {
					if (sList.get(i).getName().substring(j,(j+name.length())).equals(name)) {
						cnt = 1;
						System.out.println();
						System.out.println(" ID	: "+sList.get(i).getId());
						System.out.println(" 이름	: "+sList.get(i).getName());
						System.out.println(" 전화번호	: "+sList.get(i).getpNum());
						System.out.println(" 학년	: "+sList.get(i).getGrade());
					}
				}
				
			}
		}
		if (cnt == 0) {
			System.out.println();
			System.out.println("입력하신 학생의 정보가 없습니다.");
		}
	}
	
	public void del() {
		int cnt = 0;
		System.out.println();
		System.out.println("삭제할 학생의 ID를 입력하세요.");
		System.out.print("ID : ");
		String id = in.nextLine();
		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).getId().equals(id)) {
				sList.remove(i);
				cnt = 1;
				System.out.println();
				System.out.println("삭제되었습니다.");
			}
		}
		if (cnt == 0) {
			System.out.println();
			System.out.println("입력하신 학생의 정보가 없습니다.");
		}
	}
	
	public void list() {
		for (int i = 0; i < sList.size(); i++) {
			System.out.println();
			System.out.println(" ID	: "+sList.get(i).getId());
			System.out.println(" 이름	: "+sList.get(i).getName());
			System.out.println(" 전화번호	: "+sList.get(i).getpNum());
			System.out.println(" 학년	: "+sList.get(i).getGrade());
			System.out.println(" 과목 수	: "+sList.get(i).getsListSize());
		}
		if (sList.size() == 0) {
			System.out.println();
			System.out.println("등록된 학생의 정보가 없습니다.");
		}
	}
	
	
	
}
