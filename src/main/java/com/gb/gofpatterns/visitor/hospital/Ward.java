package com.gb.gofpatterns.visitor.hospital;

public interface Ward {
    String name();

    void accept(WardVisitor wardVisitor);
}
