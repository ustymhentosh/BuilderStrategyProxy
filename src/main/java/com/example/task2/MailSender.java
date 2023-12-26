package com.example.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailSender {
    private MailStrategy mailStrategy;

    public void sendMail(MailInfo mailInfo) {
        mailStrategy.sendMail(mailInfo);
    }
}