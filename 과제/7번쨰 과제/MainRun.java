import java.util.Scanner;

public class MainRun {
	public static void main(String[] args) {
		int select = -1;
		StuCont cont = new StuCont();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�������� ���α׷�");
			System.out.println("1.�߰� 2.�˻� 3.��ü�˻�  0.����");
			select = sc.nextInt();
			
			if (select == 1) {
				cont.insert();
			} else if (select == 2) {
				cont.serch();
			} else if (select == 3) {
				cont.serchAll();
			} else if (select == 0) {
				System.exit(0);
				break;
			}
		}
	}
}