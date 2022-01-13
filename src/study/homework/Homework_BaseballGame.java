package study.homework;

import java.util.Scanner;

public class Homework_BaseballGame {

	public static void main(String[] args) {

		System.out.println();

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * 
		 * int userNum = 0; int userNums[] = new int[4]; int sysNums[] = new int[4]; int
		 * strike = 0, ball = 0;
		 * 
		 * do{ System.out.print("4자리 숫자: "); userNum = scan.nextInt();
		 * System.out.println("시스템 숫자: " + sysNum);
		 * 
		 * for (int i = userNums.length - 1; i >= 0; i--) { //자릿수 쪼개기 userNums[i] =
		 * userNum % 10; userNum /= 10;
		 * 
		 * sysNums[i] = sysNum % 10; sysNum /= 10; }
		 * 
		 * for (int i = 0; i < sysNums.length; i++) { if (userNums[i] == sysNums[i]) {
		 * strike++; } for (int j = 0; j < i; j++) { if (userNums[i] == sysNums[j] &&
		 * userNums[j] != sysNums[j]) { ball++; } } }
		 * 
		 * System.out.println(strike + "스트라이크 " + ball + "볼");
		 * 
		 * }while(strike==4);
		 */
	}

}

class baseballGame {
	private int sysNum;
	private int[] sysNums = new int[4];
	private int userNum;
	private int[] userNums = new int[4];

	public int getSysNum() {
		return sysNum;
	}

	public void setSysNum(int sysNum) {
		this.sysNum = sysNum;
	}

	public int[] getSysNums() {
		return sysNums;
	}

	public void setSysNums(int[] sysNums) {
		this.sysNums = sysNums;
	}

	public void setSysNums(int count, int nums) {
		this.sysNums[count] = nums;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public int[] getUserNums() {
		return userNums;
	}

	public void setUserNums(int[] userNums) {
		this.userNums = userNums;
	}
	
	public void setUserNums(int count, int nums) {
		this.userNums[count] = nums;
	}
}

class SystemGame {
	baseballGame game = new baseballGame();

	public baseballGame sysNum() {
		game.setSysNum((int) (Math.random() * 9999) + 1000);

//		System.out.println("시스템숫자" + game.getSysNum());

		debug();

		for (int i = game.getSysNums().length - 1; i >= 0; i--) { // 자릿수 쪼개기
			game.setSysNums(i, game.getSysNum() % 10);
			game.setSysNum(game.getSysNum() / 10);
		}
		return game;
	}

	public void debug() {
		for (int i = 0; i < game.getSysNums().length; i++) {
			for (int j = 0; j < i; j++) {
				if (game.getSysNums()[i] != game.getSysNums()[j]) {
					break;
				}
			}
		}
	}
}
