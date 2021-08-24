package JAVA3;

/*
 * 작성일: 2021-08-24
 * 프로그램 설명: Car Class 완성
 * 작성자: 강종훈
 */

public class Car {
	
	
	// 인스턴스 변수
	private String name; // 이름
	private String color; // 색상
	private int direction; // 방향
	private int speed; // 속도
	// 클래스 변수
	private static String company;

	static {
//		System.out.println("call static initialize block!!");
		company = "현대";
	}

	// 생성자 메소드
	public Car(String name, String color, int direction, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.direction = direction;
		this.speed = speed;
	}
	
	
	// 디폴트 생성자 메소드
	public Car() {
		// super();
	}
	
//	메서드----------------------------------------------
	
	// 우회전
	public void turnRight() {
		this.direction +=1;
	}
	
	// 좌회전
	public void turnLeft() {
		this.direction -=1;
	}
	
	// 가속
	public void accelerate() {
		this.speed += 1;
	}
	
	// 감속
	public void decelerate() {
		this.speed -= 1;
	}
	
	
// get/ set	--------------------------------------------
	
	// 이름
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// 색상
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	// 방향
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	
	// 속도
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}
