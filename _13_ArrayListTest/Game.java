package _13_ArrayListTest;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	Random r = new Random();
	Scanner in = new Scanner(System.in);
	ArrayList<Word> list = new ArrayList<>();
	Manage gM = null;
	
	public void wordGame() {
		System.out.println(" - 단어게임 - ");
		start();
		
	}
	
	public void start() {
		int[] a = new int[gM.wordList.size()];
		int sum = 0;
		for (int i = 0; i < gM.wordList.size(); i++) {
			int j = r.nextInt(gM.wordList.size());
			if (a[j] == 0) {
				a[j] = 1;
			} else if (a[j] != 0) {
				i--;
				continue;
			}
			System.out.println((i+1)+"번 문제");
			System.out.println(gM.wordList.get(j).kor);
			System.out.println("해당 한글 뜻의 영어단어를 입력하세요.");
			String eng = in.nextLine();
			if (gM.wordList.get(j).eng.equals(eng)) {
				System.out.println("정답입니다.");
				System.out.println();
				sum++;
			} else {
				System.out.println("틀렸습니다.");
				System.out.println();
				list.add(gM.wordList.get(i));
			}
		}
		if (gM.wordList.size() == sum) {
			System.out.println(gM.wordList.size()+"문제 모두 다 맞추셨습니다.");
		} else {
			System.out.println("총 "+gM.wordList.size()+"문제 중 "+sum+"문제 맞추셨습니다.");
			System.out.println("아래는 틀린 문제입니다.");
			for (int i = 0; i < list.size(); i++) {
				list.get(i).data();
			}
		}
	}
	
}
