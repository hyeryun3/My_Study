package book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBookTest {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("book/applicationContext.xml");
		Book b1 = ac.getBean("b1",Book.class);
		Book b2 = ac.getBean("b2",Book.class);
		Book b3 = ac.getBean("b3",Book.class);
		
		System.out.println("책이름\t\t가격\t할인율\t할인후금액");
		System.out.println("----------------------------------------");
		System.out.println(b1.getBookName() + "\t" + b1.getBookPrice() + "원\t" + b1.getBookDiscountRate() +"%\t"+ b1.getDiscountBookPrice()+"원");
		System.out.println(b2.getBookName() + "\t" + b2.getBookPrice() + "원\t" + b2.getBookDiscountRate() +"%\t"+ b2.getDiscountBookPrice()+"원");
		System.out.println(b3.getBookName() + "\t" + b3.getBookPrice() + "원\t" + b3.getBookDiscountRate() +"%\t"+ b3.getDiscountBookPrice()+"원");

	}
}
