import java.util.Scanner;

public class MainRun {
	public static void main(String[] args) {
		int select = -1;
		StuCont cont = new StuCont();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("성적관리 프로그램");
			System.out.println("1.추가 2.검색 3.전체검색  0.종료");
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