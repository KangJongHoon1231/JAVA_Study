package Java1;

/*
 * �ۼ�����: 2021-08-20
 * ���α׷� ����: 1���� 100���� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͽ���.(for��)
 * �ۼ���: ������
 */

public class Exam9 {

	public static void main(String[] args) {

		// ���۰� ���� ����
		int start = 1;
		int end = 100;

		int result = 0; // ����� ������ ����

		for (int i = start; i <= end; i++) {
			result += i;
		}
		System.out.printf("%d~%d������ ��: %d", start, end, result);

	}

}
