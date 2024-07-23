import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class NegozioProdotti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <Prod> listaProdotti = new ArrayList<>();
		 ArrayList <Prod> listaAcquisti = new ArrayList<>();
		int scelta = 0;
		
		 String url = "jdbc:mysql://localhost:3306/"; // URL del database
	        String dbName = "mydb"; // Nome del database
	        String user = "root"; // Nome utente
	        String password = "Ilfoggia1"; // Password
	        
	        String selectQuery = "SELECT * FROM prodotti";

	         // Tentativo di connessione al database e lettura dei dati dalla tabella
	         try (Connection conn = DriverManager.getConnection(url + dbName, user, password);
	              Statement stmt = conn.createStatement();
	              ResultSet rs = stmt.executeQuery(selectQuery)) {

	             // Iterazione sui risultati e lettura dei dati
	             while (rs.next()) {
	                 int id = rs.getInt("id");
	                 String nome = rs.getString("nome");
	                 double prezzo = rs.getDouble("prezzo");
	                 int quantita = rs.getInt("quantita");
	                 
	                 // Creazione di un nuovo oggetto Prodotto e aggiunta alla lista
	                 Prod prodotto = new Prod(id, nome, prezzo, quantita);
	                 listaProdotti.add(prodotto);
	             }
	         } catch (SQLException e) {
	             // Gestione delle eccezioni per la connessione al database o la lettura dei dati
	             System.out.println("Errore durante la lettura dei dati dalla tabella 'prodotti':");
	             e.printStackTrace();
	         }

		
		do {
			  
			
			System.out.println("Inserisci 1  per visualizzare 2 per acquistare un prodotto 0 per terminare: ");
			Scanner input = new Scanner (System.in);
			scelta = input.nextInt();
			
			
			if (scelta == 1) {
		    	 
		    	

		             // Stampa dei prodotti nella lista
		             for (Prod prodotto : listaProdotti) {
		                 System.out.println(prodotto);
		             }

		        
		     }
			
			if (scelta == 2) {
		    	 System.out.println("Scrivi l'id del prodotto che vuoi acquistare: ");
				Scanner input1 = new Scanner (System.in);
				int id  = input1.nextInt();
				
				// Stampa dei prodotti nella lista
	             for (Prod prodotto : listaProdotti) {
	                 
	            	 if (prodotto.getId() == id) {
	            		 
	            		 listaAcquisti.add(prodotto);
	            	 }
	             }
	             
	          
	 			
	     	 
	     	String query1 = "UPDATE prodotti  SET quantita = quantita - 1 WHERE id= (?) ";
	     	try (Connection conn = DriverManager.getConnection(url + dbName, user, password);
	     		    PreparedStatement stmt = conn.prepareStatement(query1))
	     			
	     			{   // andiamo a definire il segnaposto nello statement
	     				stmt.setInt(1, id);
	     				
	     				int rows = stmt.executeUpdate();
	    				 if (rows > 0) {
	    					 // se vengono tovati dati, vengono stampati
	    		                System.out.println("Prodotto acquistato con successo");
	    			
	    		}
	    				 else {
	    					 System.out.println("Id non trovato!!!");
	    				 }
	     				
	     	
	      }
	     	catch (SQLException e) {
	     	     // Gestione dell'eccezione per la connessione al database o l'esecuzione della query
	     	     System.out.println("Errore durante la ricerca dei dati nella tabella 'prodotti':");
	     	     e.printStackTrace();
	     	 }  

	        
	             

	        
	     }
			
			
			
			
			
		}
		
		while (scelta != 0);
		
		System.out.println("Grazie per aver acquistato da noi: ");
		System.out.println("Riepilogo ordine: ");
	     // Stampa dei prodotti nella lista
        for (Prod prodotto : listaAcquisti) {
            System.out.println(prodotto);
        }
		
	}

}
