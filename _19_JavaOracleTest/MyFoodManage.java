package _19_JavaOracleTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MyFoodManage {
	Scanner in = new Scanner(System.in);
	MyFoodManage() throws Exception {
		init();
		while (true) {
			System.out.println(" - 내가 좋아하는 음식 목록 - ");
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 삭제");
			System.out.println("3. 음식 수정");
			System.out.println("4. 음식 전체 목록");
			System.out.println("5. 끝내기");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1)
				insert();
			else if (selNum == 2)
				delete();
			else if (selNum == 3)
				modify();
			else if (selNum == 4)
				list();
			else if (selNum == 5)
				break;
		}
	}
	private void init() throws Exception {
		// 오라클 드라이버 로드하기
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	private void insert() throws Exception {
		MyFoodDTO f = new MyFoodDTO();
		System.out.println("추가할 음식의 정보를 입력하세요.");
		System.out.print("음식 종류 : ");
		f.setFoodType(in.nextLine());
		System.out.print("음식 이름 : ");
		f.setFoodName(in.nextLine());
		System.out.print("음식 맛 : ");
		f.setFoodTaste(in.nextLine());
		System.out.print("음식 주재료 : ");
		f.setFoodMain(in.nextLine());
		
//		System.out.println(f.getFoodType());
//		System.out.println(f.getFoodName());
//		System.out.println(f.getFoodTaste());
//		System.out.println(f.getFoodMain());
		
		// 커넥션 가져오기
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
//		System.out.println("1");
//		String sql = "insert myfood into values(?,?,?,?)";
		String sql = "insert into myfood values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, f.getFoodType());
		ps.setString(2, f.getFoodName());
		ps.setString(3, f.getFoodTaste());
		ps.setString(4, f.getFoodMain());

		ps.executeUpdate();
		
		con.commit();
		
		if (con != null) {
			con.close();
		}
		System.out.println("추가되었습니다.");
	}
	
	private void delete() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
		System.out.println("삭제할 음식의 이름을 입력하세요.");
		System.out.print("음식 이름 : ");
		String name = in.nextLine();
//		String sql = "delete from myfood where name = ".concat(name);
		String sql = "delete from myfood where name = "+"'"+name+"'";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.executeUpdate();
		
		con.commit();
		
		if (con != null)
			con.close();
	}
	
	private void modify() throws Exception {
		System.out.println("수정하려는 음식의 이름를 입력하세요.");
		System.out.print("음식 이름 : ");
		String bName = in.nextLine();
		System.out.println("수정할 음식의 이름를 입력하세요.");
		System.out.print("음식 이름 : ");
		String aName = in.nextLine();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
		String sql = "update myfood set name = ? where name = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, aName);
		ps.setString(2, bName);
		
		ps.executeUpdate();
		
		con.commit();
		
		if (con != null)
			con.close();
	}
	
	private void list() throws Exception {
		System.out.println("전체 목록");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
		String sql = "select * from myfood";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		con.commit();
		
		while (rs.next()) {
			MyFoodDTO DTO = new MyFoodDTO();
			DTO.setFoodType(rs.getString("type"));
			DTO.setFoodName(rs.getString("name"));
			DTO.setFoodTaste(rs.getString("taste"));
			DTO.setFoodMain(rs.getString("main"));
			System.out.println(DTO.toString());
		}
		
		if (con != null)
			con.close();
	}
	
	
}
