import java.util.Scanner ;
public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello world!!!");
		
		
		// variabile numerica
		
		int num = 5;
		
		double num1 = 5.5;
		
		double risultato = num * num1;
		
		System.out.println(num * num1);
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.println("Scrivi un numero: ");
		int numero = input.nextInt();
		
		System.out.println("Scrivi un numero in virgola : ");
		 double numero1 = input.nextDouble();
		
		System.out.println(numero);*/
		
		// variabili stringa
		
		
		System.out.println("Scrivi una parola : ");
		String parola = input.nextLine();
		
		
		
		System.out.println("la lunghezza della stringa " + parola.length());
		
		boolean check = true;
		
		
		

	}

}
