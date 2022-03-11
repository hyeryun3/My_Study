package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest05 {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("student/applicationContext.xml");
		
		Student Kim = ac.getBean("kim",Student.class);
		Student Lee = ac.getBean("lee",Student.class);
		Student Park = ac.getBean("park",Student.class);
		
		
		System.out.println(Kim.getName() + " 평균:"+ Kim.getAvg() + Kim.getGrade());
		System.out.println(Lee.getName() + " 평균:"+ Lee.getAvg() + Lee.getGrade());
		System.out.println(Park.getName() + " 평균:"+ Park.getAvg() + Park.getGrade());
	}
}
