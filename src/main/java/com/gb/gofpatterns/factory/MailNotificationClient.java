package com.gb.gofpatterns.factory;

public class MailNotificationClient extends Client {

    public MailNotificationClient(int destinationPort, String protocol, String host) {
        super(destinationPort, protocol, host);
    }

    @Override
    public void notify(Notification notification) {
        System.out.println("Sending EMAIL notification from " + notification.getSender());
        System.out.println("Sending EMAIL notification to " + notification.getRecipient());
    }
}
