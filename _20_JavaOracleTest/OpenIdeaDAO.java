package _20_JavaOracleTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class OpenIdeaDAO {
	private String userName = "system";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private Connection con = null;
	public static OpenIdeaDAO DAO = null;
	
	public static OpenIdeaDAO DAO() {
		if (DAO == null)
			DAO = new OpenIdeaDAO();
		return DAO;
	}
	
	private OpenIdeaDAO() {
		init();
	}
	
	private void init() {	// 드라이버 로드
		try {
			Class.forName(driverName);
//			System.out.println("오라클 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private boolean con() {	// 커넥션 가져오는 공통 코드를 메서드로 정의
		try {
			con = DriverManager.getConnection(url, userName, password);
//			System.out.println("커넥션 자원 획득 성공");
			return true;	// 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void suggest(OpenIdeaDTO DTO) {
		if (con()) {
			try {
				String sql = "insert into openidea values(num.nextval,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, DTO.getTitle());
				ps.setString(2, DTO.getExplain());
				ps.setString(3, DTO.getName());
				ps.executeUpdate();
				con.commit();
			} catch (Exception e) {
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		}
	}
	
	public ArrayList<OpenIdeaDTO> list() {
		ArrayList<OpenIdeaDTO> iList = new ArrayList<>();
		if (con()) {
			try {
				String sql = "select * from openidea";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					OpenIdeaDTO temp = new OpenIdeaDTO();
					temp.setNum(rs.getString("num"));
					temp.setTitle(rs.getString("title"));
					temp.setExplain(rs.getString("explain"));
					temp.setName(rs.getString("name"));
					iList.add(temp);
				}
			} catch (Exception e) {
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		}
		return iList;
	}
	
	public OpenIdeaDTO searchNum(String num) {
		if (con()) {
			try {
				String sql = "select * from openidea where num = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, num);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					OpenIdeaDTO temp = new OpenIdeaDTO();
					temp.setNum(rs.getString("num"));
					temp.setTitle(rs.getString("title"));
					temp.setExplain(rs.getString("explain"));
					temp.setName(rs.getString("name"));
					return temp;
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		}
		return null;
	}
	
	public OpenIdeaDTO searchTitle(String title) {
		if (con()) {
			try {
				String sql = "select * from openidea where title = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, title);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					OpenIdeaDTO temp = new OpenIdeaDTO();
					temp.setNum(rs.getString("num"));
					temp.setTitle(rs.getString("title"));
					temp.setExplain(rs.getString("explain"));
					temp.setName(rs.getString("name"));
					return temp;
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		}
		return null;
	}
	
	public void modTitle(OpenIdeaDTO DTO) {
		if (con()) {
			try {
				String sql = "update openidea set title = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, DTO.getTitle());
				ps.setString(2, DTO.getNum());
				ps.executeUpdate();
				con.commit();
			} catch (Exception e) {
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		}
	}
	
	public void modExplain(OpenIdeaDTO DTO) {
		if (con()) {
			try {
				String sql = "update openidea set explain = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, DTO.getExplain());
				System.out.println("성공1");
				ps.executeUpdate();
				System.out.println("성공2");
				con.commit();
				System.out.println("성공3");
			} catch (Exception e) {
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		}
	}
	
	
	
	
	
	
	
	
}
