package com.gabrlaur.random.enums;

public enum Email {
    EMAIL1("@email.com"),
    EMAIL2("@gmail.com"),
    EMAIL3("@inbox.com");

    private final String emailValue;

    Email(String emailValue) {
        this.emailValue = emailValue;
    }

    public static String getEmailValue(Email email) {
        return Email.valueOf(String.valueOf(email)).emailValue;
    }
}
