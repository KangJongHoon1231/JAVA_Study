package Java1;

/*
 * 작성일자: 2021-08-20
 * 프로그램 설명: 1 3 5 7 9를 for, while, do ~ while문을 이용해 출력하여라.
 * 작성자: 강종훈
 */

public class Exam6 {

	public static void main(String[] args) {

		int start = 1;
		int end = 100;
		
		// for문
		System.out.print("for문 방식: ");
		for (int i = start; i < end; i += 2) {
			System.out.printf("%d ", i);
		}
		System.out.println();

		
		// While문
		System.out.print("while문 방식: ");
		int i = start; // while문에서만 사용할 변수 i를 선언
		while (i < end) {
			System.out.printf("%d ", i);
			i += 2;
		}
		System.out.println();

		
		// do ~ while문
		System.out.print("do~while 방식: ");
		int j = start; // do ~ while문에서 사용할 변수 j를 선언
		do {
			System.out.printf("%d ", j);
			j += 2;

		} while (j < end);

	}

}
