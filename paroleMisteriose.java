import java.util.Scanner;
public class paroleMisteriose {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String [] parole = {"gatto", "topo", "pippo", "topolino", "cavallo"};
		
		System.out.println(parole.length);
		boolean trovato = false;
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Indovina la parola: ");
			String indovina = input.next();
			
			for (int j = 0; j < parole.length; j++) {
				
				if (indovina.equals(parole[j])){
					
					System.out.println("Hai indovinato!!!!");
					i = 4;
					trovato = true;
					
				}
				
			}
			
			if (!trovato) {
				
				System.out.println("Hai sbagliato");
			}
			
			
		}
		if (!trovato) {
			System.out.println("Tentativi terminati!!!!");
		}
		if (trovato) {
			System.out.println("Hai vinto!!!!");
		}
		
		
		
	}
}
