package com.example.task2;

public class GiftMail implements MailStrategy {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Sending gift letter to " +
         mailInfo.getClient().getName());
    }
}