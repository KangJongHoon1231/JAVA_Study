package Java1;

import java.util.Scanner;

/*
 * �ۼ�����: 2021-08-20
 * ���α׷� ����: Day4 ���� 1��
 * �ۼ���: ������
 */

public class Exam1 {

	public static void main(String[] args) {
/*
* 1. �ֹε�Ϲ�ȣ�� �Է��Ѵ�. 
* 2. �� �ڸ��� ���� ���� ���ش�. 
* 3. 11�� ������ 
* 4. 11���� ���ش�
* 5. �˻�
*/
		
		
		
// 1. �ֹε�Ϲ�ȣ�� �Է��Ѵ�.
//		value: �ֹε�Ϲ�ȣ
		Scanner sc = new Scanner(System.in);

		// �ֹε�� ��ȣ�� �ӽ÷� ��� �迭
		long[] arr_ = new long[13];
		// ���ĵ� �ֹι�ȣ�� ��� �迭
		long[] arr = new long[13];
		
		System.out.print("�ֹι�ȣ: ");
		long value = sc.nextLong();
		long a, b;
		
		for (int i = 0; i < arr_.length; i++) {
			a = value / 10;
			b = value % 10;
			arr_[i] = b;
			value = a;
		}
		// �ֹε�� ��ȣ ������
		int len = 12;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr_[len];
			len -= 1;
		}
		
//		�迭 Ȯ�ο� for��
		System.out.println("�Է� ���");
		System.out.print("�ֹε�Ϲ�ȣȮ�� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i==5) {
				System.out.print(" - ");
			}
		}
		System.out.println();

		
		
// 2. �� �ڸ��� ���� ���� ���ش�.
		int arr2[] = {2,3,4,5,6,7,8,9,2,3,4,5};
		
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum += (int)arr[i] * arr2[i];
		}
		System.out.println("�� �ڸ����� ��� ���� ��: " + sum);
		
		
		
// 3.11�� ������
		int sum_ = sum%11;
		System.out.println("11�� ���� ������: " + sum_);

		
		
// 4.11���� ����
		int result = 11 - sum_;

		
		
// 5.�˻�
		if(arr[12] == result) {
			System.out.println("���");
		} else {
			System.out.println("�Ұ�");
			System.out.printf("�� ���ڸ� ��: %d, �˻�� ���� ��: %d", arr[12], result);
		}
		
		sc.close();
		
	}

}
