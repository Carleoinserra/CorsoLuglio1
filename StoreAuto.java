import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class StoreAuto {
	
	public static void sendEmail(String to, String subject, String body) {
        // Configura le proprietà della connessione SMTP di Gmail
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Autenticazione
        final String from = "inserracarlo@gmail.com";
        final String password = "zvdj eobr ozcc kcxk";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Creazione del messaggio
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            // Invio del messaggio
            Transport.send(message);
            System.out.println("Email inviata con successo!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				 ArrayList <auto> listaAuto = new ArrayList<>();
				
				int scelta = 0;
				
				 String url = "jdbc:mysql://localhost:3306/"; // URL del database
			        String dbName = "mydb"; // Nome del database
			        String user = "root"; // Nome utente
			        String password = "Ilfoggia1"; // Password
			        
			        String selectQuery = "SELECT * FROM auto";

			         // Tentativo di connessione al database e lettura dei dati dalla tabella
			         try (Connection conn = DriverManager.getConnection(url + dbName, user, password);
			              Statement stmt = conn.createStatement();
			              ResultSet rs = stmt.executeQuery(selectQuery)) {

			             // Iterazione sui risultati e lettura dei dati
			             while (rs.next()) {
			                 int id = rs.getInt("id");
			                 
			                 String nome = rs.getString("nome");
			                 String marca = rs.getString("marca");
			                 double prezzo = rs.getDouble("prezzo");
			                 int quantita = rs.getInt("quantita");
			                 
			                 // Creazione di un nuovo oggetto Prodotto e aggiunta alla lista
			                 auto a1 = new auto(id, nome, marca, prezzo, quantita);
			                 listaAuto.add(a1);
			             }
			         } catch (SQLException e) {
			             // Gestione delle eccezioni per la connessione al database o la lettura dei dati
			             System.out.println("Errore durante la lettura dei dati dalla tabella 'prodotti':");
			             e.printStackTrace();
			         }

			         do {
						  
			 			
			 			System.out.println("Inserisci 1  per visualizzare le auto 2 per richiedere informazioni su un auto 0 per terminare: ");
			 			Scanner input = new Scanner (System.in);
			 			scelta = input.nextInt();
			 			
			 			
			 			if (scelta == 1) {
			 		    	 
			 		    	

			 		             // Stampa dei prodotti nella lista
			 		             for (auto a1 : listaAuto) {
			 		                 System.out.println(a1);
			 		             }

			 		        
			 		     }
			 			
			 			if (scelta == 2) {
			 				Scanner input1 = new Scanner (System.in);
			 				System.out.println("Scrivi il nome dell'auto di cui vuoi informazioni");
			 				String nome = input1.next();
			 				System.out.println("Scrivi la tua mail");
			 				String indirizzo = input1.next();
			 				auto autoOpzionata = null;
			 				boolean ok = false;
			 				for (auto a1: listaAuto) {
			 					if (a1.getNome().equals(nome)) {
			 						autoOpzionata = a1;
			 						sendEmail(indirizzo, "Risposta a richiesta informazioni",a1.toString());
			 						ok = true;
			 					}
			 				}
			 				if (!ok) {
			 					
			 					System.out.println("Errore nell'invio di informazioni riprovare");
			 					
			 				}
			 				
			 				
			 				
			 				
			 				
			 				
			 				
			 			}
			         
			         
			         
			         

	}
			         
			         while (scelta != 0);
	
	

}}
