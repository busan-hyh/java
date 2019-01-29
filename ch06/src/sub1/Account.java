package sub1;

public class Account {
	//특성-멤버변수
	private String bank;
	private String id;
	private String name;
	private int money;
	
	public Account(String bank, String id, String name, int money) {
		//private인 변수를 외부에서 초기화 하도록 클래스와 같은 이름으로 생성자 만들기
		//source->Generate Constructor
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	//기능-멤버메서드
	public void deposit(int money) {
		this.money += money;
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void show() {
		System.out.println("=====================");
		System.out.println("은 행 명 : " + bank);
		System.out.println("계좌번호 : " + id);
		System.out.println("입 금 주: " + name);
		System.out.println("현재잔액 : " + money);
		System.out.println("=====================");
	}
}
