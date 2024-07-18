
public class Professore extends Persona {
	
	private String dipartimento;

	public Professore(String nome, String indirizzo, String dipartimento ,int anni) {
		super(nome, indirizzo, anni);
		
		this.dipartimento = dipartimento;
		
		
		
	}

	public String getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(String dipartimento) {
		this.dipartimento = dipartimento;
	}
	
public void anniLavoro() {
		
		System.out.println("Tu professore Hai lavorato " + anni);
	}

	@Override
	public String toString() {
		return "Professore [dipartimento=" + dipartimento + ", nome=" + this.getNome() + ", indirizzo=" + this.getIndirizzo() + "]";
	}
	
	

}
