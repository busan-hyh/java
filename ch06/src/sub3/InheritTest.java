package sub3;

public class InheritTest {
	public static void main(String[] args) {
		Computer com = new Computer("3.2GHz", "16G", 100);
		com.booting();
		com.calc();
		com.info();
		
		Computer iphone = new SmartPhone("A10", "16G", 100, "아이폰", "010");
		SmartPhone gallaxy = new SmartPhone("2.6GHz", "16G", 100, "갤럭시", "101");
		
		iphone.booting();
		//iphone.calc(1); //Computer형으로 만들었으므로 자식클래스를 참조하지 않는다.
		//iphone.call();
		iphone.info();//하지만 info는 오버라이드 됐으므로 자식클래스가 영향을 주었다.
		
		gallaxy.booting();
		gallaxy.calc();
		gallaxy.call();
		gallaxy.info();
	}
}
