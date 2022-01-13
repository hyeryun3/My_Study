package study.myself.transfer;

public class TakeTrans {
	public static void main(String[] args) {
		Student student1 = new Student("james", 5000);
		Student student2 = new Student("tomas",10000);
		
		Bus bus100 = new Bus(100);
		student1.takeBus(bus100);
		student1.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		student2.takeSubway(subwayGreen);
		student2.showInfo();
		subwayGreen.showInfo();
		
		Student student3 = new Student("heidi", 5000);
		Taxi taxi5655 = new Taxi(5655);
		student3.takeTaxi(taxi5655);
		student3.showInfo();
		taxi5655.showInfo();
	}
}
