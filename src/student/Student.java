package student;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	private double avg;
	private String grade;
	
	public Student() {	}
	
	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public double getAvg() {
		avg= (double)(korean + english + math + science)/4;
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		getAvg();
//		char grade=' ';
		
		if(avg>=90) {
			grade="A학점";
		}else if(avg>=70) {
			grade="B학점";
		}else if(avg>=50) {
			grade="C학점";
		}else if(avg>=30) {
			grade="D학점";
		}else {
			grade="F학점";
		}
		
		return " 학점:"+grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	

}
