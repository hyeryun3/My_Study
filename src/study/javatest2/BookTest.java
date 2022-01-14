package study.javatest2;

public class BookTest {

	public static void main(String[] args) {
		BookTest bookTest = new BookTest();
		bookTest.test1();
		System.out.println();
		bookTest.test2();
	}
	
	void test1() {
		Book book1 = new Book("B001", "자바 프로그래밍\t", "홍길동", 25000, 2021, "멀티출판사");
		Book book2 = new Book("B002", "자바스크립트\t", "이몽룡", 30000, 2020, "서울출판사");
		Book book3 = new Book("B003", "HTML/CSS\t", "성춘향", 18000, 2021, "강남출판사");
		
		System.out.println("도서번호\t도서명\t\t\t저자\t가격\t발행일\t\t출판사");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
	}
	
	void test2() {
		Book megazine1 = new Megazine("M001","자바 월드\t","홍길동",25000,2021,"멀티출판사",5);
		Book megazine2 = new Megazine("M002","웹 월드\t\t","이몽룡",30000,2020,"서울출판사",7);
		Book megazine3 = new Megazine("M003","게임 월드\t","성춘향",18000,2021,"강남출판사",9);
		
		System.out.println("잡지번호\t잡지명\t\t\t발행인\t가격\t발행연도\t출판사\t   발행월");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(megazine1.toString());
		System.out.println(megazine2.toString());
		System.out.println(megazine3.toString());
	}
}
