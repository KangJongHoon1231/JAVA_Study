package Java1;

import java.util.Scanner;

/* 
 * �ۼ���: 2021-08-20
 * ���α׷� ����: �ֹε�Ϲ�ȣ�� �Է� �޾��� �� ������ ����Ͻÿ�
 * �ۼ���: ������
 */

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �ֹι�ȣ�� ��� �迭
		long[] arr = new long[13];

		System.out.print("�ֹι�ȣ: ");
		long value = sc.nextLong();

//		�ֹε�Ϲ�ȣ�� �ϳ��� ���� ����
		long a, b;

		for (int i = 0; i < arr.length; i++) {
			a = value / 10;
			b = value % 10;
			arr[i] = b;
			value = a;
		}

//		�������� ������ ���� gender ����
		int gender = (int) arr[6];

		if (gender <= 2) { // 1900�⵵ ����� ���� �з�
			System.out.println("1900�⵵ ��� �Դϴ�.");
			if (gender == 1) {
				System.out.println("���� �Դϴ�.");
			} else {
				System.out.println("���� �Դϴ�.");
			}
		} else if (gender <= 4) { // 2000�⵵ ����� ���� �з�
			System.out.println("2000�⵵ ��� �Դϴ�.");
			if (gender == 3) {
				System.out.println("���� �Դϴ�.");
			} else {
				System.out.println("���� �Դϴ�.");
			}
		} else {
			System.out.println("���Է����ּ���.");
		}

		sc.close();
		
	}
}
