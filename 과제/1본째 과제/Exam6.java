package Java1;

/*
 * �ۼ�����: 2021-08-20
 * ���α׷� ����: 1 3 5 7 9�� for, while, do ~ while���� �̿��� ����Ͽ���.
 * �ۼ���: ������
 */

public class Exam6 {

	public static void main(String[] args) {

		int start = 1;
		int end = 100;
		
		// for��
		System.out.print("for�� ���: ");
		for (int i = start; i < end; i += 2) {
			System.out.printf("%d ", i);
		}
		System.out.println();

		
		// While��
		System.out.print("while�� ���: ");
		int i = start; // while�������� ����� ���� i�� ����
		while (i < end) {
			System.out.printf("%d ", i);
			i += 2;
		}
		System.out.println();

		
		// do ~ while��
		System.out.print("do~while ���: ");
		int j = start; // do ~ while������ ����� ���� j�� ����
		do {
			System.out.printf("%d ", j);
			j += 2;

		} while (j < end);

	}

}
