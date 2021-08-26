package JAVA5;

import java.util.Scanner;

/*
 * 작성일: 2021-08-26
 * 프로그램 설명: 로또 프로그램 
 * 작성자: 강종훈
 * 
 * 1. 로또 번호 자동생성
 * - 1 ~ 45 사이의 정수여야 한다
 * - 6개의 숫자로 구성
 * - 숫자가 중복되어서는 안된다.
 * - 오름차순으로 정렬하여 출력
 *
 * 2. 키보드를 통해서 6개의 로또번호를 입력받은 후 
 * - 당첨의 경우
 * - 6개의 숫자 일치 : "축 1등 당첨"
 * - 5개의 숫자 일치 : "축 2등 당첨"
 * - 4개의 숫자 일치 : "축 3등 당첨"
 * - 나머지: "다음 기회를 이용하세요"
 * 
 * 3. Lotto, LottoManager 2개의 클래스로 구현
 * 
 * 4. 정렬은 선택 정렬을 사용
 *
 */

public class LottoManager {
	
	public static void main(String[] args) {
		
//		1번 작업
		Lotto lo = new Lotto();
		
		
		// 난수 생성
//		int[] randnum = lo.createRandomNum();
//		
//		System.out.print("정렬 전: ");
//		for(int num : randnum) {
//			System.out.printf("%d, ",num);
//		}
//		System.out.println();
//
//		
//		// 선택 정렬
//		int[] sortnum = lo.selection_sort(randnum);
//		
//		System.out.print("정렬 후: ");
//		for(int num1 : sortnum) {
//			System.out.printf("%d, ",num1);
//		}
//		
		
//		2번 작업
		
		Scanner sc = new Scanner(System.in);
		
		// 키보드로 입력받은 수를 저장할 배열
		int[] res = new int[6];
		
		// 당첨된 번호 입력
		for (int i = 0; i < res.length; i++) {
			res[i] = sc.nextInt();
		}

		lo.resultCheck(res); // 당첨 결과 확인	
		
	}

}
