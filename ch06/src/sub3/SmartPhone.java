package sub3;

public class SmartPhone extends Computer {
	
	private String brand;
	private String phone;
	
	//1상속받으면 부모의 멤버를 초기화해야한다.
	public SmartPhone(String cpu, String ram, int price, String brand, String phone) {
		super(cpu, ram, price);//2그리고 부모 생성자로 전달해줘야 한다
		this.brand = brand;
		this.phone = phone;
	}
	
	public void call() {
		System.out.println(phone + "전화옴");
	}
	
	public void calc(int x) {
		//Computer의 calc와는 매개변수로 구분되므로 오버로딩
		System.out.println("폰으로 계산중...");
	}
	
	@Override
	public void info() {
		System.out.println("================");
		System.out.println("브랜드 : " + brand);
		System.out.println("폰번호 : " + phone);
		System.out.println("================");
	}
}
