package com.gb.gofpatterns.creational.factory;

public class NotificationMain {
    public static void main(String[] args) {
        System.out.println("********Email notification*********");
        Notification emailNotification
                = new Notification("factory method tutorial published",
                "factory method", "signature",
                "follower@goprodeveloperbala.com",
                "sender@goprodeveloperbala.com");
        Client emailClient = NotificationFactory.getNotificationclient(ClientType.MAIL);
        emailClient.notify(emailNotification);
        System.out.println("**********SMS notification**********");
        Notification smsNotificaiton
                = new Notification("factory method tutorial published",
                "factory method", "signature",
                "8881045313",
                "TM-TUTS");
        Client smsClient = NotificationFactory.getNotificationclient(ClientType.MESSAGE);
        smsClient.notify(smsNotificaiton);
    }
}
