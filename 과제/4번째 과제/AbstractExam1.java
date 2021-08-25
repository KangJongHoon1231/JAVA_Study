package JAVA4;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * 작성일: 2021-08-25
 * 프로그램 설명: 추상 클래스에 대한 과제
 * 작성자: 강종훈
 */

// 사원 클래스: 추상 클래스
abstract class Employee {
	// 인스턴스 변수
	String name; // 이름
	String dept; // 부서

	// 생성자 메소드
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	// 추상 메소드
	public abstract double payCheck();

	public abstract void printEmployee();

} // end to Employee class

// Ragular Class : 구상 클래스(Concreate Class)

class Regular extends Employee {
	// 인스턴스 변수
	private String empNo; // 사번
	private int yearSalary; // 연봉
	private double bonusRate; // 보너스지급율

	public Regular(String name, String dept, String empNo, int yearSalary, double bonusRate) {
		super(name, dept);
		this.empNo = empNo;
		this.yearSalary = yearSalary;
		this.bonusRate = bonusRate;

	}

	// 사원 정보 출력
	@Override
	public void printEmployee() {
		System.out.printf("사원명: %s, ", super.name);
		System.out.printf("사번: %s, ", super.dept);
		System.out.printf("연봉: %s, ", yearSalary);
		System.out.printf("보너스 지급율: %s, ", bonusRate);
	}

	@Override
	// 메소드 오버라이딩(payCheck)
	public double payCheck() {
		double pay = yearSalary + ((yearSalary / 12) * (bonusRate / 100));
		BigDecimal obj = new BigDecimal(pay);
		return Double.parseDouble(obj.toString());

	}
} // end Ragular Class

// NonRegular class

class NonRegular extends Employee {

	private int basicPay; // 기본임금
	private String expireDate; // 계약만료일

	public NonRegular(String name, String dept, String expiredate, int basicpay) {
		super(name, dept); // 부모 클래스 호출
		this.basicPay = basicpay;
		this.expireDate = expiredate;
	}

	@Override
	public void printEmployee() {
		System.out.printf("사원명: %s, ", super.name);
		System.out.printf("사번: %s, ", super.dept);
		System.out.printf("계약 만료일: %s, ", expireDate);
		System.out.printf("기본 임금: %,d, ", basicPay);
	}

	// 급여 확인
	@Override
	public double payCheck() {
		double pay = (double) basicPay;
		BigDecimal obj1 = new BigDecimal(pay);
		return Double.parseDouble(obj1.toString());
	}

	// 기본임금 확인
	public int getBasicPay() {
		return basicPay;
	}

	// 기본임금 업데이트
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}

} // end NonRegular class

// Internship class

class Internship extends NonRegular {

	// 변수 선언
	private double payPercent; // 임금지급율

	// 생성자
	public Internship(String name, String dept, String expiredate, int basicpay, double paypercent) {
		super(name, dept, expiredate, basicpay);
		this.payPercent = paypercent;
	}

	// 정보 출력
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("임금 지급율: %,.2f ", payPercent);
	}

	// 급여 확인
	@Override
	public double payCheck() {
		int basicpay = super.getBasicPay();
		double pay = basicpay + (basicpay * payPercent);
		BigDecimal obj1 = new BigDecimal(pay);
		return Double.parseDouble(obj1.toString());
	}

} // end Internship class

// Temporary class (임시직)
class Temporary extends NonRegular {

	// 변수
	private int payRate; // 시간당임금
	private int workHours; // 근무시간

	public Temporary(String name, String dept, String expiredate, int basicpay, int payrate, int workhours) {
		super(name, dept, expiredate, basicpay);
		this.payRate = payrate;
		this.workHours = workhours;
	}

	// 정보출력
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("시간 당 임금 : %,d, ", this.payRate);
		System.out.printf("근무시간 : %d, ", this.workHours);
	}

	// 임금 계산
	@Override
	public double payCheck() {
		int basicpay = super.getBasicPay();
		double pay = basicpay + (payRate * workHours);
		BigDecimal obj1 = new BigDecimal(pay);
		return Double.parseDouble(obj1.toString());
	}

} // end Temporary class

public class AbstractExam1 {

	public static void main(String[] args) {

//		// 정규직 임금
//		Regular reg = new Regular("이길동", "인사부", "10", 80000000, 200);
//		reg.printEmployee();
//		System.out.printf("임금: %,.2f%n",reg.payCheck());
//		
//		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
//		
//		// 비정규직 임금
//		NonRegular reg2 = new NonRegular("삼길동", "설계부", "2021-10-10", 80000000);
//		double basicpay = reg2.payCheck();
//		
//		// 비정규직의 기본 임금
//		reg2.printEmployee();
//		System.out.printf("비정규직 임금: %,.2f%n", basicpay);
//				
//		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
//		
//		// 인턴 임금
//		NonRegular reg3 = new Internship("김인턴", "인사부", "2021-09-20", (int)basicpay, 0.05); 
//		reg3.printEmployee();
//		System.out.printf("인턴 임금: %,.2f%n", reg3.payCheck());
//		
//		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
//		
//		// 임시직 임금
//		NonRegular reg4 = new Temporary("김임시직", "영업부", "2021-10-30", (int)basicpay, 80000, 8); 
//		reg4.printEmployee();
//		System.out.printf("임시직 임금: %,.2f", reg4.payCheck());
//		
//		

//	Scanner로 입력 받는 버전

		Scanner sc = new Scanner(System.in);

		// 스캐너로 받아서 일단 직업부터

//		이름 부서 사번 연봉 보너스 비율
		System.out.print("이름: ");
		String name = sc.next(); // 이름

		System.out.print("부서: ");
		String dept = sc.next(); // 부서

		System.out.print("당신의 고용형태를 입력해 주세요: ");
		String emp = sc.next();

		if (emp.equals("정규직")) { // 고용형태가 정규직 일 때

			System.out.print("사번: ");
			String empno = sc.next(); // 사번

			System.out.print("연봉: ");
			int yearsalary = sc.nextInt(); // 연봉

			System.out.print("보너스 비율: ");
			double bonusrate = sc.nextDouble(); // 보너스비율

			// 대입 및 출력
			Regular reg = new Regular(name, dept, empno, yearsalary, bonusrate);
			reg.printEmployee();
			System.out.printf("임금: %,.2f%n", reg.payCheck());

			
		} else if (emp.equals("비정규직")) { // 비정규직일 때
			
			System.out.print("인턴  or 임시직: ");
			String emp2 = sc.next(); // 비 정규직 내에서 인턴, 임시직 구분
			
			// 비정규직 임금
			System.out.print("퇴사일: ");
			String expiredate = sc.next(); // 퇴사일

			System.out.print("현재 임금: ");
			int basicpay = sc.nextInt(); // 임금

			NonRegular reg2 = new NonRegular(name, dept, expiredate, basicpay);

			
			if (emp2.equals("인턴")) { // 인턴일 때
				
				System.out.print("임금지급율: ");
				double paypercent = sc.nextDouble();
				
				NonRegular reg3 = new Internship(name, dept, expiredate, basicpay, paypercent);
				reg3.printEmployee();
				System.out.printf("인턴 임금: %,.2f%n", reg3.payCheck());

				
			} else if (emp2.equals("임시직")) { // 임시직일 때
				
				
				// 임시직 임금
				System.out.print("시급: ");
				int payrate = sc.nextInt();
				
				System.out.print("근무시간: ");
				int workhours = sc.nextInt();
				
				NonRegular reg4 = new Temporary(name, dept, expiredate, basicpay, payrate, workhours); 
				reg4.printEmployee();
				System.out.printf("임시직 임금: %,.2f", reg4.payCheck());
			}

		} else {
			System.out.println("잘못된 입력입니다.");
		}

	}

}
