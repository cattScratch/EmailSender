package com.emailsender.emailsender;

public class EmailDTOS {
    private String name;
    private String email;
    private String subject;
    private String message;

    public EmailDTOS(){}

    public EmailDTOS(String name, String email, String subject, String message){
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }
    public String getName(){ return this.name = name;}
    public void setName(String name){ this.name = name;}

    public String getEmail(){ return this.email = email;}
    public void setEmail(String email){ this.email = email;}

    public String getSubject(){ return this.subject = subject;}
    public void setSubject(String subject){ this.subject = subject;}

    public String getMessage(){ return this.message = message;}
    public void setMessage(String message){ this.message = message;}

}
