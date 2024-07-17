import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Libro l1 = new Libro("Saviano", "Gomorra", 20);
		Libro l2 = new Libro("King", "IT", 20);
		Libro l3 = new Libro("Alighieri", "Divina Commedia", 15);
		Libro l4 = new Libro("Ferrante", "L'amica geniale", 25);
		
		ArrayList <Libro> libri = new ArrayList();
		ArrayList <Libro> ordini = new ArrayList();
		libri.add(l1);
		libri.add(l2);
		libri.add(l3);
		libri.add(l4);
		int scelta = 0;
		Scanner input = new Scanner (System.in);
		Scanner input1 = new Scanner (System.in);
		int spesa = 0;
		
		do {
			
			
			System.out.println("1 per stampare tutti i libri, 2 per acquistare un libro"
					+ "0 per uscire");
			
			scelta = input.nextInt();
			
			if (scelta == 1) {
				
				for (Libro lib: libri) {
					
					System.out.println(lib);
				}
			}
			
			else if (scelta == 2) {
				
				System.out.println("Inserisci il titolo del libro che vuoi acquistare");
				String titolo = input1.nextLine();
				boolean trovato = false;
				
				for (int i = 0; i < libri.size(); i++) {
					
					if ((titolo).equalsIgnoreCase( libri.get(i).getTitolo())) {
						
						spesa+= libri.get(i).getPrezzo();
						trovato = true;
						ordini.add(libri.get(i));
						
					}
				}
				
				if (trovato == false) {
					System.out.println("Libro non trovato");
				}
				else if (trovato == true) {
					System.out.println("Libro Acquistato correttamente");
				}
			}
			
			
	
			
			
			
		}
		
		
		while (scelta != 0);
		
		
		System.out.println("Gazie per aver acquistato da noi riepilogo ordine: ");
		
		for (Libro lib: ordini) {
			System.out.println(lib);
		}
		
		System.out.println("Dovrai pagare " + spesa + " euro");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
