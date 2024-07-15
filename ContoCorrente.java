
public class ContoCorrente {
	
	
	// variabile d'instanza
	private double saldo;
	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ContoCorrente(double saldo) {
		
		this.saldo = saldo;
	}
	
	// metodo per prelevare che ha un parametro con la somma
	public void preleva(double somma) {
		
		if (somma <= this.saldo) {
		this.saldo -= somma;}
		
		else {
			System.out.println("Saldo non disponibile ");
		}
	}
	
	// metodo per versare che ha un parametro con la somma
		public void versa(double somma) {
			
			this.saldo += somma;
		}

		@Override
		public String toString() {
			return "ContoCorrente [saldo=" + saldo + "]";
		}
	
	

}
