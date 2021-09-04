import java.util.ArrayList;
import java.util.Scanner;

public class StuCont {

	ArrayList<StuData> list; // arraylist ���� ( StuData Ŭ������ �迭�� ���� �ȴ� )
	Scanner sc;
	private String id, name;
	private int kor, eng, mat;

	StuCont() {
		list = new ArrayList();
		sc = new Scanner(System.in);
	}

	// �Է�
	void insert() {

			// �� �Է� �κ�
			System.out.print("�й��� �Է��ϼ���:");
			id = sc.next();
			System.out.print("�̸��� �Է��ϼ���.:");
			name = sc.next();
			System.out.print("���������� �Է��ϼ���:");
			kor = sc.nextInt();
			System.out.print("���������� �Է��ϼ��� :");
			eng = sc.nextInt();
			System.out.print("���������� �Է��ϼ���::");
			mat = sc.nextInt();

			list.add(new StuData(id, name, kor, eng, mat));
			
	}

	// ��ȸ
	void serch() {

		String find; // �й��� �Է¹޴� ����
		
		System.out.println("�˻��� �й��� �Է��ϼ���:");
		find = sc.next();

		for (int i = 0; i < 100; i++) { // �л��� ���� �ִ� 100���� ����

			// �й��̳� �̸� �Ѵ� ��ȸ �����ϰ�
			if (find.equals(list.get(i).getId())) {
				System.out.println("��ȸ���Դϴ� ��ø� ��ٷ� �ּ���");


				System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
				System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getKor()
						+ "\t" + list.get(i).getEng() + "\t" + list.get(i).getMat() + "\t" + list.get(i).getTotal()
						+ "\t" + list.get(i).getAvg());
				break;
			}
		}
		System.out.println("�й� Ȥ�� �̸��� �ٽ� Ȯ�����ּ���.");
	}

	// ��ü��ȸ
	void serchAll() {

		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getKor() + "\t"
					+ list.get(i).getEng() + "\t" + list.get(i).getMat() + "\t" + list.get(i).getTotal() + "\t");
			System.out.printf("%.2f%n", list.get(i).getAvg());
		}
	}

}