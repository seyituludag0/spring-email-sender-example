package com.example.springemailsenderexample;

import com.example.springemailsenderexample.abstracts.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailSenderExampleApplication {

	@Autowired
	EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailSenderExampleApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		emailSenderService.sendEmailWithAttachment("seyituludag0@gmail.com",
				"Burası mailin gövde kısmı",
				"Email gönderme denemesi",
				"C:\\Users\\Seyit\\Desktop\\code.jpg"

		);

	}

}
