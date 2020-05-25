package com.gb.gofpatterns.creational.factory;

public abstract class Client implements NotificationClient {
    private int destinationPort;
    private String protocol;
    private String host;

    public Client(int destinationPort, String protocol, String host) {
        this.destinationPort = destinationPort;
        this.protocol = protocol;
        this.host = host;
    }
}
