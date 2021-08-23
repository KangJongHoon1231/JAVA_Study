package Java1;

import java.util.Scanner;

/*
 * 작성일자: 2021-08-20
 * 프로그램 설명: 정수형 데이터를 입력받아 짤수, 홀수를 판단 후 출력
 * 작성자: 강종훈
 */

public class Exam5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		}

		sc.close();
	}

}
