package _08_Array2;

public class _07_test {

	public static void main(String[] args) {
		// 1 1 0 2
		// 3 2 1 2
		// 0 0 3 2
		// 4 4 4 4
		// 2 4 3 1
		// 2 4 1 3
		
		// 7. 위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다.
		//	  제거가 가능한 블록의 좌표를 출력하시오.
		int [][] a = {{1,1,0,2},
					  {3,4,1,2},
					  {0,4,3,2},
					  {4,4,4,4},
					  {2,4,3,1},
					  {2,4,1,3}};
		int b = 0;
		for (int y = 0; y < a[0].length; y++) {
			for (int x = 0; x < a.length-2; x++) {
				if (a[x][y] == a[x+1][y] && a[x+1][y] == a[x+2][y]) {
					for (int z = 0; z < a.length-x; z++) {
						if (a[x][y] != a[x+z][y]) {
							b = z;
							break;
						} else System.out.println((x+z)+","+y);
					}
					if (x < a.length-3 && x > 2) {
						x = x + 7 - 3;
					}
				}
			}
		}
		
		
//		int y = 0;
//		for (int i = 0; i < a.length-2; i++) {
//			for (int k = 0; k < a[0].length; k++) {
//				if (a[i][k] == a[i+1][k] && a[i+1][k] == a[i+2][k]) {
//					for (int x = 0; x < a.length-i; x++) {
//						if (a[i][k] != a[i+x][k]) {
//							y = x;
//							break;
//						} else System.out.println((i+x)+","+k);
//					} if (i < a.length-3 ) {
//						i = i + y - 3;
//					}
//				}
//			}
//		}	
	}
}
