package _02If;

public class _00_Q {

	public static void main(String[] args) {
		// Basic
		// 영수는 게임을 개발중인데,
		// 명중에 따라 점수를 차등 부여하는 알고리즘을 개발 중 이다.
		int point = 20;
		int x = 3;	// x는 화살의 위치이며 화살의 위치는 달라진다.
		// 화살의 위치가 0~12 사이면 +10점
		// 13~20 사이이면 +9점
		// 21~30 사이이면 +8점
		// 31 이상이면 +7점을 부여한다.
		if (x >= 31) {
			point += 7;
		} else if (x >= 21) {
			point += 8;
		} else if (x >= 13) {
			point += 9;
		} else {
			point += 10;
		}
		System.out.println(point);
		
		// Up1
		// 0~12 사이이면 +10점을 획득하고
		// 0~1 사이이면 보너스 점수를 획득한다.
		// 보너스 점수는 현재 point의 10%이다.
		if (x >= 0 && x <= 12) {
			if (x >= 0 && x <= 1) {
				point *= 1.1;
			}
			point += 10;
		}
		System.out.println(point);
				
	}

}
