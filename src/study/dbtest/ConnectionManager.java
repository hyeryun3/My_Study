package study.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public Connection getConnection() {
		// TODO Auto-generated method stub
		Connection con = null;
		
		String url="jdbc:mysql://localhost:3306/shopdb";
		String driver = "com.mysql.cj.jdbc.Driver";
		String id="root";
		String pw="mcys1309";
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("클래스 찾지 못함");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("커넥션 오류");
		}
		
		return con;
	}

}
