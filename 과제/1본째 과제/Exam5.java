package Java1;

import java.util.Scanner;

/*
 * �ۼ�����: 2021-08-20
 * ���α׷� ����: ������ �����͸� �Է¹޾� ©��, Ȧ���� �Ǵ� �� ���
 * �ۼ���: ������
 */

public class Exam5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else if (num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		}

		sc.close();
	}

}
