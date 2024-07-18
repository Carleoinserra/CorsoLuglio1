
public class Persona {

	
	private String nome;
	
	private String indirizzo;
	
	public int anni;

	public Persona(String nome, String indirizzo, int anni) {
		
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.anni = anni;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public void anniLavoro() {
		
		System.out.println("Tu persona Hai lavorato " + anni);
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}
	
	
}
