package _08_Array2;

public class _08_test {

	public static void main(String[] args) {
		// 1 1 0 2
		// 3 2 1 2
		// 0 0 3 2
		// 4 4 4 4
		// 2 4 3 1
		// 2 4 1 3

		// 8. 위와 같은 게임 배열에서 같은 번호가 가로나 세로로 각각 3개 이상이면 제거가 가능하다.
		//	  제거가 가능한 블록의 좌표를 출력하시오.
		int [][] a = {{1,1,0,2},
					  {3,2,1,2},
					  {0,0,3,2},
					  {4,4,4,4},
					  {2,4,3,1},
					  {2,4,1,3}};
		for (int i = 0; i < a[0].length; i++) {
			for (int k = 0; k < a.length-2; k++) {
				if (a[i][k] == a[i+1][k] && a[i][k] == a[i+2][k]) {
					for (int x = 0; x < a.length-3; x++) {
						if (a[i][k] != a[i+x][k]) {
							break;
						}
						else System.out.println((i+x)+","+k);
					}
				}
			}
		}
		for (int i = 0; i < a[0].length; i++) {
			for (int k = 0; k < a.length-2; k++) {
				if (a[i][k] == a[i+1][k] && a[i][k] == a[i+2][k]) {
					for (int x = 0; x < a.length-3; x++) {
						if (a[i][k] != a[i+x][k]) {
							break;
						}
						else System.out.println((i+x)+","+k);
					}
				}
			}
		}
		
	}
}
