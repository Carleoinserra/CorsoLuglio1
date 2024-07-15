
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  dichiarazione di un array
		int [] listaNum = new int [3];
		
		// assegnamento agli elelemnti dell'array di numeri
		listaNum[0] = 3;
		listaNum[1] = 38;
		listaNum[2] = 23;
		
		// for con indice
		for (int i = 0; i < listaNum.length; i++) {
			System.out.println("In posizione " + i);
			System.out.println(listaNum[i]);
		}
		
		// for each
		for (int num: listaNum) {
			
			System.out.println(num);
		}
		
		
	}

}
