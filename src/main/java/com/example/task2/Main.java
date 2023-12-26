package com.example.task2;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("John", 25, Sex.MALE);
        Client client2 = new Client("Jane", 30, Sex.FEMALE);

        MailInfo birthdayMail = new MailInfo(client1, MailCode.BIRTHDAYMAIL);
        MailInfo giftMail = new MailInfo(client2, MailCode.GIFTMAIL);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(giftMail);

        mailBox.sendAll();
    }
}