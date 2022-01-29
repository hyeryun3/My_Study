package study.algorithmtest;

import java.util.Scanner;

public class AlgorithmProject2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = false;
		DTO dto = new DTO();
		int proNo = 0;
		String proName = "";

		while (!flag) {
			System.out.println("(1) 상품등록 (2) 상품 삭제 (3) 상품 검색 (4) 전체 상품 조회 (5) 종료");
			System.out.print("메뉴 선택 : ");
			int cmd = scan.nextInt();
			System.out.println();

			switch (cmd) {
			case 1:
				System.out.println("상품 등록");
				System.out.print("상품 번호 입력 : ");
				proNo = scan.nextInt();
				System.out.print("상품명 입력 : ");
				proName = scan.next();

				dto.insert(proNo, proName);
				System.out.println();
				break;
				
			case 2:
				System.out.print("상품 번호 입력 : ");
				proNo = scan.nextInt();
				dto.delete(proNo);
				System.out.println();
				break;
				
			case 3:
				System.out.println("상품 검색");
				System.out.print("상품 번호 입력 : ");
				proNo = scan.nextInt();
				dto.select(proNo);
				System.out.println();
				break;
				
			case 4:
				dto.selectAll();
				break;
				
			case 5:
				System.out.println("종료합니다.");
				flag = true;
				break;
			}
		}

	}

}
