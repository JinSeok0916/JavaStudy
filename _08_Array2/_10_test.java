package _08_Array2;

public class _10_test {

	public static void main(String[] args) {
		// 테트리스
		// 문제 1. 오른쪽 회전
		int [][] a = {{1,1,1,0,0},
					  {0,1,1,0,0},
					  {0,0,1,0,0},
					  {0,0,1,1,0},
					  {1,0,1,1,1}};
//		0,0 > 2,0 || 0,1 > 1,0 || 0,2 > 0,0
//		1,0 > 2,1 || 1,1 > 1,1 || 1,2 > 0,1
//		2,0 > 2,2 || 2,1 > 1,2 || 2,2 > 0,2
		
		int [][] b = new int [a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[i][j] = a[a.length-j-1][i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(b[i][j]);
			} System.out.println();
		}
		
		System.out.println();
		
		// 문제 2. 왼쪽 회전
		int [][] c = new int [a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = a[j][a.length-i-1];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(c[i][j]);
			} System.out.println();
		}
		
		
		
	}

}
