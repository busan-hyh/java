package sub2;

public class ArgTest {
	public static void main(String[] args) {
		Arg arg = new Arg(100);
		int[] arr = {1,2,3,4,5};
		
		arg.add(arg.x);
		System.out.println("arg.x : " + arg.x);
		//������ �Ҹ��ϹǷ� ������� 100���� ���ƿ�
		
		arg.add(arg);
		System.out.println("arg.x : " + arg.x);
		//arg.x�� �ٲٹǷ� 140�� ǥ��
		
		arg.add(arr);
		System.out.println("arg[0] : " + arr[0]);
		//arr�� �ּҰ� ������ arr[0]�� �ٲٹǷ� 2�� ǥ��
		
		arg.addNew(arg);
		System.out.println("arg.x : " + arg.x);
		//new�Ѿִ� �������� �����Ƿ� ������ arg.x�� ǥ��
		
		arg = arg.addNew2(arg);
		System.out.println("arg.x : " + arg.x);
		//0¥�� new�Ѱ� �����ؼ� arg ���Ƴ���
	}
}
