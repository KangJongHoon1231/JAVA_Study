package Java1;

import java.util.Random;

/*
 * �ۼ�����: 2021-08-20
 * ���α׷� ����: 1 ~ 45 ������ ������ �����ϴ� ���α׷��� �����Ͻÿ�.
 * �ۼ���: ������
 */

public class Exam10 {
	public static void main(String[] args) {

		// ���� Ŭ������ ��ü�� ����
		Random ran = new Random();

		// ���� ����
		int num = ran.nextInt(45);

		// ���
		System.out.println("���� : " + num);

	}
}
