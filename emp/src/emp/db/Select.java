package emp.db;

import java.sql.*;

public class Select {
	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null; //sql 쿼리문 전송
		ResultSet rs=null; //select 쿼리문 결과 담는 객체
		try {
			
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con=DriverManager.getConnection(url, user, password);
			
			if(con!=null) {
				System.out.println("연결성공");
				
				String sql="select * from emp where empno=7369";
				pstmt=con.prepareStatement(sql);
				
				rs=pstmt.executeQuery();
				
				//rs 담긴결과를 화면 출력
				
				if(rs.next()) {//ResultSet에 결과가 담겨 있는지 확인
					//컬럼 하나씩 가져오기
					int empno=rs.getInt("empno");
					String ename=rs.getString("ename");
					String job=rs.getString("job");
					int mgr=rs.getInt("mgr");
					String hiredate=rs.getString("hiredate");
					int sal=rs.getInt("sal");
					int comm=rs.getInt("comm");
					int deptno=rs.getInt("deptno");
					
					System.out.printf("%d\t%s\t%s\t%d\t%s\t%d\t%d\t%d\n" ,empno,ename,job,mgr,hiredate,sal,comm,deptno);
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
