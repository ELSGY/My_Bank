package com.mycompany.my_bank;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMail {
 
    String to = "cojocariu.flavius23@gmail.com"; 
    final String from = "xxxxxx@gmail.com"; 
    final String password = "xxxxx";
    Session session;
    
    private void connection(){
        
           Properties prop = new Properties();
           prop.put("mail.smtp.host", "smtp.gmail.com");
           prop.put("mail.smtp.port", "465");
           prop.put("mail.smtp.auth", "true");
           prop.put("mail.smtp.socketFactory.port", "465");
           prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

           session = Session.getInstance(prop, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
             return new PasswordAuthentication(from, password);
            }
           });
        
    }
    
    public void depozitMail(String cnp, String sold, String valuta, int sold_euro, int sold_ron) throws IOException, AddressException, MessagingException {
           
        connection();

           try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("My_Bank : Mesaj important privind monitorizarea conturilor!");

            String msg = "Proprietarul contului cu CNP : "+cnp+" a depozitat suma de : <b>"+sold+"</b> "+valuta+".<br> Sold EURO curent : "+String.valueOf(sold_euro)+".<br> Sold RON curent : "+String.valueOf(sold_ron)+". ";

            
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);
            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Mail successfully sent..");

           } catch (MessagingException e) {
           }
        }
    
    public void retragereMail(String cnp, String sold, String valuta, int sold_euro, int sold_ron) throws IOException, AddressException, MessagingException {
           
            connection();

           try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("My_Bank : Mesaj important privind monitorizarea conturilor!");

            String msg = "Proprietarul contului cu CNP : "+cnp+" a retras suma de : <b>"+sold+"</b> "+valuta+".<br> Sold EURO curent : "+String.valueOf(sold_euro)+".<br> Sold RON curent : "+String.valueOf(sold_ron)+". ";

            
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);
            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Mail successfully sent..");

           } catch (MessagingException e) {
           }
        }
    
    public void parasireMail(String cnp) throws IOException, AddressException, MessagingException {
           
            connection();

           try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("My_Bank : Mesaj important privind monitorizarea conturilor!");

            String msg = "Proprietarul contului cu CNP : "+cnp+" a facut o lichidare de cont.";

            
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);
            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Mail successfully sent..");

           } catch (MessagingException e) {
           }
        }
    
    
}