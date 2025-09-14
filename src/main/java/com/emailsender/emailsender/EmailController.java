package com.emailsender.emailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final JavaMailSender mailSender;

    public EmailController(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @RequestMapping("/send-email")
    public String sendEmail(@RequestBody EmailDTOS emailDTOS) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom("mjustineguiaz@gmail.com");
            message.setTo("mjustineguiaz@gmail.com");
            message.setSubject("New message from portfolio");
            message.setText(
                    "From: " + emailDTOS.getName() + " (" + emailDTOS.getEmail() + ")\n" +
                            emailDTOS.getSubject()+ "\n\n" +
                            emailDTOS.getMessage()
            );

            mailSender.send(message);
            return "success";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
