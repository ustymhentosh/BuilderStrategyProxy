package com.example.task2;

import lombok.Getter;

@Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }

    public MailStrategy getMailStrategy() {
        return mailCode.getStrategy();
    }
}
