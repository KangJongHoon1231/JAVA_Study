package Java1;

/*
 * 작성일자: 2021-08-20
 * 프로그램 설명: 5!을 for문으로 구현하여라
 * 작성자: 강종훈
 */

public class Exam8 {

	public static void main(String[] args) {

		int result = 1;
		for (int i = 1; i < 6; i++) {
			int num = i;
			result *= num;
		}
		System.out.println(result);
	}

}
