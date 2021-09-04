import java.util.ArrayList;
import java.util.Scanner;

public class StuCont {

	ArrayList<StuData> list; // arraylist 생성 ( StuData 클래스가 배열에 담기게 된다 )
	Scanner sc;
	private String id, name;
	private int kor, eng, mat;

	StuCont() {
		list = new ArrayList();
		sc = new Scanner(System.in);
	}

	// 입력
	void insert() {

			// 값 입력 부분
			System.out.print("학번을 입력하세요:");
			id = sc.next();
			System.out.print("이름을 입력하세요.:");
			name = sc.next();
			System.out.print("국어점수를 입력하세요:");
			kor = sc.nextInt();
			System.out.print("영어점수를 입력하세요 :");
			eng = sc.nextInt();
			System.out.print("수학점수를 입력하세요::");
			mat = sc.nextInt();

			list.add(new StuData(id, name, kor, eng, mat));
			
	}

	// 조회
	void serch() {

		String find; // 학번을 입력받는 변수
		
		System.out.println("검색할 학번을 입력하세요:");
		find = sc.next();

		for (int i = 0; i < 100; i++) { // 학생의 수는 최대 100으로 제한

			// 학번이나 이름 둘다 조회 가능하게
			if (find.equals(list.get(i).getId())) {
				System.out.println("조회중입니다 잠시만 기다려 주세요");


				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getKor()
						+ "\t" + list.get(i).getEng() + "\t" + list.get(i).getMat() + "\t" + list.get(i).getTotal()
						+ "\t" + list.get(i).getAvg());
				break;
			}
		}
		System.out.println("학번 혹은 이름을 다시 확인해주세요.");
	}

	// 전체조회
	void serchAll() {

		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getKor() + "\t"
					+ list.get(i).getEng() + "\t" + list.get(i).getMat() + "\t" + list.get(i).getTotal() + "\t");
			System.out.printf("%.2f%n", list.get(i).getAvg());
		}
	}

}