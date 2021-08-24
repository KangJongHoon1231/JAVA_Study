package JAVA3;

/*
 * �ۼ���: 2021-08-24
 * ���α׷� ����: Car Class �ϼ�
 * �ۼ���: ������
 */

public class Car {
	
	
	// �ν��Ͻ� ����
	private String name; // �̸�
	private String color; // ����
	private int direction; // ����
	private int speed; // �ӵ�
	// Ŭ���� ����
	private static String company;

	static {
//		System.out.println("call static initialize block!!");
		company = "����";
	}

	// ������ �޼ҵ�
	public Car(String name, String color, int direction, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.direction = direction;
		this.speed = speed;
	}
	
	
	// ����Ʈ ������ �޼ҵ�
	public Car() {
		// super();
	}
	
//	�޼���----------------------------------------------
	
	// ��ȸ��
	public void turnRight() {
		this.direction +=1;
	}
	
	// ��ȸ��
	public void turnLeft() {
		this.direction -=1;
	}
	
	// ����
	public void accelerate() {
		this.speed += 1;
	}
	
	// ����
	public void decelerate() {
		this.speed -= 1;
	}
	
	
// get/ set	--------------------------------------------
	
	// �̸�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// ����
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	// ����
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	
	// �ӵ�
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}
