package JAVA3;

import java.util.Scanner;

/*
 * 작성일: 2021-08-24
 * 프로그램 설명: 계좌관리 프로그래밍 과제
 * 작성자: 강종훈
 */

public class AccountManager {

	
	public static void main(String[] args) {
		
// 기본적인 구현
		Account acc = new Account("123-12-123456", "돈송금", "암호", 20000);
				
		try {

			// 입금
			acc.deposit(5000);
			
			// 출금
			acc.widthdraw(6000);
			
			// PW변경
			acc.setPassword("변경된 암호");
			
			// 계좌 정보 출력
			acc.printAccount();

			// 잔액조회
			System.out.print("돈송금 잔액: ");
			acc.getBalance();
	
			// 계좌 송금
			acc.tranceForAccount(acc, 5000); // arg값: (송금을 보낼 객체, 송금액)
						
			System.out.println("계좌이체 후");
			System.out.print("돈송금 잔액: ");
			acc.getBalance();
			

			
		} catch (Exception e) {
			System.out.printf("%s",e.getMessage());
		}
		
	
// 배열로 구현		
//		Account[] acc = new Account[5];
//		acc[0] = new Account("222-22-22222", "영길동", "암호1", 1000);
//		acc[1] = new Account("333-33-33333", "일길동", "암호2", 2000);
//		acc[2] = new Account("444-44-44444", "이길동", "암호3", 3000);
//		acc[3] = new Account("555-55-55555", "삼길동", "암호4", 4000);
//		acc[4] = new Account("666-66-66666", "사길동", "암호5", 5000);

		// 반복문 사용

		
//		// 입금
//		acc[0].deposit(5000);
//		
//		// 출금
//		acc[0].widthdraw(6000);
//		
//		// 잔액조회
//		acc[0].getBalance();
//		
//		// PW변경
//		acc[0].setPassword("변경된 암호");
//		
//		// 계좌 정보 출력
//		acc[0].printAccount();
	
	}
}
