import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UsaHitParade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner input = new Scanner (System.in);
		
		HitParade h1 = new HitParade();
		
		
		
		
		
		
		
		int scelta = 0;
		
		do {
			System.out.println("1 per inserire 2 per visualizzare 3 per rimuovere in poszione 4 per scambiare"
					+ "5 per cercare 0 per terminare");
			
			scelta = input.nextInt();
			
			
			if (scelta == 1) {
				Scanner input1 = new Scanner (System.in);
				System.out.println("Inserisci il titolo");
				String titolo = input1.nextLine();
				System.out.println("Inserisci autore");
				String autore = input1.nextLine();
				
				h1.addC(new Canzone(titolo, autore));
				
			}
			
			else if (scelta == 2) {
				
				h1.show();
			}
			
			else if (scelta == 3) {
				Scanner input2 = new Scanner (System.in);
				System.out.println("IInserisci la posizone");
				int pos = input2.nextInt();
				
				h1.removeC(pos);
				
			}
			else if (scelta == 4) {
				Scanner input2 = new Scanner (System.in);
				System.out.println("IInserisci la prima posizone");
				int pos = input2.nextInt();
				System.out.println("IInserisci la seconda posizone");
				int pos1 = input2.nextInt();
				
				h1.scambia(pos, pos1);
				
			}
			

			else if (scelta == 5) {
				Scanner input3 = new Scanner (System.in);
				System.out.println("Inserisci l'autore");
				String autore = input3.nextLine();
				
				h1.cerca(autore);
				
			}
			
			else if (scelta == 6) {
				
				Scanner input4 = new Scanner (System.in);
				System.out.println("Inserisci il nome del file che vuoi salvare:");
				
				String nome = input4.nextLine();
				
				try {
					ObjectOutputStream out =
					new ObjectOutputStream ( new BufferedOutputStream (
					new FileOutputStream (nome + ".dat" )));
					out . writeObject (h1);
					out . close ();
					} catch ( IOException e) {
					System . out . println (" ERRORE di I/O");
					System . out . println (e );
					}
				
				
				
				
			}
			
			else if (scelta == 7) {
				Scanner input5 = new Scanner (System.in);
				System.out.println("digita il nome del file da aprire:");
				
				String nome = input5.nextLine();
				
				try {
					// notare le classi degli stream di byte
					ObjectInputStream in =
					new ObjectInputStream ( new BufferedInputStream (
					new FileInputStream (nome + ".dat" )));
					h1 = (HitParade) in.readObject();
					in . close ();
					} catch ( ClassNotFoundException e) {
					// se il file non contiene un oggetto ....
					System . out . println (" PROBLEMA ( manca oggetto nel file )");
					System . out . println (e );
					} catch ( IOException e) {
					System . out . println (" ERRORE di I/O");
					System . out . println (e );
					}	
				
				
				
			}
			
			
			
			
			
			
		}
		
		while (scelta != 0);
	}

}
