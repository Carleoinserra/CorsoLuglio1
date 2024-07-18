
public class Studente extends Persona {
	
	private int matricola;

	public Studente(String nome, String indirizzo, int matricola, int anni) {
		
		super(nome, indirizzo, anni);
		
		this.matricola = matricola;
		
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
public void anniLavoro() {
		
		System.out.println("Tu studente Hai lavorato " + anni);
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", nome=" + this.getNome() + ", indirizzo=" + this.getIndirizzo() + "]";
	}
	
	

}
