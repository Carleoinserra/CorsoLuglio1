import java.util.Scanner;
public class metodiAusiliari {
	
	
	private static int somma10 () {
		int ris =0;
		for (int i =1; i <=10; i ++)
		ris += i ;
		return ris ;
		}
	
	public static void stampa(String nome, int anni) {
		System.out.println(nome);
	}
	
	public static boolean check(String pass) {
		boolean ok = false;
		
		if (pass.equals("1234")){
			ok = true;
		}
		
		return ok;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		int somma = somma10();
		
		System.out.println(somma);
		
		stampa("pippo", 27);
		
		
		int cont = 0;
	
		
		do  {
			
			System.out.println("Inserisci la password: ");
			String pass = input.next();
		
		    boolean check = check(pass); 
		if (check) {
			System.out.println("Password corretta");
			cont = 4;
		}
		else {
			System.out.println("Password sbagliata");
			cont++;
		}
	}
		
		while (cont < 3);
		
		if (cont == 3) {
			System.out.println("Sei stato bannato");
		}
		
		
		
	}}


