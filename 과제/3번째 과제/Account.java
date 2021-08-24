package JAVA3;

/*
 * �ۼ���: 2021-08-24
 * ���α׷� ����: ���°��� ���α׷��� ����
 * �ۼ���: ������
 */


public class Account {

/* ����
* ���¹�ȣ(accontNumber): ���ڿ�
* �̸�(name): ���ڿ�
* ��й�ȣ(password): ���ڿ�
* �ܾ�(balance):������
*/
	
	private String accontNumber;
	private String name;
	private String password;
	private int balance;
	
	public Account(String accontNumber, String name, String password, int balance) {
		super();
		this.accontNumber = accontNumber;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	
		
/*
* �޼ҵ�
* �Ա�(deposit) : void
* ���(widthdraw) : void
* �ܾ���ȸ(getBalance) : void
* ��й�ȣ ����(setPassword) : void
* �������� ���(printAccount) : void
* 
*/
	// �Ա�
	public void deposit(int money) {
		this.balance += money;
	}
	
	// ���
	public void widthdraw(int money) {
		this.balance -= money;
	}
	
	// �ܾ���ȸ
	public void getBalance() {
		System.out.printf("�ܾ���: %d�Դϴ�.%n", this.balance);
	}
	
	// ��й�ȣ ����
	public void setPassword(String password) {
		this.password = password;
	}
	
	// �������� ���
	public void printAccount() {
		System.out.printf("���� ��ȣ: %s%n", this.accontNumber);
		System.out.printf("�̸�: %s%n", this.name);
		System.out.printf("��� ��ȣ: %s%n", this.password);
		System.out.printf("���� ��ȣ: %d%n", this.balance);
	}


	
	// ���¹�ȣ
	public String getAccontNumber() {
		return accontNumber;
	}
	
	public void setAccontNumber(String accontNumber) {
		this.accontNumber = accontNumber;
	}

	
	
	// �̸�
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	
	// ��й�ȣ Ȯ��
	public String getPassword() {
		return password;
	}

	
	
	// ���� ����
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
