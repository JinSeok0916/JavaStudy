package _03For;

public class _01_Q {

	public static void main(String[] args) {
		// 1. 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		int i = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				i += i;
			} else i -= i;
		}
		System.out.println("1번"+":"+i);
		
		// 2. 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각 출력하시오.
		int oddSum = 0;
		int evenSum = 0;
		int k = 0;
		for (k = 1; k <= 100; k++) {
			if (k % 2 == 1) {
				oddSum += k;
			} else evenSum += k;
		}
		System.out.println("2번"+":"+oddSum+", "+evenSum);
		
		// 3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		int l = 0;
		int cnt = 0;
		for (l = 1; l <= 100; l++) {
			if (l % 2 == 1) {
				cnt++;
			}
		}
		System.out.println("3번"+":"+cnt);
		
		// 4. 100부터 999까지의 숫자의 모든 합을 구하시오.
		//	  453인 경우 4+5+3을 합한 값의 모든 총합을 구하시오.
		int sumM = 0;
		for (int m = 100; m <= 999; m++) {
			sumM += (m/100) + (m%100)/10 + (m%10);
		}
		System.out.println("4번"+":"+sumM);
		
		// 5. 범인은 100부터 999까지 숫자에 숨어있다.
		//	  범인은 십의 자리에 있고 3의 배수이다. 범인 숫자를 모두 출력하시오.
		int n = 0;
		for (n = 0; n < 900; n++) {
			if (((n + 100) % 100) / 10 % 3 == 0 && ((n + 100) % 100) / 10 != 0) {
				System.out.println(n);
			}
		}
		
		
		// 6. 범인을 찾아라. 0부터 100까지 숫자 중 하나이다. 0부터 1 2 3 순서대로 합한 값을 누적한다.
		//	  합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
		//	  범인 숫자 한 개를 출력하시오.
		int q = 0;
		for (int p = 0; p < 101; p++) {
			q = q + p;
			if (q > 44) {
				System.out.println("6번"+":"+p);
				p = 101;
			}
		}
		
		
		// 7. System.out.println()에서 ln이 빠지면 변수 값을 출력 후 줄바꿈을 하지 않는 코드이다.
		//	  다음과 같이 출력하게 하시오.
		//	  1+2+3+4+5+6+7+8+9+10=결과값
		int r = 0;
		int sumR = 0;
		for (r = 1; r <= 10; r++) {
			sumR += r;
			if (r == 10) {
				System.out.print(r);
			} else System.out.print(r+"+");
		}
		System.out.println("="+sumR);
		
		// 8. 피보나치 수열 1
		//	  a는 피보나치 수의 갯수이다. 총 7개의 피보나치 수를 구하고 합한 값을 출력하시오.
		//	  a는 1 2 3 4 5 6 7 까지 증가, a가 4일 때 피보나치 수는 3이 된다.
		//	  1 1 2 3 5 8 13
		int fibA = 1;
		int fibB = 0;
		int fibC = 1;
		int sumFib = 0;
		for (int a = 1; a < 8; a++) {
			if (a == 1 || a == 2) {
				fibC = 1;
				sumFib += fibC;
				System.out.println(fibC);
			} if (a >= 3) {
			fibB = fibA;
			fibA = fibC;
			fibC = fibB + fibA;
			sumFib += fibC;
			System.out.println(fibC);
			}
		}
		System.out.println("합한 값"+":"+sumFib);
		
		// 9. 피보나치 수열 2
		//	  b를 피보나치 수로 정의한다.
		//	  b의 변화는 1 1 2 3 5 8 13 이 된다.
		
		
		
		// 10. 987654321이라는 숫자가 있다. 변수 2개와 for문 한개로
		//	   모든 자릿수를 더한 합을 구하시오. (9+8+7+6+5+4+3+2+1=합)
		//	   식 없이 합만 출력.
		//	   main메서드 안의 라인수를 최소화해서 작성하시오. 
		int x = 0;
		for (int y = 987654321; y > 0; y/=10) {
			x += y % 10;
		}
		System.out.println(x);
		
		
		
		
		
	}

}
