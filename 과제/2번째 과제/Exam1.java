package JAVA2;

/*
 * �ۼ���: 2021-08-23
 * ���α׷� ����: 5���� �л��� ����, ����, ���� ������ �迭�� �����Ͽ� �� �л��� ���� �� ����� ���Ͽ���.
 * �ۼ���: ������
 * comment: for ~ each���� Ȱ���ϴ¹� �ǵ�� ��Ź�帳�ϴ�.
 */



public class Exam1 {
	
	public static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	
	public static void main(String[] args) {
		
		// �������� ������ �迭
		int[] korean = {100, 85, 50, 75, 100}; // ���� ����
		int[] english = {90, 90, 50, 90, 90};  // ���� ���� 
		int[] math = {90, 80, 60, 80, 60};     // ���� ����
		int[] sum = new int[5];				   // ���� �迭
		int[] avg = new int[5]; 			   // �� �л��� ���  
		
		
		// for�� Ȱ��
		// ���� ,��� ���ϱ�
//		for (int i = 0; i < korean.length; i++) {
//			sum[i] = (korean[i] + english[i] + math[i]); // ���� ���ϱ�
//			avg[i] = sum[i]/3;                           // ��� ���ϱ�
//		}
		
		
		// ����ϱ�
//		for (int i = 0; i < avg.length; i++) {
//			
//			System.out.printf("����: %d, ", sum[i]);
//			System.out.printf("���: %d%n", avg[i]);
//		}
		
// ************************************************************************
		
		// for ~ each��
		int[] co = {0,1,2,3,4};
		// ���� ���ϱ�
		for (int i: co) {
			sum[i] = add(korean[i],english[i], math[i]);
		}
				
		
		// ��� ���ϱ�
		for (int i : co) {
			avg[i] = sum[i]/3;
			i++;
		}
		
		
		// ����ϱ�
		for (int i: co) {
			System.out.printf("����: %d ", sum[i]);
			System.out.printf("���: %d", avg[i]);
			System.out.println();
		}
	}	

}
