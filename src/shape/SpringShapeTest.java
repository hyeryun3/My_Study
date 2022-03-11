package shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("shape/applicationContext.xml");
		shape[0]=ac.getBean("t1",Shape.class);
		shape[1]=ac.getBean("r1",Shape.class);
		shape[2]=ac.getBean("t2",Shape.class);
		shape[3]=ac.getBean("r2",Shape.class);
		shape[4]=ac.getBean("t3",Shape.class);
		shape[5]=ac.getBean("r3",Shape.class);
		
		System.out.println("기본정보");
		for(Shape ans:shape) {
			System.out.println(ans.getClass().getSimpleName()+"\t"+ ans.getArea() + "\t" + ans.getColors());
		}
		
		System.out.println();
		System.out.println("사이즈를 변경 후 정보");
		for(Shape ans:shape) {
			((Resize)ans).setResize(5);
			System.out.println(ans.getClass().getSimpleName()+"\t"+ ans.getArea() + "\t" + ans.getColors());
		}
	}
	

	
}
