package study.javatest1;

public class Product {

	private int prdNo;
	private String prdName;
	private int prdPrice;
	private int prdYear;
	private String prdMaker;
	
	public Product(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		
		return String.format("%03d\t  %s   %-7d %d    %s",prdNo,prdName,prdPrice,prdYear,prdMaker);
	}
}
