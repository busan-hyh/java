package sub1;

public class ClassTest {
	public static void main(String[] args) {
		//�⺻����
		int		var1 = 1;
		boolean	var2 = true;
		double	var3 = 1.23;		
		
		//������ ����
		Account kb = new Account("��������","789645","�κ�",10000);
		Account sh = new Account("��������","533432","�κ�",50000);
		
		kb.deposit(10000);
		kb.withdraw(1000);
		kb.show();
		
		sh.deposit(30000);
		sh.withdraw(3000);
		sh.show();
		
	}
}
