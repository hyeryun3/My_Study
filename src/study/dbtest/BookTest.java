package study.dbtest;

import java.sql.SQLException;

public class BookTest {

	public static void main(String[] args) {
		BookDAO dao = new BookDAO();
		
		
		try {
			BookDTO book = new BookDTO("B004","자바스크립트","강길동",2020,28000,"서울출판사");
			dao.insertBook(book);
			dao.selectBook();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
	
}
