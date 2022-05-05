package com.ruchika.flightreservation.services;

import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.ruchika.flightreservation.pojo.Reservation;

@Component
public class SendMail {

	@Autowired
	JavaMailSender mailSender;
	
	public void sendEmail(String toAddress,String attachmentLoc,Reservation reservation) {
		
		  MimeMessage mimeMessage = mailSender.createMimeMessage();
		  
	        try {
	 
	            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
	 
	            mimeMessageHelper.setSubject("Itinerary for your Flight");
	            mimeMessageHelper.setTo(toAddress);
	            mimeMessageHelper.setText("E-Ticket for Your Flight Booking ID:"+reservation.getId());
	            mimeMessageHelper.addAttachment("Itinerary",new File(attachmentLoc));
	            mailSender.send(mimeMessageHelper.getMimeMessage());
	            System.out.println("Email Sent");
	        }
	        
		 catch(MessagingException e) {
        e.printStackTrace();
		} 
	}
}
