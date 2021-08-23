package Java1;

/*
 * 작성일자: 2021-08-20
 * 프로그램 설명: 구구단 문제2
 * 작성자: 강종훈
 */

public class Exam4 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %2d   ", j, i, j*i);
			}
			System.out.println();
		}

	}
	
}
