package _08_Array2;

public class _01_test {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25}};
		// 1. 2차원 배열 a의 2번째 행의 모든 값을 출력하시오.
		for (int i = 0; i < a[0].length; i++) {
			System.out.println(a[2][i]);
		}
		
		// 모든 값을 출력하기 위해 for문을 사용
		// a의 2번째 행의 모든 값이 조건이므로
		// a[2][i] 에서 i에는 모든 열의 인덱스가 들어가야하므로 i는 0부터 a[0].length-1까지 입력되어야함.
		// 출력을 해야하므로 sysout
		
		
		
	}

}
