package Java1;

import java.util.Scanner;

/* 
 * 작성일: 2021-08-20
 * 프로그램 설명: 주민등록번호를 입력 받았을 시 성별을 출력하시오
 * 작성자: 강종훈
 */

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 주민번호가 담길 배열
		long[] arr = new long[13];

		System.out.print("주민번호: ");
		long value = sc.nextLong();

//		주민등록번호를 하나씩 담을 변수
		long a, b;

		for (int i = 0; i < arr.length; i++) {
			a = value / 10;
			b = value % 10;
			arr[i] = b;
			value = a;
		}

//		성별값을 저장할 변수 gender 선언
		int gender = (int) arr[6];

		if (gender <= 2) { // 1900년도 출생의 성별 분류
			System.out.println("1900년도 출생 입니다.");
			if (gender == 1) {
				System.out.println("남자 입니다.");
			} else {
				System.out.println("여자 입니다.");
			}
		} else if (gender <= 4) { // 2000년도 출생의 성별 분류
			System.out.println("2000년도 출생 입니다.");
			if (gender == 3) {
				System.out.println("남자 입니다.");
			} else {
				System.out.println("여자 입니다.");
			}
		} else {
			System.out.println("재입력해주세요.");
		}

		sc.close();
		
	}
}
