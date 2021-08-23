package Java1;

import java.util.Scanner;

/*
 * 작성일자: 2021-08-20
 * 프로그램 설명: Day4 과제 1번
 * 작성자: 강종훈
 */

public class Exam1 {

	public static void main(String[] args) {
/*
* 1. 주민등록번호를 입력한다. 
* 2. 각 자리를 곱을 덧셈 해준다. 
* 3. 11로 나눈다 
* 4. 11에서 빼준다
* 5. 검사
*/
		
		
		
// 1. 주민등록번호를 입력한다.
//		value: 주민등록번호
		Scanner sc = new Scanner(System.in);

		// 주민등록 번호가 임시로 담길 배열
		long[] arr_ = new long[13];
		// 정렬된 주민번호가 담길 배열
		long[] arr = new long[13];
		
		System.out.print("주민번호: ");
		long value = sc.nextLong();
		long a, b;
		
		for (int i = 0; i < arr_.length; i++) {
			a = value / 10;
			b = value % 10;
			arr_[i] = b;
			value = a;
		}
		// 주민등록 번호 재정렬
		int len = 12;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr_[len];
			len -= 1;
		}
		
//		배열 확인용 for문
		System.out.println("입력 통과");
		System.out.print("주민등록번호확인 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i==5) {
				System.out.print(" - ");
			}
		}
		System.out.println();

		
		
// 2. 각 자리의 곱을 덧셈 해준다.
		int arr2[] = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum += (int)arr[i] * arr2[i];
		}
		System.out.println("각 자리수를 모두 더한 값: " + sum);
		
		
		
// 3.11로 나누기
		int sum_ = sum%11;
		System.out.println("11로 나눈 나머지: " + sum_);

		
		
// 4.11에서 빼기
		int result = 11 - sum_;

		
		
// 5.검사
		if(arr[12] == result) {
			System.out.println("통과");
		} else {
			System.out.println("불가");
			System.out.printf("맨 끝자리 수: %d, 검사로 나온 수: %d", arr[12], result);
		}
		
		sc.close();
		
	}

}
