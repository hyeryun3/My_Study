package calculator;

public class Test04 {

	public static void main(String[] args) {
		
		Calc calc = new Calc(args[0],args[1],args[2],args[3]);
		int sum = calc.calcSum();
		float avg = (float)sum/args.length;
		char grade=' ';
		
		if(avg>=90) {
			grade='A';
		}else if(avg>=70) {
			grade='B';
		}else if(avg>=50) {
			grade='C';
		}else if(avg>=30) {
			grade='D';
		}else {
			grade='F';
		}
		
		System.out.println("Sum:"+sum);
		System.out.println("Avg:"+avg);
		System.out.println(grade+"학점");
	}
}
