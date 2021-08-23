package Java1;

/*
 * 작성일자: 2021-08-20
 * 프로그램 설명: 구구단을 출력하시오.
 * 작성자: 강종훈
 */

public class Exam3 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.printf("----%d단----%n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
		}

	}

}
