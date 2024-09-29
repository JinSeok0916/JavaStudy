package _10_ClassTest5Cooking;


public class Cooking_S {

	public static void main(String[] args) {
		Cooking_L l = new Cooking_L();
		Cooking_M m = new Cooking_M();
		
		m.l = l;
		l.m = m;
		
		m.start();
		
	}
	
	
}
