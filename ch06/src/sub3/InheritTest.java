package sub3;

public class InheritTest {
	public static void main(String[] args) {
		Computer com = new Computer("3.2GHz", "16G", 100);
		com.booting();
		com.calc();
		com.info();
		
		Computer iphone = new SmartPhone("A10", "16G", 100, "������", "010");
		SmartPhone gallaxy = new SmartPhone("2.6GHz", "16G", 100, "������", "101");
		
		iphone.booting();
		//iphone.calc(1); //Computer������ ��������Ƿ� �ڽ�Ŭ������ �������� �ʴ´�.
		//iphone.call();
		iphone.info();//������ info�� �������̵� �����Ƿ� �ڽ�Ŭ������ ������ �־���.
		
		gallaxy.booting();
		gallaxy.calc();
		gallaxy.call();
		gallaxy.info();
	}
}
