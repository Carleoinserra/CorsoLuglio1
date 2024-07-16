
public class Appartamento {

	
	private String nomeP;
	private int numeroI;
	private int superficie;
	private int piano;
	public int id;
	
	public Appartamento(String nomeP, int numeroI, int superficie, int piano, int id) {
		
		this.nomeP = nomeP;
		this.numeroI = numeroI;
		this.superficie = superficie;
		this.piano = piano;
		this.id = id;
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public int getNumeroI() {
		return numeroI;
	}

	public void setNumeroI(int numeroI) {
		this.numeroI = numeroI;
	}

	public int getSuperficie() {
		return superficie;
	}

	

	public int getPiano() {
		return piano;
	}
	
	public String visualizza() {
		
		return "nome proprietario: " + nomeP + " numero inquilini: " + numeroI +
				" superficie " + superficie + " m2 piano " + piano + 
				"Spesa condominiale mensile " + calcolaSomma() + " euro" +
				" ID casa: "
		+ id;
		
	}
	
	public int calcolaSomma() {
		int somma = 0;
		
		if (this.numeroI <= 2) {
			
			somma+= 50;
		}
		else if (this.numeroI > 2) {
			somma+= 70;
		}
		
		if (this.superficie >= 100) {
			
			somma+= 50;
		}
		else if (this.superficie >= 100) {
			
			somma+=70;
		}
		
		return somma;
	}

	
	
	
	
}
