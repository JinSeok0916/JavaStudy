package _01Array;

public class _01_Test {

	public static void main(String[] args) {
		// 문제1
		int [] array = new int [5];
		array[0] = 30;
		array[1] = 40;
		array[2] = 50;
		array[3] = 60;
		array[4] = 55;
		System.out.println(array[0]+"/"+array[1]+"/"+array[2]+"/"+array[3]+"/"+array[4]);
		// 문제2
		String [] name = new String [3];
		name[0] = "kim";
		name[1] = "lee";
		name[2] = "park";
		System.out.println(name[0]+","+name[1]+","+name[2]);
		// 문제3
		int [] lotto = new int [6];
		lotto[0] = 6;
		lotto[1] = 12;
		lotto[2] = 33;
		lotto[3] = 4;
		lotto[4] = 5;
		lotto[5] = 26;
		lotto[2] = lotto[2] + 2;
		// 문제4
		System.out.println(lotto[0]+lotto[2]+lotto[4]);
		// 문제5
		lotto[0] = lotto[0];
		lotto[1] = lotto[0] + lotto[1];
		lotto[2] = lotto[0] + lotto[1] + lotto[2];
		lotto[3] = lotto[0] + lotto[1] + lotto[2] + lotto[3];
		lotto[4] = lotto[0] + lotto[1] + lotto[2] + lotto[3] + lotto[4];
		lotto[5] = lotto[0] + lotto[1] + lotto[2] + lotto[3] + lotto[4] + lotto[5];		
		// 문제6
		System.out.println(lotto[3]%2==1);
		// 문제7
		int money = 2750;
		int pay = 10000;
		int change = pay - money; 
		System.out.println("천원 "+(change/1000)+"개, "+"백원 "+((change%1000)/100)+"개, "+"십원 "+((change%100)/10)+"개");
		// 문제8
		int xA = 700;
		int yA = 500;		
		int xB = 900;
		int yB = 300;
		int xC = 650;
		int yC = 150;
		System.out.println(xC <= xA + 1.5 ? "false" : xC >= xB - 1.5 ? "false" : yC <= yB + 1.5 ? "false" : yC >= yA - 1.5 ? "false" : "true");
	}

}
