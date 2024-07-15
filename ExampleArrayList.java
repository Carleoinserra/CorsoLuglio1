// per utilizzare arraylist lo dobbiamo importare
import java.util.ArrayList;
import java.util.Scanner;
public class ExampleArrayList {

	
	public static void main(String[] args) {
		
		
		// dichiarazione dell'arralist
		ArrayList <Integer> listaNum = new ArrayList();
		Scanner input = new Scanner (System.in);
		
		// utilizzo add per aggiungere un elmento all'arrayList
		listaNum.add(23);
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Inserisci un numero");
			int num = input.nextInt();
			listaNum.add(num);
		}
		
		/*for (int j = 0; j < listaNum.size(); j++) {
			
			//si accede ad un lemento tramite il metodo get
			System.out.println(listaNum.get(j));
		}*/
		
		
		// con set andiamo a settare un nuovo valore rispetto ad un indice
		listaNum.set(0, 1);
		
		// andiamo a rimuovere un elemento dall'array utilizzando il suo indice
		listaNum.remove(0);
		
		
		for (int numero: listaNum) {
			System.out.println(numero);
		}
		
		ArrayList <String> parole = new ArrayList();
		
		parole.add("pippo");
		
		
		
		
	}
}
