package _03For;

public class _123 {

	public static void main(String[] args) {
		String test = "abcdeabce";
		int cntA = 0;
		for (int i = 0; i < 9; i++) {
			char aaa = test.charAt(i);
			if (aaa == 'a') {
				cntA++;
			}
		}
		System.out.println(cntA);
		

	}

}
