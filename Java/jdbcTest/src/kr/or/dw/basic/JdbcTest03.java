package kr.or.dw.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest03 {

	public static void main(String[] args) {
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ksj", "java");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sj", "java");
			
			System.out.println("empno값을 입력하세요");
			int input = Integer.parseInt(sc.nextLine());
			
			String sql = "select * from emp where empno > ?";
			pstmt = conn.prepareStatement(sql);
			// SQL문의 물음표(?) 자리에 들어갈 데이터를 셋팅한다.
			// 형식) pstmt.set자료형이름(물음표순번, 데이터)
			pstmt.setInt(1, input);
			rs = pstmt.executeQuery();
			
			System.out.println("━━━━━━━━━━━━━━━━━ SQL문의 처리 결과 ━━━━━━━━━━━━━━━━━");
			System.out.println("<empno>\t<ename>\t<job>");
			while (rs.next()) {
				System.out.println(rs.getInt("empno") + "\t" + rs.getString("ename") + "\t" + rs.getString("job"));
			}
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			
			if (rs != null) try {rs.close();} catch (SQLException e2) {}
			if (conn != null) try {conn.close();} catch (SQLException e2) {}
			if (pstmt != null) try {pstmt.close();} catch (SQLException e2) {}
		}

	}

}
