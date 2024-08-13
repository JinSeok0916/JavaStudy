package _03For;

import java.util.Random;
import java.util.Scanner;

public class _03_Q {

	public static void main(String[] args) {
		// 0. 짝수만 출력하시오.
		System.out.println("0번 문제");
		int[] letter = {8,12,4,13,2,14,4,5};
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] % 2 == 0) {
				System.out.println(letter[i]);
			}
		}
		
		// 1. letter 배열의 가장 큰 수가 있는 인덱스를 출력하시오.
		System.out.println("1번 문제");
		int maxNum = 0;
		int maxIndex = 0;
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] > maxNum) {
				maxNum = letter[i];
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
		
		// 2. letter 배열에서 범인을 찾으시오.
		//	  범인은 짝수이면서 가장 큰 값이다.
		//	  범인은 14이다.
		System.out.println("2번 문제");
		int maxNumber = 0;
		int man = 0;
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] > maxNumber) {
				maxNumber = letter[i];
				if (maxNumber % 2 == 0) {
					man = maxNumber;
				}
			}
		}
		System.out.println(man);
		
		// 3. letter 배열은 word 문자열 알파벳의 위치이다.
		//	  letter 배열의 암호를 풀어서 편지의 내용을 출력하시오.
		System.out.println("3번 문제");
//		int[] letter = {8,12,4,13,2,14,4,5};
		String word = "gehoudfkimjnlvy";
		char[] letterWord = new char [8];
		for (int i = 0; i < 8; i++) {
			letterWord[i] = word.charAt(letter[i]); 
			if (i == 7) {
				System.out.println(letterWord[i]);
			} else
			System.out.print(letterWord[i]);
		}
		
		// 4. arr배열에서 0이 의미하는 것은 공터이다.
		//	  size는 건물의 크기이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야한다.
		//	  size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		//	  size가 2일 경우에 7개이다.
		System.out.println("4번 문제");
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size = 2;
		int cnt = 0;
		for (int i = 0; i < arr.length - (size - 1); i++) {
			if (arr[i] == 0 && arr[i] == arr[i+size-1]) {
				for (int k = 1; k < size; k++) {
					if (arr[i] == arr[i+k]) {
						if (k == size - 1) {
							cnt++;
						}
					} if (arr[i] != arr[i+k]) {
						k = size;
					}
				}
			}
		}
		System.out.println(cnt);
		
		// 6. String a의 수식을 계산하는 프로그램을 작성하세요.
		//	  수식 계산 규칙은 연산자 우선순위 없이 앞에서부터 차례대로 계산한다.
		//	  지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다.
		//	  메서드는 최대한 적게 사용하세요.
		System.out.println("6번 문제");
		String a = "23-56+45*2-56";
		
		
		
		// 문제 7~8.
		int[] b = {34,2,35,8,31,45};
		
		// 7. 철수는 배열의 0번 인덱스부터 순회한다.
		//	  0번 인덱스에서 0번 인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
		//	  이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치될 것이다.
		//	  위와 같은 방식으로 가장 큰 수를 구하시오.
		System.out.println("7번 문제");
		int A = 0;
		for (int i = 0; i < b.length-1; i++) {
			if (b[i] > b[i+1]) {
				A = b[i];
				b[i] = b[i+1];
				b[i+1] = A;
				A = 0;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println(b[5]);
		
		// 8. 철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
		//	  0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
		//	  가장 큰 값이 나오면 가장 큰 값을 갱신한다.
		//	  위와 같은 방식으로 가장 큰 수를 구하시오.
		System.out.println("8번 문제");
		if (b[0] < b[1]) {
			b[0] = b[1];
		} if (b[1] < b[2]) {
			b[0] = b[2];
		} if (b[2] < b[3]) {
			b[0] = b[3];
		} if (b[3] < b[4]) {
			b[0] = b[4];
		} if (b[1] < b[2]) {
			b[0] = b[5];
		}
		System.out.println(b[0]);
		
		// 문제 9~12. Random 이라는 클래스로 객체를 만들어서 r이라는 참조변수로 참조해서 사용해보자.
		Random r = new Random();
		int num = r.nextInt(45)+1;
		//	  변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함.
		//	  즉, 0~44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
		//	  로또 번호는 1~45까지 이므로 리턴값이 +1로 보정됨.
		//	  리턴 값을 보정하여 num변수의 값에 대입.
		
		// 9. 위 코드를 이용하여 로또번호를 자동으로 생성하는 게임을 작성하시오.
		//	  중복 허용 가능, 로또 번호 6개를 배열에 저장하고 출력하시오.
		System.out.println("9번 문제");
		
		
		// 10. 4번 인덱스에서 중복이 허용되지 않게 하시오. 이때 for문은 한 개만 사용.
		System.out.println("10번 문제");
		
		
		// 11. 컴퓨터는 랜덤으로 번호를 먼저 뽑고, 키보드로 사용자가 번호를 입력하는 방식으로 가위 바위 보 게임을 작성하시오.
		System.out.println("11번 문제");
		
		
		// 12. 컴퓨터는 랜덤으로 로또 번호를 10,000번 뽑는다.
		//	   가장 만이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		//	   오늘의 추천 로또 번호 하나를 출력하시오. 만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.
		System.out.println("12번 문제");
		
		
		// 특별1. 문자열 c는 한자릿수의 숫자를 수집한 문자열이다.
		//		 숫자별로 수집된 수 만큼 카운팅하세요.
		//		 카운팅 배열은
		int[] d = new int[10];
		//		 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
		//		 인덱스 0~9까지를 숫자로 정의한다.
		//		 조건 : 형변환은 사용하지 않는다. 메서드는 charAt()만 사용한다.
		System.out.println("특별 1번 문제");
		String c = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		int cNum = 0;
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) != '/') {
				cNum = c.charAt(i)-48;
				d[cNum]++;
			}
		}
		for (int k = 0; k < 10; k++) {
			if (k == 9) {
				System.out.println(d[k]);
			} else    
			System.out.print(d[k]+",");
		}
		
		// 특별2. 문자열 e는 해충에 대한 숫자를 카운팅한 결과이다.
		//		 해충의 갯수를 모두 합하시오.
		//		 charAt() 메서드만 사용이 가능하다.
		//		 형변환이 필요하면 검색하여 사용하시오.
		System.out.println("특별 2번 문제");
		String e = "67/414/1/23/32/45/54/12/11/232";
		int l = 1;
		int cntE = 0;
		int sumE = 0;
		for (int i = 0; i < e.length(); i++) {
			if (e.charAt(i) != '/') {
				cntE++;
			} if (e.charAt(i) == '/') {
				for (int k = 1; k <= cntE; k++) {
					sumE += ((int)e.charAt(i-k)-48)*l;
					l *= 10;
				}
				l = 1;
				cntE = 0;
			}
			if (i == e.length()-1) {
				for (int k = 0; k < cntE; k++) {
					sumE += ((int)e.charAt(i-k)-48)*l;
					l *= 10;
				}
			}
		}
		System.out.println(sumE);
	}

}
