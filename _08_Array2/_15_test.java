package _08_Array2;

public class _15_test {

	public static void main(String[] args) {
		int [][] a = new int [4][5];
		int num = 1;
		
		int y = 1;
		for (int x = 0; x < 20; x++) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					if (i + j == y - 1) {
						a[i][j] = num;
						num++;
						y++;
					}
				}
			}
			if (num == a.length+a[0].length) {
				y = (a.length-2)+(a[0].length-1);
				for (int i = a.length-1; i >= 1; i--) {
					for (int j = a[0].length-1; j >= 0; j--) {
						if (i + j == y) {
							a[i][j] = num;
							num++;
							y--;
						}
					}
				}
			}
//			if (num == a.length+a[0].length+a.length+a[0].length-3) {
//				y = 2;
//				for (int i = 1; i < a.length-1; i++) {
//					for (int j = 1; j < a[0].length-1; j++) {
//						if (i + j == y) {
//							a[i][j] = num;
//							num++;
//							y++;
//						}
//					}
//				}
//			}
		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
