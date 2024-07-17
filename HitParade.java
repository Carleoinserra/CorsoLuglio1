import java.util.ArrayList;

public class HitParade {

	
	ArrayList <Canzone> listaC;
	
	
	public HitParade() {
		
		listaC = new ArrayList();
	}
	
	public void addC(Canzone c1) {
		
		listaC.add(c1);
		System.out.println("Canzone aggiunta con successo!");
	}
	
	public void show() {
		
		
		for (int i = 0; i< listaC.size(); i++) {
			
			System.out.println("Posizione " + (i+1)+ " ");
			System.out.println(listaC.get(i));
		}}
		
	public void removeC(int pos) {
		
		listaC.remove(pos-1);
	}
	public void scambia(int pos1, int pos2) {
		
		Canzone temp = listaC.get(pos1-1);
		listaC.set(pos1-1, listaC.get(pos2-1));
		listaC.set(pos2-1, temp);
		
	}
	
	
	public void cerca(String autore) {
		
		for (Canzone c1: listaC) {
			
			if (c1.getAutore().equalsIgnoreCase(autore)) {
				
				System.out.println(c1);
			}
		}
	}
	}
	
	

