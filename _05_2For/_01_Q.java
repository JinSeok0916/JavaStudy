package _05_2For;

public class _01_Q {

	public static void main(String[] args) {
		// 문제 1. 수식 표현하기
		System.out.println("문제 1번");
		for (int i = 1; i < 5; i++) {
			for (int k = 1; k < 4; k++) {
				System.out.println(i+"*"+k+"="+i*k);
			}
		}
		
		// 문제 2. * 그리기
		System.out.println("문제 2번");
		for (int i = 0; i < 5; i++) {	
			for (int k = i; k < 5; k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		// 문제 3. 0과 * 그리기
		System.out.println("문제 3번");
		for (int i = 0; i < 4; i++) {
			for (int k = i; k < 3; k++) {
				System.out.print(0);
			} for (int l = i+1; l > 0; l--) {
				System.out.print("*");
			} for (int m = i; m > 0; m--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 문제 4. 반대로 0과 * 그리기
		System.out.println("문제 4번");
		for (int i = 0; i < 4; i++) {
			for (int k = i; k > 0; k--) {
				System.out.print(0);
			} for (int l = i; l < 4; l++) {
				System.out.print("*");
			} for (int m = i+1; m < 4; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 문제 5. 40보다 큰 수는 모두 몇개인가?
		System.out.println("문제 5번");
		int[] a = {34,55,23,56,34,45,34};
		int cntA = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 40) {
				cntA++;
			}
		}
		System.out.println(cntA);
		
		// 문제 6. b배열의 값보다 큰 값이 a배열의 값에 모두 몇개가 있는가?
		System.out.println("문제 6번");
		int[] b = {36,49};
		int cnt0 = 0;
		int cnt1 = 0;
		for (int i = 0; i < b.length; i++) {
			for (int k = 0; k < a.length; k++) {
				if (b[i] < a[k]) {
					if (i == 0) {
						cnt0++;
					} if (i == 1) {
						cnt1++;
					}
				}
			}
		}
		System.out.println("a 배열의 값에는  36번호 보다 큰 숫자가 "+cnt0+"개 있습니다.");
		System.out.println("a 배열의 값에는  49번호 보다 큰 숫자가 "+cnt1+"개 있습니다.");
		
		// 문제 7. 거스름돈 구하기 (조건: /나 % 연산자는 각각 최대 2번씩 사용)
		System.out.println("문제 7번");
		int pay = 10000;
		int money = 4570;
		int change = pay - money;	// 5430
		for (int i = 10000; i >= 10; i /= 10) {
			System.out.println((change % (i * 10)) / i);
		}
		
		// 문제 8. 애니팡 게임의 일부분이다. 게임의 캐릭터는 숫자로 구분한다.
		//		  가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		//		  제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		System.out.println("문제 8번");
		int[] pang = {1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		for (int i = 1; i < pang.length-1; i++) {
			if (pang[i] == pang[i+1] && pang[i] == pang[i-1]) {
				System.out.println(i);
			}
		}
		
		// 문제 9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요.
		System.out.println("문제 9번");
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		int cntTtt = 1;
		int maxCnt = 1;
		char tt = ' ';
		for (int i = 0; i < ttt.length()-1; i++) {
			if (ttt.charAt(i) == ttt.charAt(i+1)) {
				cntTtt++;
				if (maxCnt < cntTtt) {
					maxCnt = cntTtt;
					tt = ttt.charAt(i);
				}
			} if (ttt.charAt(i) != ttt.charAt(i+1)) {
				cntTtt = 1;
			}
		}
		System.out.println(tt+" "+maxCnt);
		
		// 문제 10. arr배열에서 0이 의미하는 것은 공터이다.
		//		   size는 건물의 크기이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다.
		//		   size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		//		   size가 2일 경우에 7개이다.
		System.out.println("문제 10번");
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int cntArr = 0;
		int size = 2;
		for (int i = 0; i < arr.length - (size - 1); i++) {
			if (arr[i] == 0 && arr[i] == arr[i+size-1]) {
				for (int k = 1; k < size; k++) {
					if (arr[i] == arr[i+k]) {
						if (k == size - 1) {
							cntArr++;
						}
					} if (arr[i] != arr[i+k]) {
						k = size;
					}
				}
			}
		}
		System.out.println(cntArr);
		
		// 문제 11. 0과 * 그리기 심화
		System.out.println("문제 11번");
		for (int i = 0; i < 4; i++) {
			for (int k = i; k < 3; k++) {
				System.out.print("0");
			} for (int l = i+1; l > 0; l--) {
				System.out.print("*");
			} for (int m = i; m > 0; m--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int k = i+1; k > 0; k--) {
				System.out.print(0);
			} for (int l = i; l < 3; l++) {
				System.out.print("*");
			} for (int m = i; m < 2; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 문제 12. 9번 문제에서 for문 2개만 사용하기. if문은 갯수 상관없음.
		System.out.println("문제 12번");
		
		
		
		
		
	}
}
