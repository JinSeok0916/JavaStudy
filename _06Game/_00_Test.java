// 프로젝트명: 점심시간
// 개발지: 최진석, 이명균, 김시온
// 개발일자: 2024-08-21
// 프로젝트 설명: 단어 맞추기를 기본으로 한 프로젝트. 기존의 단어 맞추기에서 벗어나 가운데 글자를 추론하여 맞히는 것으로 목표를 설정.
//			  두 가지의 난이도를 설정하였고, 3문제 이상 연속으로 맞혔을 경우 높은 정확도로 인하여 추가 점수를 부여.
//			  최대 140점.
package _06Game;

import java.util.Random;
import java.util.Scanner;

	public class _00_Test {

		public static void main(String[] args) {
			//기본 array, 난이도 하; game over후 다시 시작하면 난이도 하에 난이도 상 array가 덮어 씌워져 있어
			//tempa array를 만들어서 활용했음.
			String[] a = new String[20];
			//난이도 상 array;
			String[] aA = {"마라탕","똠양꿍","회덮밥","깐풍기","라볶이","설렁탕","돈부리","만두국","돈까스","된장국","떡볶이","파스타","삼겹살","김치찜","잡채밥","수제비","물냉면","전복죽","삼계탕","아욱국"};
			//난이도 하 array;
			String[] tempA =  {"탕수육","연포탕","팥빙수","비빔밥","햄버거","짜장면","순대국","감자전","순두부","육개장","갈비찜","불고기","막국수","갈비탕","쌀국수","콩국수","매운탕","리조또","닭갈비","김치전"};
			
			//색깔 추가. 앞에 색깔을 넣은뒤 exit로 다시 검정색으로 변경해줘야한다.
			final String red      = "\u001B[31m" ;
			final String blue     = "\u001B[34m" ;
			final String yellow   = "\u001B[33m" ;
			final String exit     = "\u001B[0m" ;
			
			Scanner in = new Scanner(System.in);
			Random r = new Random();
			
			System.out.println("점심 메뉴 맞추기 (빈칸을 채워라!!!)");
			String c=in.nextLine();
			
			//게임오버시 다시 돌아오기 위한 while문, 
			//기본 코드작성후 다시 돌아오는 기능이 필요하여 적용함.
			while(true) {
				
			// c가 상 또는 하 외의 다른 문자 입력 시 do 반복.
			do {
				System.out.println( yellow + "난이도" +exit + "를 선택하세요." );
				System.out.println("--------");
				System.out.println("|상| |하|");
				System.out.println("--------");
				c=in.nextLine();
			} while (!c.equals("상") && !c.equals("하"));
			
			// c의 값이 상일 경우 밑에 for문에서의 a배열을 aA배열로 치환하여 진행하도록 하는 if문
			if (c.equals("상")) {
				for (int i=0; i<a.length; i++) {
					a[i] = aA[i];
				}
			}
			
			// c의 값이 하일 경우 밑에 for문에서의 a배열을 tempA배열로 치환하여 진행하도록 하는 if문
			if (c.equals("하")) {
				for (int i=0; i<a.length; i++) {
					a[i] = tempA[i];
				}
			}
			
			System.out.println();
		    System.out.println("가운데 글자를 맞혀보세요.");
		    System.out.println();
		    
			// 랜덤수가 겹치지 않게 하기 위한 배열 생성
			int[] arr = new int[10];
			// 보너스 점수를 계산하기 위한 변수
			int cnt = 0;
			// 총 점수를 계산하기 위한 변수
			int point = 0;
			// 목숨 표시
			int life = 2;
			// 총 10문제 실행할 for문
			for (int i = 0; i < 10; i++) {
				// 랜덤한 수 10개 생성(배열에 사용할거라 0~9사용)
				int num = r.nextInt(10);
				// 랜덤수가 겹치지 않게 하기 위한 if문
				if (arr[num] != 1) {
					System.out.println(a[num].charAt(0)+"[ ]"+a[num].charAt(2));
					arr[num] = 1;
				} else {
					i -= 1;
					continue;
				}
				// 입력값
				String b = in.nextLine();

				// 입력값이 공백인 경우 처리 (기존 에러 보정)
				if (b.equals("")) {
					System.out.println(red + "오답" + exit);
					cnt = 0;
					// 틀릴때마다 목숨에 -1
					life -= 1;
					// 만약 목숨이 0이되면 game over 출력후 반복문 나가기
					if(life <=  0) {
						System.out.println("[" +"Game Over"+"]");
						break;
					}
				}
				
				// 정답일 경우 10점 추가 및 추가점수 체크
				else if (a[num].charAt(1) == b.charAt(0)) {
					System.out.println(blue + "정답" + exit);
					point += 10;
					cnt++;
				} else {
					System.out.println(red + "오답" + exit);
					cnt = 0;
					// 틀릴때마다 목숨에 -1
					life -= 1;
					// 만약 목숨이 0이되면 game over 출력후 반복문 나가기
					if(life <=  0) {
						System.out.println("[" +"Game Over"+"]");
						break;
					}
				}
				// cnt가 3이상일 경우 추가 점수 매번 부여 + 추가점수 출력
				if (cnt >= 3) { 
					point += 5;
					System.out.println(cnt+ "연속으로 정답을 맞혔습니다. (+5 점)");
					
				}
				/// 목숨을 스트링 ♥로 바꿔서 출력하기 위한 if문			
				String lifeS = "";
				
				if (life == 2) {
					lifeS = "♥♥";
					
				}else if(life == 1) {
					lifeS = "♥♡";
				}
				
				System.out.println("----------------------------");
				//점수 및 콤보 출력
				System.out.println(" 점수: " + point + " , 콤보: " + cnt);
				//생명 상태 출력
				System.out.println(" 생명: " + red+ lifeS + exit);
				// 한 칸 띄우기 위한 sysout
				System.out.println("----------------------------");
			}
			
			//목숨이 0보다 작을경우 게임을끝내고 다시 난이도 선택 하는 창으로 돌아가기.
			if(life <= 0) {								
				System.out.println("");
				continue;
			}
			
			//총점수 출력
			System.out.println("총 점수: "+point);
			
			//점수가 131점 이상이고 난이도가 "하"이면 sysout 출력후 
			//while문에서 continue, 즉 난이도 선택창으로 돌아감,
			//점수가 131점 이상이고 난이도가 "상"이면 sysout 출력 후
			//while문에서 break, 즉 게임종료.
			if(point > 130) {			
				if(c.equals("하")) {				
				System.out.println("참 잘했습니다. 다음단계에 도전하세요!");
				System.out.println("--------------------------");
				continue;				
				}				
				if(c.equals("상")) {
					System.out.println("참 잘했습니다. 하산하십시오!");
					break;
				}
			}
			
			//점수가 130점 이하이면 sysout 출력 후
			//while문에서 continue, 즉 난이도 선택창으로 다시 돌아감.
			if(point <= 130) {
				System.out.println("당신은 덜 배고픕니다. 다시 도전하세요.");
				System.out.println("--------------------------");
				continue;
			}
		}//while문 }
	
		
		
		
		
		
		
		
		
	}

}
