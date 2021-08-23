package JAVA2;

/*
 * 작성일: 2021-08-23
 * 프로그램 설명: double[] nums = { 4.5, 2.3, 5.2, 6.7, 8.9, 1.2 } 를 출력하여라
 * 작성자: 강종훈
 */

public class Exam2 {

	public static void main(String[] args) {

		// for 방식
		double[] nums = { 4.5, 2.3, 5.2, 6.7, 8.9, 1.2 };

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%.1f\t", nums[i]);

		}
		System.out.println(); // 줄바꿈

		// for each문
		for (double num : nums) {
			System.out.printf("%.1f\t", num);
		}
	}

}
