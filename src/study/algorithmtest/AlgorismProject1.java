package study.algorithmtest;

import java.util.Scanner;

public class AlgorismProject1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int stdNum = 0;
		System.out.print("학생 수 입력 : ");
		stdNum = scan.nextInt();
		int[] score = new int[stdNum];

		System.out.println();
		for (int i = 0; i < stdNum; i++) {
			System.out.print("학생 " + (i + 1) + " 점수 입력 : ");
			score[i] = scan.nextInt();
		}
		System.out.println();
		
		quickSort(score);
		printResult(score);

	}

	static void quickSort(int score[]) {
		int start = 0;
		int end = score.length - 1;

		quickSort(score, start, end);
	}

	private static void quickSort(int[] score, int start, int end) {
		int part2 = partition(score, start, end); 
		if (start < part2 - 1) {	//왼쪽 파트
			quickSort(score, start, part2 - 1);
		}
		if (part2 < end) {	//오른쪽 파트
			quickSort(score, part2, end);
		}
	}

	private static int partition(int[] score, int start, int end) {
		int pv = score[(start + end) / 2];

		while (start <= end) {
			while (score[start] > pv) {
				start++;
			}
			while (score[end] < pv) {
				end--;
			}

			if (start <= end) {
//				System.out.println(score[start] + "이랑 " + score[end] + " 바꿔");
				swap(score, start, end);
//				printResult(score);
				start++;
				end--;
			}
		}
		return start;
	}
//	private static int partition(int[] score, int start, int end) {
//		int pv = score[(start + end) / 2];
//		
//		while (start <= end) {
//			while (score[start] < pv) {
//				start++;
//			}
//			while (score[end] > pv) {
//				end--;
//			}
//			
//			if (start <= end) {
//				System.out.println(score[start] + "이랑 " + score[end] + " 바꿔");
//				swap(score, start, end);
//				printResult(score);
//				start++;
//				end--;
//			}
//		}
//		return start;
//	}

//	static int[] quickSort(int score[]) {
//		int idx1 = 1;
//		int idx2 = score.length - 1;
//		int pv = 0;
//
//		while (idx1 < idx2) {
//			while(score[pv] < score[idx1]) {
//				System.out.println("idx1 : "+idx1);
//				idx1++;
//				System.out.println("idx1쁠 : "+idx1);
//			}
//
//			while(score[pv] > score[idx2]) {
//				System.out.println("idx2 : " + idx2);
//				idx2--;
//				System.out.println("idx2마 : " + idx2);
//			}
//			
//			if (idx1 > idx2) {
//				System.out.println("어긋났어");
//				swap(score,pv, score[idx1]>score[idx2]?idx1 : idx2);
//				System.out.println("어긋나서 바꿧어");
//				printResult(score);
//			}else {
//				System.out.println("바꿔?");
//				swap(score,idx1,idx2);
//				System.out.println("왜?");
//				printResult(score);
//			}
//			
//		}
//		
//		return score;
//
//	}

	static void swap(int[] score, int a, int b) {
		int temp = score[a];
		score[a] = score[b];
		score[b] = temp;
	}

	static void printResult(int[] score) {
		System.out.println("성적 순으로 정렬");
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1+"등 : " + score[i]);
		}
	}
}
