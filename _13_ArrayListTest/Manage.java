package _13_ArrayListTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
	Scanner in = new Scanner(System.in);
	ArrayList<Word> wordList = new ArrayList<>();
	
	public void wordManage() {
		while (true) {
			System.out.println();
			System.out.println(" - 단어관리 - ");
			System.out.println("1. 단어등록");
			System.out.println("2. 전체조회");
			System.out.println("3. 단어삭제");
			System.out.println("4. 단어수정");
			System.out.println("5. 처음으로");
			String selNum = in.nextLine();
			if (selNum.equals("1")) {
				System.out.println();
				add();
			} else if (selNum.equals("2")) {
				System.out.println();
				showList();
			} else if (selNum.equals("3")) {
				System.out.println();
				del();
			} else if (selNum.equals("4")) {
				System.out.println();
				mod();
			} else if (selNum.equals("5")) {
				break;
			} else
				System.out.println("1에서 5 사이의 숫자를 입력해주세요.");
		}
	}
	
	public void add() {
		Word nWord = new Word();
		System.out.println("등록하실 영어단어를 입력하세요.");
		nWord.eng = in.nextLine();
		System.out.println("등록하실 영어단어의 뜻을 입력하세요.");
		nWord.kor = in.nextLine();
		wordList.add(nWord);
		System.out.println("등록되었습니다.");
	}
	
	public void showList() {
		int cnt = 0;
		for (int i = 0; i < wordList.size(); i++) {
			wordList.get(i).data();
//			System.out.println(wordList.get(i));
			cnt = 1;
		}
		if (cnt == 0)
			System.out.println("등록된 단어가 없습니다.");
	}
	
	public void del() {
		int cnt = 0;
		System.out.println("삭제하실 영어단어를 입력하세요.");
		String eng = in.nextLine();
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).eng.equals(eng)) {
				cnt = 1;
				System.out.println("정말 삭제하시겠습니까?");
				System.out.println(" Yes / No");
				String yesNo = in.nextLine();
				if (yesNo.equals("Yes") || yesNo.equals("yes")) {
					wordList.remove(i);
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("취소되었습니다.");
				}
			}
		}
		if (cnt == 0)
			System.out.println("해당 단어가 없습니다.");
	}
	
	public void mod() {
		int cnt = 0;
		System.out.println("수정하고싶은 영어단어를 입력하세요.");
		String eng = in.nextLine();
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).eng.equals(eng)) {
				System.out.println("수정하실 영어단어의 뜻을 입력하세요.");
				String kor = in.nextLine();
				wordList.get(i).kor = kor;
				System.out.println("수정되었습니다.");
				cnt = 1;
			}
		}
		if (cnt == 0)
			System.out.println("해당 단어가 없습니다.");
	}
	
}
