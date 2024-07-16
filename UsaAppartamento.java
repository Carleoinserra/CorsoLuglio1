import java.util.ArrayList;

public class UsaAppartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Appartamento a1 = new Appartamento("Rossi", 4, 100, 1, 1);
		Appartamento a2 = new Appartamento("Bianchi", 6, 140, 1, 2);
		Appartamento a3 = new Appartamento("Neri", 2, 70, 1, 3);
		/*System.out.println(a1.visualizza());
		System.out.println(a2.visualizza());
		System.out.println(a3.visualizza());*/
		
		a2.setNomeP("Guidi");
		a3.setNumeroI(3);
		
		/*System.out.println(a1.visualizza());
		System.out.println(a2.visualizza());
		System.out.println(a3.visualizza());*/
		ArrayList <Integer> misure = new ArrayList<>();
		misure.add(90);
		misure.add(120);
		misure.add(150);
		Appartamento a4 = new Appartamento("Nessuno", 4, misure.get(0), 1, 1);
		Appartamento a5 = new Appartamento("Nessuno", 6, misure.get(1), 1, 2);
		Appartamento a6 = new Appartamento("Nessuno", 2, misure.get(2), 1, 3);
		
		ArrayList <Appartamento> listaA = new ArrayList<>();
		listaA.add(a4);
		listaA.add(a5);
		listaA.add(a6);
		
		
		
		Condominio c1 = new Condominio(3, 3, misure, listaA );
		System.out.println(c1.visualizza());
		
		c1.modificaProprietario("Rossi", 5, 1);
		System.out.println(c1.visualizza());
	}

}
