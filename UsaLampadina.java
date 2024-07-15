
public class UsaLampadina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lampadina l1 = new Lampadina(3);
		
		Interruttore r1 = new Interruttore(l1);
		Interruttore r2 = new Interruttore(l1);
		
		r1.clickLampadina();
		System.out.println(r1.statoLampadina());
		
		r2.clickLampadina();
		System.out.println(r2.statoLampadina());
		
		r1.clickLampadina();
		System.out.println(r1.statoLampadina());
		
		r1.clickLampadina();
		System.out.println(r1.statoLampadina());
		
		r2.clickLampadina();
		System.out.println(r2.statoLampadina());
		
	}

}
