import java.util.ArrayList;

public class UsaSpettacolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Persona p1 = new Persona ("Rossi","Milano", 5);
		Persona p2 = new Persona("Bianchi", "bergamo", 5);
		Studente s1 = new Studente("Gialli", "milano", 1234, 3);
		
		Professore pr1 = new Professore("Guigi", "Roma", "Informatica", 20);
		GestioneTeatro g1 = new GestioneTeatro("Macbeth", "Nuovo teatro", "Settembre");
		
		g1.prenota(p1);
		g1.prenota(p2);
		g1.prenota(s1);
		g1.prenota(pr1);
	//	g1.visualizza();
		
		ArrayList<Persona> listaP = new ArrayList<>();
		listaP.add(p1);
		listaP.add(p2);
		listaP.add(s1);
		listaP.add(pr1);
		
		for (Persona pers: listaP) {
			
			pers.anniLavoro();
		}
		
	}

}
