package JAVA5;

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
 * 2. ��÷�� ���
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

public class Lotto {

	public int[] createRandomNum() {
		// �������� ��� �迭
		int[] arr = new int[6];
		
		// 1~45 ������ 6���� ������ ���� ����
		for (int i = 0; i < 6; i++) {
			int randnum = (int) (Math.random() * 45) + 1;
//			System.out.println(randnum);
			arr[i] = randnum;
		}
		return arr;
		
	}

	// �������� ����
	public int[] selection_sort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			
			
			// �ּڰ� ã��
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			
			// i��° ���� ã�� �ּҰ��� ���� ��ȯ
			swap(arr, min_index, i);
		}
		return arr;
	}
	
	
	// ��ȯ �Լ�
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	
	// ��÷ ��� Ȯ��
	
	public void resultCheck(int[] arr) {
		
		// ������ ������ ����
		int count = 0; // ���� ���� ī��Ʈ
		
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = 0; // �ӽ������� ��� ī��Ʈ
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
						temp++; // ��ȸ�ϸ� ���ڰ� ���ٸ� +1
				}
				if(count < temp) { // ������ ī��Ʈ���� �ű�ī��Ʈ�� ���ٸ� ����
					count = temp;
				}
			}
		}
		
		if (count == 6) {
			System.out.println("�� 1�� ��÷");
		} else if (count == 5) {
			System.out.println("�� 2�� ��÷");
		} else if (count == 4) {
			System.out.println("�� 3�� ��÷");
		} else {
			System.out.println("���� ��ȸ�� �̿��ϼ���");
		}
		
		
	}



}
