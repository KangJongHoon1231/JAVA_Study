package Java1;

/*
 * 작성일자: 2021-08-20
 * 프로그램 설명: 10 9 8 7 .. 1 을 for문으로 작성하여라.
 * 작성자: 강종훈
 */

public class Exam7 {

	public static void main(String[] args) {

		int num = 10; // 최초 시작 변수
		for (int i = 0; i < 10; i++) {
			int result = num - i; // 1루프 마다 -1씩 해준다.
			System.out.printf("%d ", result); // 출력
		}
	}

}
