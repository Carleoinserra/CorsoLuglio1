import java.util.Scanner;
public class MinimoDiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * . Scrivere il programma MinimoDiArray che chiede all’utente di inserire 10
		 *  numeri, li memorizza in un array e poi stampa valore e posizione
		 *   dell’elemento minimo dell’array. Se il valore minimo
             `e presente pi`u di una volta, stampa la posizione della prima occorrenza
               di tale valore nell’array
		 * 
		 * 
		 */
		Scanner input = new Scanner (System.in);
		int [] listaN = new int [10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Inserisci un numero");
			listaN[i] = input.nextInt();
		}
		
		int temp = listaN[0];
		int indice = 0;
		
		for (int i  = 0; i < listaN.length; i++) {
			
			if (listaN[i] < temp) {
				
				temp = listaN[i];
				indice = i;
			}
			
			
			
		}
		System.out.println("Il numero più piccolo è " + temp);
		System.out.println("In posizione " + indice);
		
	}
	

	int [] listaNum = {3, 4, 5, 6, 7, 8, 9};

}
