package com.gb.gofpatterns.factory;

public class SMSNotificationClient extends Client {

    public SMSNotificationClient(String destinationPort, String protocol, String host) {
        super(destinationPort, protocol, host);
    }

    @Override
    public void notify(Notification notification) {
        System.out.println("Sending notification from " + notification.getSender());
        System.out.println("Sending notification to " + notification.getReceipient());
    }
}
