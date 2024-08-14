package _04Random;

import java.util.Random;	// cntl shift O

public class _00_Test {

	public static void main(String[] args) {
		// 6개의 랜덤한 로또번호
		Random r = new Random();
		int[] lotto = new int[6];	// 변수명, 길이, index
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i+1)+"번째 뽑아");
			int k = r.nextInt(45)+1;	// r변수를 참조하여 nextInt라는 기능을 호출, 매개변수 45를 입력 리턴받은 수(0~44)에 +1을 한다.
			lotto[i] = k;
		}
		for (int i = 0; i <lotto.length; i++) {
			if (i == lotto.length - 1) {
				System.out.println("보너스 : "+lotto[i]);
			} else
			System.out.println(lotto[i]);
		}
		
		
		
	}
}
