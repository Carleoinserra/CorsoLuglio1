
public class Interruttore {

	Lampadina l1;
	
	public Interruttore(Lampadina l1) {
		
		this.l1 = l1;
	}
	
	public void clickLampadina() {
		
		l1.click();
	}
	
	public String statoLampadina() {
		
		return l1.stato();
	}
}
