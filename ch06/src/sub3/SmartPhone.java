package sub3;

public class SmartPhone extends Computer {
	
	private String brand;
	private String phone;
	
	//1��ӹ����� �θ��� ����� �ʱ�ȭ�ؾ��Ѵ�.
	public SmartPhone(String cpu, String ram, int price, String brand, String phone) {
		super(cpu, ram, price);//2�׸��� �θ� �����ڷ� ��������� �Ѵ�
		this.brand = brand;
		this.phone = phone;
	}
	
	public void call() {
		System.out.println(phone + "��ȭ��");
	}
	
	public void calc(int x) {
		//Computer�� calc�ʹ� �Ű������� ���еǹǷ� �����ε�
		System.out.println("������ �����...");
	}
	
	@Override
	public void info() {
		System.out.println("================");
		System.out.println("�귣�� : " + brand);
		System.out.println("����ȣ : " + phone);
		System.out.println("================");
	}
}
