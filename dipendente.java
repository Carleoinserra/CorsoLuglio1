
public class dipendente {

	
	private String nome;
	private String mansione;
	private int stipendio;
	
	
	public dipendente(String nome, String mansione, int stipendio) {
		
		this.nome = nome;
		this.mansione = mansione;
		this.stipendio = stipendio;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMansione() {
		return mansione;
	}


	public void setMansione(String mansione) {
		this.mansione = mansione;
	}


	public int getStipendio() {
		return stipendio;
	}


	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	public String toString() {
		
		return "Nome " + this.nome + " Mansione " + this.mansione + 
				" stipendio " + this.stipendio;
	}
	
	
	
	
}
