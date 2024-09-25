package _13_ArrayListTest;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Manage manage = new Manage();
		Game game = new Game();
		game.gM = manage;
		
//		System.out.println(manage.wordList.get(-1));
		
		while (true) {
			System.out.println();
			System.out.println(" - javaWord - ");
			System.out.println();
			System.out.println("1. 단어관리");
			System.out.println("2. 단어게임");
			System.out.println("3. 종료");
			String selNum = in.nextLine();
			if (selNum.equals("1"))
				manage.wordManage();
			else if (selNum.equals("2"))
				game.wordGame();
			else if (selNum.equals("3"))
				break;
			else
				System.out.println("1에서 3 사이의 숫자를 입력하세요.");
		}
	}

}
