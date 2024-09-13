package _08_Array2;

public class _08_0911_q4 {

	public static void main(String[] args) {
		// 2차원 배열 문제1~5 풀이
		int[][] a= new int[4][5];
		int num = 1;
		int row = a.length;
		int col = a[0].length;

		// 0,0
		// 0,1 1,0
		// 0,2 1,1 2,0
		// 0,3 1,2 2,1 3,0
		// 0,4 1,3 2,2 3,1
		//     1,4 2,3 3,2
		//         2,4 3,3
		//             3,4
		
		for (int i=0; i < 8; i++) {
			for (int j=0; j<row; j++ ) {
				if ((i-j) >= 0 && (i-j) <col) {
					System.out.print("a["+j+"]["+(i-j)+"]="+num+"\t");
					a[j][(i-j)]=num++;
				}
			}
			System.out.println();	
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
				a[i][j]= 0;
			}
			System.out.println();
		}
		System.out.println("---------문제4");

	}

}
