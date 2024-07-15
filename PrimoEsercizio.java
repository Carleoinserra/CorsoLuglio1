import java.util.Scanner ;
public class PrimoEsercizio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scrivi la base del triangolo: ");
		double base = input.nextDouble();
		
		System.out.println("Scrivi l'altezza del triangolo: ");
		double altezza = input.nextDouble();
		
		double area = (base * altezza) / 2;
		
		System.out.println("L'area del tuo triangolo è : " + area);
		

	}

}
