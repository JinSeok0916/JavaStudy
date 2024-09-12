package _08_Array2;

public class _08_0911_q1_q5 {

	public static void main(String[] args) {
		// 2차원 배열 문제1~5 풀이
		int[][] a= new int[4][5];
		int num = 1;
		int row = a.length;
		int col = a[0].length;
		
		// 문제1---------------------------------
		for (int i=col-1; i>=0; i--) {
			for (int j=0; j<row; j++) {
				a[j][i]=num;
				num++;
			}
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
				a[i][j]=0;
			}
			System.out.println();
		}
		System.out.println("---------문제1");
		
		// 문제2---------------------------------
		num=1;
		for (int i=row-1; i>=0; i--) {
			for (int j=col-1; j>=0; j--) {
				a[i][j]=num;
				num++;
			}
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
				a[i][j]=0;
			}
			System.out.println();
		}
		System.out.println("---------문제2");

		// 문제3---------------------------------
		num=1;
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				if (i%2==0) {
					a[i][j]=num;
				} else {
					a[i][col-j-1]=num;
				}
				num++;
			}
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
				a[i][j]=0;
			}
			System.out.println();
		}
		System.out.println("---------문제3");
		
		// 문제4---------------------------------
		num=1;
		for (int i=0; i < col+3; i++) {
			for (int j=0; j < row; j++) {
				int column = i-j;
				if (column > -1 && column < col) {
					a[j][column]=num;
					num++;
				}
			}
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
				a[i][j]=0;
			}
			System.out.println();
		}
		System.out.println("---------문제4");
		
		// 문제5---------------------------------
		num=1;
		int x=0;
		int y=0;
		int col_l=0, col_r=col-1;
		int row_u=0, row_d=row-1;
		while (num <= col*row) {
			for (x=col_l; x <= col_r && num <= col*row; x++) a[y][x]=num++;
			x--;
			row_u++;
			for (y=row_u; y <= row_d && num <= col*row; y++) a[y][x]=num++;
			y--;
			col_r--;
			for (x=col_r; x >= col_l && num <= col*row; x--) a[y][x]=num++;
			x++;
			row_d--;
			for (y=row_d; y >= row_u && num <= col*row; y--) a[y][x]=num++;
			y++;
			col_l++;
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
				a[i][j]=0;
			}
			System.out.println();
		}
		System.out.println("---------문제5");
	}

}
