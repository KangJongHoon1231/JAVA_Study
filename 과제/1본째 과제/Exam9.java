package Java1;

/*
 * 작성일자: 2021-08-20
 * 프로그램 설명: 1부터 100까지 정수의 합을 구하는 프로그램을 작성하여라.(for문)
 * 작성자: 강종훈
 */

public class Exam9 {

	public static void main(String[] args) {

		// 시작과 끝점 설정
		int start = 1;
		int end = 100;

		int result = 0; // 결과를 저장할 변수

		for (int i = start; i <= end; i++) {
			result += i;
		}
		System.out.printf("%d~%d까지의 합: %d", start, end, result);

	}

}
