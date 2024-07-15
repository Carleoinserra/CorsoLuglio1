import java.util.Scanner;

public class Check {

	
	
	public static void main(String[] args) {
		
	
		
		
		Scanner input = new Scanner (System.in);
		int cont = 5;
		int puntUser = 0;
		int puntPc = 0;
		boolean vinto = false;
	do  {
			int randomNum = (int)(Math.random() * 2);
			System.out.println("Inserisci zero per scegliere testa 1 per scegliere croce ");
			int num = input.nextInt();
			System.out.println(randomNum);
			if (randomNum == 0) {
				System.out.println("E' uscito testa");
			}
			else {
				System.out.println("E' uscito croce");
			}
			if (num == randomNum) {
				System.out.println("Hai vinto");
				puntUser++;
			}
			else {
				puntPc++;
				System.out.println("Hai perso");
			}
			cont--;
		}
		
		while (cont > 0);
		
		System.out.println("Punteggio utente = " + puntUser);
		System.out.println("Punteggio pc = " + puntPc);
		
			
		

}
}