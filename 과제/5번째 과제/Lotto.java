package JAVA5;

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
 * 2. 당첨의 경우
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

public class Lotto {

	public int[] createRandomNum() {
		// 랜덤수가 담길 배열
		int[] arr = new int[6];
		
		// 1~45 사이의 6개의 랜덤한 숫자 생성
		for (int i = 0; i < 6; i++) {
			int randnum = (int) (Math.random() * 45) + 1;
//			System.out.println(randnum);
			arr[i] = randnum;
		}
		return arr;
		
	}

	// 오름차순 정렬
	public int[] selection_sort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			
			
			// 최솟값 찾기
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			
			// i번째 값과 찾은 최소값을 서로 교환
			swap(arr, min_index, i);
		}
		return arr;
	}
	
	
	// 교환 함수
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	
	// 당첨 등수 확인
	
	public void resultCheck(int[] arr) {
		
		// 동일한 숫자의 갯수
		int count = 0; // 같은 수의 카운트
		
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = 0; // 임시적으로 담길 카운트
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
						temp++; // 순회하며 숫자가 같다면 +1
				}
				if(count < temp) { // 기존의 카운트보다 신규카운트가 높다면 갱신
					count = temp;
				}
			}
		}
		
		if (count == 6) {
			System.out.println("축 1등 당첨");
		} else if (count == 5) {
			System.out.println("축 2등 당첨");
		} else if (count == 4) {
			System.out.println("축 3등 당첨");
		} else {
			System.out.println("다음 기회를 이용하세요");
		}
		
		
	}



}
