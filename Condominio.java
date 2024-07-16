import java.util.ArrayList;
import java.util.Scanner;
public class Condominio {
	
	
	ArrayList<Appartamento> lista;
	
	int numeroPiani;
	
	int numeroAppartamenti;
	
	ArrayList<Integer> misureAppartamenti;
	
	
	public Condominio(int numeroPiani, int numeroAppartamenti, ArrayList<Integer> misureAppartamenti, ArrayList<Appartamento> lista) {
		
		this.numeroPiani = numeroPiani;
		this.numeroAppartamenti = numeroAppartamenti;
		this.misureAppartamenti = misureAppartamenti;
		this.lista = lista;
		
		
		
		
	}
	
	public void modificaProprietario(String proprietario,int numeroI, int id  ) {
		
		for (Appartamento a1: lista ) {
			
			if (a1.id == id) {
				
				a1.setNomeP(proprietario);
				a1.setNumeroI(numeroI);
			}
			
			
	
			
		}}
		
	public String visualizza() {
		String misure = "";
		
		for (int mis: misureAppartamenti) {
			
			misure += mis + " ,";
		}
		
		String listaA = "";
for (Appartamento a1: lista) {
			
			listaA += a1.visualizza() + " ," + "\n";
		}
		return "Numero Piani: " + numeroPiani + " Numero Appartamenti : " + numeroAppartamenti
				+ " misure appartamenti " + misure + " m2 appartamenti " + "\n"+ listaA; 
		
	}
	
	public int speseCondominio() {
		int somma = 0;
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i).getNumeroI() <= 2) {
				
				somma+= 50;
			}
			else if (lista.get(i).getNumeroI() > 2) {
				somma+= 70;
			}
			
			if (lista.get(i).getSuperficie() >= 100) {
				
				somma+= 50;
			}
			else if (lista.get(i).getSuperficie() >= 100) {
				
				somma+=70;
			}
		}
		
		return somma;
	}
	
	}

	
	

