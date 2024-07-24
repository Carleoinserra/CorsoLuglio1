
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendEmail {

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
        String to = "inserracarlo@gmail.com";
        String subject = "Test app Java";
        String body = "Ciao, questa è una mail inviata dall'applicazione java.";
        sendEmail(to, subject, body);
    }
}

