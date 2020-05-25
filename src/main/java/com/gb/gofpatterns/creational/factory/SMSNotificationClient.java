package com.gb.gofpatterns.creational.factory;

public class SMSNotificationClient extends Client {

    public SMSNotificationClient(int destinationPort, String protocol, String host) {
        super(destinationPort, protocol, host);
    }

    @Override
    public void notify(Notification notification) {
        System.out.println("Sending SMS notification from " + notification.getSender());
        System.out.println("Sending SMS notification to " + notification.getRecipient());
    }
}
