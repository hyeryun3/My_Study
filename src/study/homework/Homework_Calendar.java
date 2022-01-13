package study.homework;

import java.util.Calendar;
import java.util.Scanner;

public class Homework_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int year, month;

		while (true) {
			System.out.print("연도를 입력하세요 : ");
			year = scan.nextInt();
			if (year == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

			System.out.print("월을 입력하세요 : ");
			month = scan.nextInt();
			if (month == 0) {
				for (int i = 1; i <= 12; i++) {
					Cal(year, i);
				}
			} else {
				Cal(year, month);
			}

		}
		
	}

	public static void Cal(int year, int month) {
		
		Calendar cal = Calendar.getInstance();
		int dates;

		cal.set(year, month - 1, 1);

		int lastdate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int cnt = 0;

		System.out.println("\r" + year + "년 " + month + "월");
		System.out.println("=====================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		for (int i = 1; i <= lastdate; i++) {
			cal.set(year, month - 1, i);
			dates = cal.get(Calendar.DAY_OF_WEEK); // 1(일)7(토)
			cnt++;

			if (cnt == 1 && dates != 1) {
				for (int j = 1; j < dates; j++) {
					System.out.print("\t");
				}
			}

			System.out.print(i + "\t");

			if (dates == 7) {
				System.out.println("");
			}
		}

		System.out.println("\r=====================================================\r");
	}

}
