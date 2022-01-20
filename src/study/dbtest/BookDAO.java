package study.dbtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;


public class BookDAO {

	public void insertBook(BookDTO dto) throws SQLException {
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		
		String sql = "insert into book(bookNo,bookTitle,bookAuthor,bookYear,bookPrice,bookPublisher) values(?,?,?,?,?,?)";

		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, dto.getBookNo());
		pstmt.setString(2, dto.getBookTitle());
		pstmt.setString(3, dto.getBookAuthor());
		pstmt.setInt(4, dto.getBookYear());
		pstmt.setInt(5, dto.getBookPrice());
		pstmt.setString(6, dto.getBookPublisher());
		
//		pstmt.setString(1, "B004");
//		pstmt.setString(2, "자바스크립트");
//		pstmt.setString(3, "강길동");
//		pstmt.setInt(4, 2020);
//		pstmt.setInt(5, 28000);
//		pstmt.setString(6, "서울출판사");
		
		int affectedCount = pstmt.executeUpdate();
		if(affectedCount>0) {
			System.out.println("삽입 완료");
		} else {
			System.out.println("삽입 실패");
		}
		
		pstmt.close();
		con.close();
		
//		('B004','자바스크립트','강길동',2020,28000,'서울출판사')";
	}
	
	public void selectBook() throws SQLException {
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		
		String sql = "select * from book";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
	
		while(rs.next()) {
//			System.out.printf("%s %s %s %s %s %s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4) + "\t");
			System.out.print(rs.getString(5) + "\t");
			System.out.print(rs.getString(6));
			System.out.println();
		}
		rs.close();
		stmt.close();
	}
	
}
