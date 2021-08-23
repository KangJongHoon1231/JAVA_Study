package JAVA2;

/*
 * 작성일: 2021-08-23
 * 프로그램 설명: 5명의 학생이 국어, 영어, 수학 점수를 배열에 저장하여 각 학생별 총점 및 평균을 구하여라.
 * 작성자: 강종훈
 * comment: for ~ each문을 활용하는법 피드백 부탁드립니다.
 */



public class Exam1 {
	
	public static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	
	public static void main(String[] args) {
		
		// 점수들을 저장할 배열
		int[] korean = {100, 85, 50, 75, 100}; // 국어 점수
		int[] english = {90, 90, 50, 90, 90};  // 영어 점수 
		int[] math = {90, 80, 60, 80, 60};     // 수학 점수
		int[] sum = new int[5];				   // 총점 배열
		int[] avg = new int[5]; 			   // 각 학생별 평균  
		
		
		// for문 활용
		// 총합 ,평균 구하기
//		for (int i = 0; i < korean.length; i++) {
//			sum[i] = (korean[i] + english[i] + math[i]); // 총합 구하기
//			avg[i] = sum[i]/3;                           // 평균 구하기
//		}
		
		
		// 출력하기
//		for (int i = 0; i < avg.length; i++) {
//			
//			System.out.printf("총점: %d, ", sum[i]);
//			System.out.printf("평균: %d%n", avg[i]);
//		}
		
// ************************************************************************
		
		// for ~ each문
		int[] co = {0,1,2,3,4};
		// 총합 구하기
		for (int i: co) {
			sum[i] = add(korean[i],english[i], math[i]);
		}
				
		
		// 평균 구하기
		for (int i : co) {
			avg[i] = sum[i]/3;
			i++;
		}
		
		
		// 출력하기
		for (int i: co) {
			System.out.printf("총합: %d ", sum[i]);
			System.out.printf("평균: %d", avg[i]);
			System.out.println();
		}
	}	

}
