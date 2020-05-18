package com.gb.gofpatterns.factory;

public class NotificationMain {
    public static void main(String[] args) {
        System.out.println("********Email notification*********");
        Notification emailNotification
                = new Notification("factory method tutorial published",
                "factory method", "signature",
                "follower@goprodeveloperbala.com",
                "sender@goprodeveloperbala.com");
        Client emaiClient = NotificationFactory.getNotificationclient(ClientType.MAIL);
        emaiClient.notify(emailNotification);
        System.out.println("**********SMS notification**********");
        Notification smsNotificaiton
                = new Notification("factory method tutorial published",
                "factory method", "signature",
                "8881045313",
                "TM-TUTS");
        Client smsClient = NotificationFactory.getNotificationclient(ClientType.MAIL);
        smsClient.notify(smsNotificaiton);
    }
}
