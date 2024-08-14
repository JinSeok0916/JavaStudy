package _04Random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _02_Test {

	public static void main(String[] args) {
		// 문제 0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		System.out.println("문제 0번");
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int i = in.nextInt();
		in.nextLine();
		if (i % 2 == 1) {
			System.out.println(i+"는 홀수입니다");
		} if (i % 2 == 0) {
			System.out.println(i+"는 짝수입니다");
		}
		
		// 문제 1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		System.out.println("문제 1번");
		System.out.println("숫자를 입력하세요.");
		int k = in.nextInt();
		in.nextLine();
		int l = in.nextInt();
		in.nextLine();
		int m = k+l;
		System.out.println("두 수의 합은 "+m+"입니다.");
		
		// 문제 2. 행운의 숫자 인지를 판별해 보자.
		//		  1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
		//		  이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
		System.out.println("문제 2번");
		Random r = new Random();
		int o = r.nextInt(100)+1;
		if (o % 7 == 0) {
			System.out.println(o+" 은/는 행운의 숫자 입니다.");
		} else
			System.out.println(o+" 은/는 조심해야하는 숫자 입니다.");
		
		// 문제 3. 2번의 업그레이드, 랜덤 수를 하나 뽑아서 출력한다.
		//		  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		System.out.println("문제 3번");
		int p = r.nextInt(100)+1;
		if (p % 7 == 0) {
			System.out.println(o+" 은/는 행운의 숫자 입니다.");
		} else {
			for (int s = 0; s < 99999; s++) {
				int q = r.nextInt(100)+1;
				if (q % 7 == 0) {
					System.out.println(q+" 은/는 행운의 숫자 입니다.");
					break;
				}
			}
		}
		
		
		// 문제 4. 숫자 10개를 저장할 수 있는 배열을 만들고
		//		  0부터 99숫자 중 랜덤으로 10개를 뽑습니다.
		//		  이 중 짝수만 저장하고 홀수는 무시합니다.(다시 뽑지 않습니다.)
		//		  0번째 번호 98번이라면 0번 인덱스에 저장
		//		  1번째 번호 97이라면 무시 1번 인덱스는 선언 시 초기값
		//		  2번째 번호 88이라면 2번 인덱스에 저장
		System.out.println("문제 4번");
		int[] arrT = new int[10];
		for (int a = 0; a < arrT.length; a++) {
			int t = r.nextInt(100);
			if (t % 2 == 0) {
				arrT[a] = t;
			}
			System.out.print(arrT[a]+" ");
		}
		System.out.println();
		
		// 문제 5. Random r = new Random();
		//		  int num = r.nextInt(45)+1;
		//		  변수 이름은 r이며 랜덤한 숫자를 추출하는 기능인 Random이라는 자료형을 선언함
		//		  변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함
		//		  즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
		//		  로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
		//		  리턴값을 보정하여  num변수의 값에 대입
		//		  위 코드를 이용하여
		//		  로또번호를 자동으로 생성하는 게임을 작성하시오.
		//		  중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		System.out.println("문제 5번");
		int[] lotto = new int[7];
		for (int a = 0; a < lotto.length; a++) {
			int num = r.nextInt(45)+1;
			lotto[a] = num;
		}
		System.out.println(Arrays.toString(lotto));
		
		// 문제 6. 컴퓨터는 랜덤으로 로또 번호를 10,000번 뽑는다.
		//		  가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		//		  오늘의 추천 로또 번호 하나를 출력하시오. 만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.
		System.out.println("문제 6번");
		int b = 0;
		int[] lotto1 = new int[45];
		int max = lotto1[0];
		int maxNum = 0;
		for (int a = 0; a < 10000; a++) {
			int num = r.nextInt(45)+1;
			lotto1[num-1]++;
		}
		for (b = 0; b < lotto1.length; b++) {
			if (max <= lotto1[b]) {
				max = lotto1[b];
				maxNum = b+1;
			}
		}
		System.out.println("오늘의 추천 로또 번호 : "+maxNum);
		
		
		// 문제 7. 아래 배열에서 인덱스는 사람의 번호로 가정한다.
		int[] jobTime = {40,32,4,16,5,8};
		//		  jobTime[2]의 의미는 2번사람이 업무를 마치기 위한 시간이다.
		//		  작업장을 사용할 수 있는 시간은 최대 4시간이다.
		//		  작업장은 한 사람만 사용할 수 있고, 사용이 끝나면 작업장을 나와야 하고
		//		  다음 사람이 작업장을 사용한다. (만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)
		//		  0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
		//		  실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
		System.out.println("문제 7번");
		String person = "";
		for (int a = 0; a < jobTime.length; a++) {
			if (jobTime[a] > 0) {
				jobTime[a] -= 4;
				person += a + " ";
			} if (a == 5) {
				if (jobTime[0] > 0 || jobTime[1] > 0 || jobTime[2] > 0 ||
					jobTime[3] > 0 || jobTime[4] > 0 || jobTime[5] > 0) {
					a = -1;
				}
			}
		}
		System.out.println(person);
		
		
		// 문제 8번. 
		System.out.println("문제 8번");
		int[] lotto2 = new int[6];
		// 0번째 번호부터 로또 번호 입력받기
		for (int x = 0; x < lotto2.length; x++) {
			System.out.println((x + 1) + "번 입력하세요");
			int y = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
			in.nextLine();  // 버퍼 지우기
			if (y < 1 || y > 45) {
				System.out.println("범위 오류");
				x = x - 1;
			} else {lotto2[x] = y;}
		}
		// 로또 번호를 출력하는 반복문
		for (int x = 0; x < lotto2.length; x++) {
			if (x == lotto2.length - 1) { // 마지막 번호
				System.out.println("보너스 : " + lotto2[x]);
			} else {
				System.out.println(lotto2[x]);
			}
		}
		
		
		
		
		
	}

}
