package fi.softala.bean;

import java.util.Properties;

/**
 * @author aleksi
 *
 */
public class Email {
	//lähettäjän sähköposti
	String senderEmail;
	//vastaanottajan sähköposti
	String receiverEmail;
	//lähettäjän osoite
	String host;
	
	/**
	 * 
	 */
	public Email() {
		senderEmail = "";
		receiverEmail = "";
		host = "";
	}
	
	/**
	 * @param senderEmail
	 * @param receiverEmail
	 */
	public Email(String senderEmail, String receiverEmail) {
		this.senderEmail = senderEmail;
		this.receiverEmail = receiverEmail;
		
	}
	
	/**
	 * @param 	senderEmail		Lähettäjän sähköpostiosoite
	 * @param 	receiverEmail	Vastaanottajan sähköpostiosoite
	 * @param 	host			Lähettäjän IP-osoite 
	 */
	public Email(String senderEmail, String receiverEmail, String host) {
		this.senderEmail = senderEmail;
		this.receiverEmail = receiverEmail;
		this.host = host;
	}
	
	public void sendEmail(String message) {
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
		
		
		
	}
	
	
}
