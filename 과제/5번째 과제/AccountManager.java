package JAVA3;

import java.util.Scanner;

/*
 * �ۼ���: 2021-08-24
 * ���α׷� ����: ���°��� ���α׷��� ����
 * �ۼ���: ������
 */

public class AccountManager {

	
	public static void main(String[] args) {
		
// �⺻���� ����
		Account acc = new Account("123-12-123456", "���۱�", "��ȣ", 20000);
				
		try {

			// �Ա�
			acc.deposit(5000);
			
			// ���
			acc.widthdraw(6000);
			
			// PW����
			acc.setPassword("����� ��ȣ");
			
			// ���� ���� ���
			acc.printAccount();

			// �ܾ���ȸ
			System.out.print("���۱� �ܾ�: ");
			acc.getBalance();
	
			// ���� �۱�
			acc.tranceForAccount(acc, 5000); // arg��: (�۱��� ���� ��ü, �۱ݾ�)
						
			System.out.println("������ü ��");
			System.out.print("���۱� �ܾ�: ");
			acc.getBalance();
			

			
		} catch (Exception e) {
			System.out.printf("%s",e.getMessage());
		}
		
	
// �迭�� ����		
//		Account[] acc = new Account[5];
//		acc[0] = new Account("222-22-22222", "���浿", "��ȣ1", 1000);
//		acc[1] = new Account("333-33-33333", "�ϱ浿", "��ȣ2", 2000);
//		acc[2] = new Account("444-44-44444", "�̱浿", "��ȣ3", 3000);
//		acc[3] = new Account("555-55-55555", "��浿", "��ȣ4", 4000);
//		acc[4] = new Account("666-66-66666", "��浿", "��ȣ5", 5000);

		// �ݺ��� ���

		
//		// �Ա�
//		acc[0].deposit(5000);
//		
//		// ���
//		acc[0].widthdraw(6000);
//		
//		// �ܾ���ȸ
//		acc[0].getBalance();
//		
//		// PW����
//		acc[0].setPassword("����� ��ȣ");
//		
//		// ���� ���� ���
//		acc[0].printAccount();
	
	}
}
