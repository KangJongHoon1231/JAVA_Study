package Java1;

/*
 * �ۼ�����: 2021-08-20
 * ���α׷� ����: 5!�� for������ �����Ͽ���
 * �ۼ���: ������
 */

public class Exam8 {

	public static void main(String[] args) {

		int result = 1;
		for (int i = 1; i < 6; i++) {
			int num = i;
			result *= num;
		}
		System.out.println(result);
	}

}
