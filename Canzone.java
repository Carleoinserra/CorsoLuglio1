
public class Canzone {

	private String titolo;
	private String autore;
	public Canzone(String titolo, String autore) {
		
		this.titolo = titolo;
		this.autore = autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	@Override
	public String toString() {
		return "Canzone [titolo=" + titolo + ", autore=" + autore + "]";
	}
	
	
}
