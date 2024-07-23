import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMySql5 {
    public static void main(String[] args) {
        // Informazioni di connessione al database MySQL
        String url = "jdbc:mysql://localhost:3306/"; // URL del database
        String dbName = "mydb"; // Nome del database
        String user = "root"; // Nome utente
        String password = "Ilfoggia1"; // Password

        // Dati da inserire nella tabella
        
        ArrayList <Prod> listaProdotti = new ArrayList<>();
        
        
        int scelta = 0;
        
        do {
        Scanner input = new Scanner (System.in);
        System.out.println("Inserisci 1 per aggiungere 2 per visualizzare 3 per ricercare un prodotto i prodotti 0 per terminare: ");
        
        scelta = input.nextInt();
        
        if (scelta == 1) {
        
        System.out.print("Inserisci il nome: ");
        
        String nomeProdotto = input.next();
        
        System.out.println("Inserisci il prezzo: ");
        Scanner input1 = new Scanner (System.in);
        double prezzoProdotto = input1.nextDouble();
        System.out.println("Inserisci la qnt: ");
        int quantitaProdotto = input1.nextInt();
        String insertQuery1 = "INSERT INTO prodotti (nome, prezzo, quantita) VALUES (?, ?, ?)";

        
       
        
        
       

        // Query SQL per l'inserimento dei dati nella tabella "prodotti"
        String insertQuery = "INSERT INTO prodotti (nome, prezzo, quantita) " +
                             "VALUES ('" + nomeProdotto + "', " + prezzoProdotto + ", " + quantitaProdotto + ")";
        
    	
		
		

        // Tentativo di connessione al database e inserimento dei dati nella tabella
        try (Connection conn = DriverManager.getConnection(url + dbName, user, password);
        		PreparedStatement stmt = conn.prepareStatement(insertQuery1))
        		
        		
        		{
        	stmt.setString(1, nomeProdotto);
        	stmt.setDouble(2, prezzoProdotto);
        	stmt.setInt(3, quantitaProdotto);
        	
        	
        	
            // Esecuzione della query per l'inserimento dei dati
            int rowsAffected = stmt.executeUpdate();

            // Stampa il numero di righe aggiornate
            System.out.println("Numero di righe aggiornate: " + rowsAffected);

        } catch (SQLException e) {
            // Gestione dell'eccezione per la connessione al database o l'esecuzione della query
            System.out.println("Errore durante l'inserimento dei dati nella tabella 'prodotti':");
            e.printStackTrace();
        }
    }
     if (scelta == 2) {
    	 
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

             // Stampa dei prodotti nella lista
             for (Prod prodotto : listaProdotti) {
                 System.out.println(prodotto);
             }

         } catch (SQLException e) {
             // Gestione delle eccezioni per la connessione al database o la lettura dei dati
             System.out.println("Errore durante la lettura dei dati dalla tabella 'prodotti':");
             e.printStackTrace();
         }
     }
     
     else if (scelta == 3) {
    	 
    	 ArrayList <Prod> listaPrezzo = new ArrayList<>();
    	 
    	 String query1 = "SELECT * FROM prodotti WHERE prezzo = (?)";
			// andiamo a ricercare un prodotto all'interno del database
			System.out.println("inserisci il prodotto da ricercare");
			// chiediamo all'utente di inserire il nome del prodotto
			Scanner input3 = new Scanner (System.in);
			double prezzoI = input3.nextDouble();
			// creiamo una connessione e andiamo a dichiarare uno statement di tipo prepared
			try (Connection conn = DriverManager.getConnection(url + dbName, user, password);
		    PreparedStatement stmt = conn.prepareStatement(query1))
			
			{   // andiamo a definire il segnaposto nello statement
				stmt.setDouble(1, prezzoI);
				// andaimo ad assegnare il risultato della query a un result set
				ResultSet rs = stmt.executeQuery();
				 while (rs.next()) {
					 // se vengono tovati dati, vengono stampati
		                int id = rs.getInt("id");
		                String nome = rs.getString("nome");
		                double prezzo = rs.getDouble("prezzo");
		                int quantita = rs.getInt("quantita");
		                Prod prod1 = new Prod(id, nome, prezzo, quantita);
		                listaPrezzo.add(prod1);
			
		}
		
	}catch (SQLException e) {
     // Gestione dell'eccezione per la connessione al database o l'esecuzione della query
     System.out.println("Errore durante la ricerca dei dati nella tabella 'prodotti':");
     e.printStackTrace();
 }  
			
			
			
		for (Prod p1: listaPrezzo) {
			
			System.out.println(p1);
		}
        
        
        }}
    
    
    while (scelta != 0);
}}


