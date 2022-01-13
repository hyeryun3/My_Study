package study.myself.transfer;

public class Taxi {

	int money;
	int taxiNumber;
	
	public Taxi(int taxiNumber){
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("택시번호 " + taxiNumber + "의 수입은 " + money + "원 입니다.");
	}
}
