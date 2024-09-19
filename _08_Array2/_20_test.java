package _08_Array2;

public class _20_test {

	public static void main(String[] args) {
		int sum = 0;
		int[] array = new int [5000];
		int[] notGen = new int [5000];
		int j = 0;
		for (int i = 0; i < 5000; i++) {
			j = i / 1000 + i / 100 % 10 + i / 10 % 10 + i % 10 + i;
			if (j < 5000) {
				array [j] = j;
			}
			if(array[i] == 0) {
				notGen[i] = i;
//				System.out.println(i);
			}
		}
		for (int i = 0; i < 5000; i++) {
			sum += notGen[i];
		}
		System.out.println(sum);
		
		
	}

}
