package study.homework;

public class Homework_Lotto {

	public static void main(String[] args) {
		Print print = new Print();
		System.out.println("<<로또 추첨>>");
		print.print();
	}
}

class Lotto {

	public Lotto() {
	}

	private int nums[] = new int[7];

	public int[] getNums() {
		return nums;
	}

	public void setNums(int count, int num) {
		this.nums[count] = num;
	}

	public void change(int i, int j) {
		int temp = 0;
		temp = getNums()[i];
		this.nums[i] = getNums()[j];
		this.nums[j] = temp;
	}
}

class Rand { // 로또 숫자 뽑기(중복처리)
	public Lotto rand() {
		Lotto lotto = new Lotto();
		for (int i = 0; i < lotto.getNums().length; i++) {
			lotto.setNums(i, (int) (Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				if (lotto.getNums()[j] > lotto.getNums()[i]) { // 정렬
					lotto.change(i, j);
				}
				if (i != j && lotto.getNums()[i] == lotto.getNums()[j]) { // 중복 제거
					i--;
				}
			}
		}
		return lotto;
	}
}

class Print { // 출력하기
	public void print() {
		Rand rand = new Rand();
		Lotto lotto = rand.rand();

		for (int i = 0; i < lotto.getNums().length; i++) {
			try {
				Thread.sleep(1000);
				if (i < 6) {
					System.out.println(i + 1 + "번째 숫자 : " + lotto.getNums()[i]);
				} else
					System.out.println("★보너스 숫자 : " + lotto.getNums()[i] + "★");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}