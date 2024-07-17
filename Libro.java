
public class Libro {

	private String autore;
	
	private String titolo;
	
	private int prezzo;
	
	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", titolo=" + titolo + ", prezzo=" + prezzo + "]";
	}
	public Libro(String autore, String titolo, int prezzo) {
		
		this.autore = autore;
		this.titolo = titolo;
		this.prezzo = prezzo;
		
		
	}
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	
}
