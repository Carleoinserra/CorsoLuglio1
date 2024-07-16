import java.util.ArrayList;
import java.util.Scanner;

public class UsaDipendente {

	
	public static void main(String[] args) {
		
		dipendente d1 = new dipendente("Rossi", "funzionario", 2000);
		
		//System.out.println(d1.getStipendio());
		
		d1.setMansione("operaio");
		
		//System.out.println(d1.getMansione());
		
		System.out.println(d1);
		Scanner input = new Scanner(System.in);
		
		ArrayList <dipendente> listaD = new ArrayList<>();
		
		listaD.add(d1);
		int scelta = 0;
		
		do {
			System.out.println("1 per inserire un nuovo dipedente 2 per stampare"
					+ "3 per rimuovere un elemento 0 per terminare"+
					"4 pre ricercare un dipedente");
			scelta = input.nextInt();
			
			if (scelta == 1) {
				
				System.out.println("Inserisci il nome");
				String nome = input.next();
				System.out.println("Inserisci la mansione");
				String mansione = input.next();
				System.out.println("Inserisci lo stipendioe");
				int stipendio = input.nextInt();
				dipendente a2 = new dipendente(nome, mansione, stipendio);
				listaD.add(a2);}
			
			else if (scelta == 2) {
				
				for (dipendente d3: listaD) {
					System.out.println(d3);
				}}
				
				else if (scelta == 3) {
					
					System.out.println("la posizione");
					int pos = input.nextInt();
					listaD.remove(pos);
				}
			
				else if (scelta == 4) {
					System.out.println("Inserisci il nome del dipedente: ");
					String nomeD = input.next();
					boolean trovato = false;
					for (dipendente d3: listaD) {
						
						if (d3.getNome().equals(nomeD)) {
							System.out.println(d3);
							trovato = true;
						}
						
						
					}
					
					if (trovato == false) {
						System.out.println("Nessun dipendente trovato con quel nome");
					}
				}
				
				
				
			
			
			
			
		}
		
		while (scelta != 0);
			
			
			
		
		
	}
}
