
public class UsaConto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ContoCorrente c1 = new ContoCorrente(1000000);
		
		ContoCorrente c2 = new ContoCorrente(20000);
		c1.preleva(200000);
		c1.preleva(150000);
		
		c1.versa(100000);
		
		
		
		System.out.println(c1);
		
		c2.preleva(21000);
	}

}
