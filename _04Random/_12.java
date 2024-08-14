package _04Random;

import java.util.Random;
import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		int[]num = new int[10];
		Random r = new Random();
		for(int i=0; i<num.length; i++) {
			int k=r.nextInt(100);
			num[i]=k;
		}
		for(int i=0; i<=99; i++) {
			if(i==num.length) {
				System.out.println(i);
			}if(i%2!=0){
				num[i]=0;
			}else {
				System.out.println(i);
			}
		}
	}
}
