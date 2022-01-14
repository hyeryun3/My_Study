package study.javatest2;

public class Megazine extends Book{

	int month;
	
	public Megazine(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher,int month) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.month = month;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return String.format("%-9s %s %s   %d   %-8d  %s     %2d",getBookNo(),getBookTitle(),getBookAuthor(),getBookPrice(),getBookYear(),getBookPublisher(),month);
		return super.toString() + "\t" + month;
	}
}