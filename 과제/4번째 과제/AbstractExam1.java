package JAVA4;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * �ۼ���: 2021-08-25
 * ���α׷� ����: �߻� Ŭ������ ���� ����
 * �ۼ���: ������
 */

// ��� Ŭ����: �߻� Ŭ����
abstract class Employee {
	// �ν��Ͻ� ����
	String name; // �̸�
	String dept; // �μ�

	// ������ �޼ҵ�
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	// �߻� �޼ҵ�
	public abstract double payCheck();

	public abstract void printEmployee();

} // end to Employee class

// Ragular Class : ���� Ŭ����(Concreate Class)

class Regular extends Employee {
	// �ν��Ͻ� ����
	private String empNo; // ���
	private int yearSalary; // ����
	private double bonusRate; // ���ʽ�������

	public Regular(String name, String dept, String empNo, int yearSalary, double bonusRate) {
		super(name, dept);
		this.empNo = empNo;
		this.yearSalary = yearSalary;
		this.bonusRate = bonusRate;

	}

	// ��� ���� ���
	@Override
	public void printEmployee() {
		System.out.printf("�����: %s, ", super.name);
		System.out.printf("���: %s, ", super.dept);
		System.out.printf("����: %s, ", yearSalary);
		System.out.printf("���ʽ� ������: %s, ", bonusRate);
	}

	@Override
	// �޼ҵ� �������̵�(payCheck)
	public double payCheck() {
		double pay = yearSalary + ((yearSalary / 12) * (bonusRate / 100));
		BigDecimal obj = new BigDecimal(pay);
		return Double.parseDouble(obj.toString());

	}
} // end Ragular Class

// NonRegular class

class NonRegular extends Employee {

	private int basicPay; // �⺻�ӱ�
	private String expireDate; // ��ุ����

	public NonRegular(String name, String dept, String expiredate, int basicpay) {
		super(name, dept); // �θ� Ŭ���� ȣ��
		this.basicPay = basicpay;
		this.expireDate = expiredate;
	}

	@Override
	public void printEmployee() {
		System.out.printf("�����: %s, ", super.name);
		System.out.printf("���: %s, ", super.dept);
		System.out.printf("��� ������: %s, ", expireDate);
		System.out.printf("�⺻ �ӱ�: %,d, ", basicPay);
	}

	// �޿� Ȯ��
	@Override
	public double payCheck() {
		double pay = (double) basicPay;
		BigDecimal obj1 = new BigDecimal(pay);
		return Double.parseDouble(obj1.toString());
	}

	// �⺻�ӱ� Ȯ��
	public int getBasicPay() {
		return basicPay;
	}

	// �⺻�ӱ� ������Ʈ
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}

} // end NonRegular class

// Internship class

class Internship extends NonRegular {

	// ���� ����
	private double payPercent; // �ӱ�������

	// ������
	public Internship(String name, String dept, String expiredate, int basicpay, double paypercent) {
		super(name, dept, expiredate, basicpay);
		this.payPercent = paypercent;
	}

	// ���� ���
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("�ӱ� ������: %,.2f ", payPercent);
	}

	// �޿� Ȯ��
	@Override
	public double payCheck() {
		int basicpay = super.getBasicPay();
		double pay = basicpay + (basicpay * payPercent);
		BigDecimal obj1 = new BigDecimal(pay);
		return Double.parseDouble(obj1.toString());
	}

} // end Internship class

// Temporary class (�ӽ���)
class Temporary extends NonRegular {

	// ����
	private int payRate; // �ð����ӱ�
	private int workHours; // �ٹ��ð�

	public Temporary(String name, String dept, String expiredate, int basicpay, int payrate, int workhours) {
		super(name, dept, expiredate, basicpay);
		this.payRate = payrate;
		this.workHours = workhours;
	}

	// �������
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("�ð� �� �ӱ� : %,d, ", this.payRate);
		System.out.printf("�ٹ��ð� : %d, ", this.workHours);
	}

	// �ӱ� ���
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

//		// ������ �ӱ�
//		Regular reg = new Regular("�̱浿", "�λ��", "10", 80000000, 200);
//		reg.printEmployee();
//		System.out.printf("�ӱ�: %,.2f%n",reg.payCheck());
//		
//		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
//		
//		// �������� �ӱ�
//		NonRegular reg2 = new NonRegular("��浿", "�����", "2021-10-10", 80000000);
//		double basicpay = reg2.payCheck();
//		
//		// ���������� �⺻ �ӱ�
//		reg2.printEmployee();
//		System.out.printf("�������� �ӱ�: %,.2f%n", basicpay);
//				
//		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
//		
//		// ���� �ӱ�
//		NonRegular reg3 = new Internship("������", "�λ��", "2021-09-20", (int)basicpay, 0.05); 
//		reg3.printEmployee();
//		System.out.printf("���� �ӱ�: %,.2f%n", reg3.payCheck());
//		
//		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
//		
//		// �ӽ��� �ӱ�
//		NonRegular reg4 = new Temporary("���ӽ���", "������", "2021-10-30", (int)basicpay, 80000, 8); 
//		reg4.printEmployee();
//		System.out.printf("�ӽ��� �ӱ�: %,.2f", reg4.payCheck());
//		
//		

//	Scanner�� �Է� �޴� ����

		Scanner sc = new Scanner(System.in);

		// ��ĳ�ʷ� �޾Ƽ� �ϴ� ��������

//		�̸� �μ� ��� ���� ���ʽ� ����
		System.out.print("�̸�: ");
		String name = sc.next(); // �̸�

		System.out.print("�μ�: ");
		String dept = sc.next(); // �μ�

		System.out.print("����� ������¸� �Է��� �ּ���: ");
		String emp = sc.next();

		if (emp.equals("������")) { // ������°� ������ �� ��

			System.out.print("���: ");
			String empno = sc.next(); // ���

			System.out.print("����: ");
			int yearsalary = sc.nextInt(); // ����

			System.out.print("���ʽ� ����: ");
			double bonusrate = sc.nextDouble(); // ���ʽ�����

			// ���� �� ���
			Regular reg = new Regular(name, dept, empno, yearsalary, bonusrate);
			reg.printEmployee();
			System.out.printf("�ӱ�: %,.2f%n", reg.payCheck());

			
		} else if (emp.equals("��������")) { // ���������� ��
			
			System.out.print("����  or �ӽ���: ");
			String emp2 = sc.next(); // �� ������ ������ ����, �ӽ��� ����
			
			// �������� �ӱ�
			System.out.print("�����: ");
			String expiredate = sc.next(); // �����

			System.out.print("���� �ӱ�: ");
			int basicpay = sc.nextInt(); // �ӱ�

			NonRegular reg2 = new NonRegular(name, dept, expiredate, basicpay);

			
			if (emp2.equals("����")) { // ������ ��
				
				System.out.print("�ӱ�������: ");
				double paypercent = sc.nextDouble();
				
				NonRegular reg3 = new Internship(name, dept, expiredate, basicpay, paypercent);
				reg3.printEmployee();
				System.out.printf("���� �ӱ�: %,.2f%n", reg3.payCheck());

				
			} else if (emp2.equals("�ӽ���")) { // �ӽ����� ��
				
				
				// �ӽ��� �ӱ�
				System.out.print("�ñ�: ");
				int payrate = sc.nextInt();
				
				System.out.print("�ٹ��ð�: ");
				int workhours = sc.nextInt();
				
				NonRegular reg4 = new Temporary(name, dept, expiredate, basicpay, payrate, workhours); 
				reg4.printEmployee();
				System.out.printf("�ӽ��� �ӱ�: %,.2f", reg4.payCheck());
			}

		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}

	}

}
