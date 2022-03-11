package calculator;

public class Calc {

	private int a, b, c, d;
	private int sum;

	public Calc() {	}

	public Calc(String a, String b, String c, String d) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		this.c = Integer.parseInt(c);
		this.d = Integer.parseInt(d);
	}

	public int calcSum() {
		sum = a + b + c + d;
		return sum;
	}
}
