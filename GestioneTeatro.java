import java.util.ArrayList;

public class GestioneTeatro {

	
	ArrayList <Persona> spettatori;
	
	private String titolo;
	private String compagnia;
	private String data;
	
	
	private int postiPrenotati = 0;
	private final int capienza = 100;
	public GestioneTeatro(String titolo, String compagnia, String data) {
		
		this.titolo = titolo;
		this.compagnia = compagnia;
		this.data = data;
		
		spettatori = new ArrayList<>();
		
	}
		public int postiDisponibili() {
			
			return capienza - postiPrenotati;
		}
		
		public boolean prenota(Persona p1) {
			
			boolean ok = false;
			
			if (postiDisponibili() > 0 && spettatori.size() <= 100) {
				
				spettatori.add(p1);
				postiPrenotati++;
				ok = true;
				
			}
			else { System.out.println("Posti esauriti");
			   ok = false;
			
			}
			
			return ok;
			
		}
		
		public void visualizza() {
			
			System.out.println("Nome spettacolo " + titolo);
			System.out.println("Data spettacolo" + data );
			
			for (Persona p1: spettatori) {
				System.out.println(p1);
			}
		}
	}
	
	

