package sub2;

public class Arg {
	public int x;
	
	public Arg(int x) {
		this.x = x;
	}
	
	public void add(int x) {
		//add���� �̸��� ���� �����ε�, �Ű������� ���а���
		x = x + 50;
		//������ �Ҹ���...
	}
	public void add(Arg arg) {
		arg.x = arg.x + 40;
	}
	public void add(int[] arr) {
		arr[0]++;
	}
	public void addNew(Arg arg) {
		arg = new Arg(0);
	}
	public Arg addNew2(Arg arg) {
		arg = new Arg(0);
		return arg;
	}
}
