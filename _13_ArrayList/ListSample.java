package _13_ArrayList;

import java.util.ArrayList;

public class ListSample {
	ArrayList<String> a = new ArrayList<>();
	
	public ListSample() {
		System.out.println("리스트의 길이 "+a.size());
		a.add("apple");
		System.out.println("리스트의 길이 "+a.get(0));
//		a.add(0, null);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
//		for (int i = 0; i < a.size(); i++) {
//			if (a.get(i).charAt(0) != 'a')
//				System.out.println(a.get(i));
//		}
//		a.set(1, "0");
		for (int i = 0; i < a.size(); i++) {
			a.set(0, "sv");
			System.out.println(a.get(i));
		}
	}
}
