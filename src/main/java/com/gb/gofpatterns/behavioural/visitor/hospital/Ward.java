package com.gb.gofpatterns.behavioural.visitor.hospital;

public interface Ward {
    String name();
    void accept(WardVisitor wardVisitor);
}
