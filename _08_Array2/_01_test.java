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
	}

}
