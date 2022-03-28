package ex1;

import java.sql.*;

public class MemberTest {
	private static final String dirver="oracle.jdbc.driver.OracleDriver";
	private static final String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String user="scott";
	private static final String pwd="TIGER";
	public static void main(String[] args) {
			Connection conn;
			Statement stmt;
			ResultSet rs;
			try {
				Class.forName(dirver);
				System.out.println("Oracle 드라이버 로딩 성공");
				conn=DriverManager.getConnection(url, user, pwd);
				System.out.println("Connection 생성 성공");
				
				stmt=conn.createStatement();
				System.out.println("Statement 객체 성공");
				
				
				
			}catch(Exception e) {
				
			}
	}
}
