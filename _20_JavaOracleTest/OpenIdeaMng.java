package _20_JavaOracleTest;

import java.util.ArrayList;
import java.util.Scanner;

public class OpenIdeaMng {
	Scanner in = new Scanner(System.in);
	OpenIdeaDAO DAO = OpenIdeaDAO.DAO();
	
	OpenIdeaMng() {
		while (true) {
			System.out.println();
			System.out.println(" - 아이디어 공모전 프로그램 - ");
			System.out.println("1. 아이디어 제안하기");
			System.out.println("2. 아이디어 수정하기");
			System.out.println("3. 아이디어 삭제하기");
			System.out.println("4. 아이디어 전체보기");
			System.out.println("5. 아이디어 제목으로 검색하기");
			System.out.println("6. 종료");
			System.out.print("번호 : ");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1)
				sug();
			else if (selNum == 2)
				mod();
			else if (selNum == 3)
				del();
			else if (selNum == 4)
				list();
			else if (selNum == 5)
				search();
			else if (selNum == 6)
				break;
			else
				System.out.println("다시 입력해주세요.");
		}
	}

	private void sug() {
		System.out.println();
		System.out.println(" - 제안서 - ");
		System.out.println("제목을 입력하세요.");
		System.out.print("제목 : ");
		String title = in.nextLine();
		System.out.println("설명을 입력하세요.");
		System.out.print("설명 : ");
		String explain = in.nextLine();
		System.out.println("작성자를 입력하세요.");
		System.out.print("작성자 : ");
		String name = in.nextLine();
		OpenIdeaDTO DTO = new OpenIdeaDTO();
		DTO.setTitle(title);
		DTO.setExplain(explain);
		DTO.setName(name);
		DAO.suggest(DTO);
	}
	
	private void mod() {
		ArrayList<OpenIdeaDTO> iList = DAO.list();
		System.out.println();
		System.out.println("전체 아이디어의 목록입니다.");
		for (OpenIdeaDTO DTO : iList) {
			System.out.println(DTO.toString());
		}
		System.out.println();
		System.out.println("수정할 아이디어의 번호를 입력하세요.");
		System.out.print("번호 : ");
		String num = in.nextLine();
		OpenIdeaDTO DTO = DAO.searchNum(num);
		if (DTO != null) {
			System.out.println(DTO.toString());
			while (true) {
				System.out.println();
				System.out.println("수정하고싶은 정보를 선택하세요. (작성자는 수정할 수 없습니다.)");
				System.out.println("1. 제목");
				System.out.println("2. 설명");
				System.out.println("3. 메뉴로 돌아가기");
				System.out.print("번호 : ");
				int number = in.nextInt();
				in.nextLine();
				if (number == 1) {
					System.out.println("수정하려는 제목을 입력하세요.");
					System.out.print("제목 : ");
					String title = in.nextLine();
					DTO.setTitle(title);
					System.out.println(DTO.toString());
					DAO.modTitle(DTO);
					break;
				} else if (number == 2) {
					System.out.println("수정하려는 설명을 입력하세요.");
					System.out.print("설명 : ");
					String explain = in.nextLine();
					DTO.setExplain(explain);
					DAO.modExplain(DTO);
				} else if (number == 3) {
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
			}
		} else {
			System.out.println("해당하는 번호의 아이디어가 없습니다.");
		}
	}
	
	private void del() {
		System.out.println();
		System.out.println("삭제할 아이디어의 번호를 입력하세요.");
		System.out.print("번호 : ");
		String num = in.nextLine();
	}
	
	private void list() {
		ArrayList<OpenIdeaDTO> iList = DAO.list();
		System.out.println();
		System.out.println("전체 아이디어의 목록입니다.");
		for (OpenIdeaDTO DTO : iList) {
			System.out.println(DTO.toString());
		}
		
	}
	
	private void search() {
		System.out.println();
		System.out.println("검색할 아이디어의 제목을 입력하세요.");
		System.out.print("제목 : ");
		String title = in.nextLine();
		OpenIdeaDTO DTO = DAO.searchTitle(title);
		if (DTO != null) {
			System.out.println();
			System.out.println("해당하는 제목의 아이디어입니다.");
			System.out.println(DTO.toString());
		} else
			System.out.println("해당하는 제목의 아이디어가 없습니다.");
		
		
	}
	
	
	
}
