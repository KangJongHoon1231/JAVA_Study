package Java1;

import java.util.Random;

/*
 * 작성일자: 2021-08-20
 * 프로그램 설명: 1 ~ 45 사이의 난수를 생성하는 프로그램을 구현하시오.
 * 작성자: 강종훈
 */

public class Exam10 {
	public static void main(String[] args) {

		// 랜덤 클래스의 객체를 생성
		Random ran = new Random();

		// 난수 생성
		int num = ran.nextInt(45);

		// 출력
		System.out.println("난수 : " + num);

	}
}
