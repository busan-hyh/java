package sub2;

public class ArgTest {
	public static void main(String[] args) {
		Arg arg = new Arg(100);
		int[] arr = {1,2,3,4,5};
		
		arg.add(arg.x);
		System.out.println("arg.x : " + arg.x);
		//연산후 소멸하므로 원래대로 100으로 돌아옴
		
		arg.add(arg);
		System.out.println("arg.x : " + arg.x);
		//arg.x를 바꾸므로 140이 표시
		
		arg.add(arr);
		System.out.println("arg[0] : " + arr[0]);
		//arr의 주소값 참조후 arr[0]을 바꾸므로 2로 표시
		
		arg.addNew(arg);
		System.out.println("arg.x : " + arg.x);
		//new한애는 참조하지 않으므로 원래의 arg.x가 표시
		
		arg = arg.addNew2(arg);
		System.out.println("arg.x : " + arg.x);
		//0짜리 new한걸 리턴해서 arg 갈아끼움
	}
}
