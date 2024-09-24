package _11_Method;

public class Main {

	public static void main(String[] args) {
//		TestMethod r = new TestMethod();
		
		// Method study
		//	 index  012345
		String a = "880104";
		String b = a.substring(0,2);
		System.out.println(b);
		
		// 다음 에러의 원인을 서술하시오.
		// 리턴 타입이 String 이나 저장 변수는 int 타입이다. 미스매치타입.
//		int month = a.substring(0,1);
		
		System.out.println(a.contains("8"));
		
		// 과제 : 제목에서 개나리 부분을 ***으로 바꾸시오.
		String title = "오늘 컨디션 참 개나리야 짜증!";
		title = title.replace("개나리","***");
		System.out.println(title);
		
		// 과제 : 제목에서 개나리라는 단어가 포함된 부분을 가져오세요.
		//		 단어가 포함된 기준은 개나리 단어의 시작부터 스페이스까지
//		System.out.println(a.substring(title.indexOf("개나리"),title.indexOf(" ")));
		
		
	}

}
