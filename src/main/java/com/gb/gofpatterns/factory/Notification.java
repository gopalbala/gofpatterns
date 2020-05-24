package com.gb.gofpatterns.factory;

public class Notification {

    private String message;
    private String header;
    private String footer;
    private String recipient;
    private String sender;

    public Notification(String message, String header,
                        String footer, String recipient,
                        String sender) {
        this.message = message;
        this.header = header;
        this.footer = footer;
        this.recipient = recipient;
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }
}
