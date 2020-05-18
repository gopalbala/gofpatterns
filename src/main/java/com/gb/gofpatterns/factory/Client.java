package com.gb.gofpatterns.factory;

public abstract class Client implements NotificationClient {
    private String destinationPort;
    private String protocol;
    private String host;

    public Client(String destinationPort, String protocol, String host) {
        this.destinationPort = destinationPort;
        this.protocol = protocol;
        this.host = host;
    }
}
