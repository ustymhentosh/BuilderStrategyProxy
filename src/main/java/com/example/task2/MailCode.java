package com.example.task2;

public enum MailCode {
    BIRTHDAYMAIL {
        public MailStrategy getStrategy() {
            return new BirthdayMail();
        }
    },
    GIFTMAIL {
        public MailStrategy getStrategy() {
            return new GiftMail();
        }
    };

    public abstract MailStrategy getStrategy();
}
