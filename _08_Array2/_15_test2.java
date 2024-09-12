package _08_Array2;

public class _15_test2 {

	public static void main(String[] args) {
		
		// 빈 배열이 있다.
		// 빈 배열에 숫자를 채운다.
		// 숫자를 채우는 규칙은 달팽이처럼 돌면서 채운다.
		// 배열의 크기가 달라져도 출력되어야 한다.
		
		// 입력을 반복하기 위해 for문 작성. 배열의 행열의 값 중 작은 값이면 충분하므로 행열의 합을 나눈값을 최대값으로 설정
		// 1부터 입력하기 위해 num값을 1로 지정. 배열의 행열 값을 합한 값을 저장하기 위해 sum값 설정
		// 배열의 행열 값의 합이 sum값과 일치할 때 배열의 value값에 num을 입력.
		// 이후 다음 숫자를 입력하기 위해 num값은 증가하고 다음 좌표로 이동하기 위해 sum값도 증가.
		// 배열의 값을 입력하는 for문을 2개 작성. i와 j의 초기값과 최대값은 달팽이처럼 돌면서 입력할 때 돈 횟수 만큼 변해야함.
		// 돌 때 마다 변하는 변수 값이 있어야하고 배열의 크기에 따라 도는 횟수 또한 바뀌기 때문에
		// round변수를 사용하는 for문 작성. 초기값은 0, 최대값은 행과 열 중 더 작은 수면 충분

		// 빈 배열 선언
		int [][] a = new int [7][5];
		// 첫 숫자 선언
		int num = 1;
		// 숫자를 입력할 좌표의 합을 저장하는 변수
		int sum = 0;
		int rLength = (a.length+a[0].length)/2;
		// round는 반바퀴 돈 횟수 - 1   0,0부터 배열이 시작하기 때문
		for (int round = 0; round < rLength; round++) {
			if (round % 2 == 0) {		// round는 0부터 시작하기 때문에 시작은 짝수부터 해야하므로 설정.
				sum = round;			// 입력할 좌표의 합은 다시 돌 때 마다 규칙적으로 0 2 4 ... 의 규칙을 가지고 이는 x와 일치하므로 대입.  
				for (int i = round/2; i < a.length-(round/2); i++) {		 // 행의 값을 우선 입력하고 열의 값을 차례로 입력하면
					for (int j = round/2; j < a[0].length-(round/2); j++) {  // 행열 값을 합한게 sum과 일치할 때 value값을 입력하면 
						if (i + j == sum && num <= a.length * a[0].length) { // 
							a[i][j] = num;
							num++;
							sum++;
						}
					}
				}
			}
			if (round % 2 == 1) { // 반대로 돌 때를 가정하기 위한 홀수 찾기		// 입력할 좌표는 a[a.length-1][a[0].length-2]
				sum = (a.length-1-(round/2))+(a[0].length-2-(round/2)); // 다시 돌 떄 마다 행열이 한칸씩 줄어야하고 x/2는 매 순환마다 0 1 2 순서로 커지므로 이를 대입.
				for (int i = a.length-(round/2)-1; i >= (round/2)+1; i--) {		// 위의 for문과 다르게 반대 순서대로 입력되어야함.
					for (int j = a[0].length-(round/2)-1; j >= (round/2); j--) {
						if (i + j == sum && num <= a.length * a[0].length) {
							a[i][j] = num;
							num++;
							sum--;
						}
					}
				}
			}
		}
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
