package com.example.task2;

public class BirthdayMail implements MailStrategy {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Sending birthday greetings to " + mailInfo.getClient().getName());
    }
}