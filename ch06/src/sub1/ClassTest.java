package sub1;

public class ClassTest {
	public static void main(String[] args) {
		//기본변수
		int		var1 = 1;
		boolean	var2 = true;
		double	var3 = 1.23;		
		
		//참조형 변수
		Account kb = new Account("국민은행","789645","로보",10000);
		Account sh = new Account("신한은행","533432","로보",50000);
		
		kb.deposit(10000);
		kb.withdraw(1000);
		kb.show();
		
		sh.deposit(30000);
		sh.withdraw(3000);
		sh.show();
		
	}
}
