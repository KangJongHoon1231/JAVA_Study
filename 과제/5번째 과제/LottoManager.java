package JAVA5;

import java.util.Scanner;

/*
 * �ۼ���: 2021-08-26
 * ���α׷� ����: �ζ� ���α׷� 
 * �ۼ���: ������
 * 
 * 1. �ζ� ��ȣ �ڵ�����
 * - 1 ~ 45 ������ �������� �Ѵ�
 * - 6���� ���ڷ� ����
 * - ���ڰ� �ߺ��Ǿ�� �ȵȴ�.
 * - ������������ �����Ͽ� ���
 *
 * 2. Ű���带 ���ؼ� 6���� �ζǹ�ȣ�� �Է¹��� �� 
 * - ��÷�� ���
 * - 6���� ���� ��ġ : "�� 1�� ��÷"
 * - 5���� ���� ��ġ : "�� 2�� ��÷"
 * - 4���� ���� ��ġ : "�� 3�� ��÷"
 * - ������: "���� ��ȸ�� �̿��ϼ���"
 * 
 * 3. Lotto, LottoManager 2���� Ŭ������ ����
 * 
 * 4. ������ ���� ������ ���
 *
 */

public class LottoManager {
	
	public static void main(String[] args) {
		
//		1�� �۾�
		Lotto lo = new Lotto();
		
		
		// ���� ����
//		int[] randnum = lo.createRandomNum();
//		
//		System.out.print("���� ��: ");
//		for(int num : randnum) {
//			System.out.printf("%d, ",num);
//		}
//		System.out.println();
//
//		
//		// ���� ����
//		int[] sortnum = lo.selection_sort(randnum);
//		
//		System.out.print("���� ��: ");
//		for(int num1 : sortnum) {
//			System.out.printf("%d, ",num1);
//		}
//		
		
//		2�� �۾�
		
		Scanner sc = new Scanner(System.in);
		
		// Ű����� �Է¹��� ���� ������ �迭
		int[] res = new int[6];
		
		// ��÷�� ��ȣ �Է�
		for (int i = 0; i < res.length; i++) {
			res[i] = sc.nextInt();
		}

		lo.resultCheck(res); // ��÷ ��� Ȯ��	
		
	}

}
