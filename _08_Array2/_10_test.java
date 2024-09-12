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
		
		// 우선 규칙을 찾기 위해 배열을 좌표형식으로 바꾼 뒤
		// 좌표의 두 값 중 고정되는 값이 있고, 변화하는 값이 있다는 규칙을 찾았다.
		// 규칙에 따르면 오른쪽으로 회전할 때는 좌표의 y값은 x값이 대입되고 x값은 전체 배열의 마지막 인덱스값에서 y값을 뺀 값이 된다.
		// 왼쪽으로 회전할 때는 반대로 좌표의 x값은 y값이 대입되고 y값은 전체 배열의 마지막 인덱스값에서 x값을 뺀 값이 된다. 
		
	}

}
