package JAVA3;

/*
 * 작성일: 2021-08-24
 * 프로그램 설명: 계좌관리 프로그래밍 과제
 * 작성자: 강종훈
 */


public class Account {

/* 변수
* 계좌번호(accontNumber): 문자열
* 이름(name): 문자열
* 비밀번호(password): 문자열
* 잔액(balance):정수형
*/
	
	private String accontNumber;
	private String name;
	private String password;
	private int balance;
	
	public Account(String accontNumber, String name, String password, int balance) {
		super();
		this.accontNumber = accontNumber;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	
		
/*
* 메소드
* 입금(deposit) : void
* 출금(widthdraw) : void
* 잔액조회(getBalance) : void
* 비밀번호 변경(setPassword) : void
* 계좌정보 출력(printAccount) : void
* 
*/
	// 입금
	public void deposit(int money) {
		this.balance += money;
	}
	
	// 출금
	public void widthdraw(int money) {
		this.balance -= money;
	}
	
	// 잔액조회
	public void getBalance() {
		System.out.printf("잔액은: %d입니다.%n", this.balance);
	}
	
	// 비밀번호 변경
	public void setPassword(String password) {
		this.password = password;
	}
	
	// 계좌정보 출력
	public void printAccount() {
		System.out.printf("계좌 번호: %s%n", this.accontNumber);
		System.out.printf("이름: %s%n", this.name);
		System.out.printf("비밀 번호: %s%n", this.password);
		System.out.printf("계좌 번호: %d%n", this.balance);
	}


	
	// 계좌번호
	public String getAccontNumber() {
		return accontNumber;
	}
	
	public void setAccontNumber(String accontNumber) {
		this.accontNumber = accontNumber;
	}

	
	
	// 이름
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	
	// 비밀번호 확인
	public String getPassword() {
		return password;
	}

	
	
	// 계좌 갱신
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
