package com.gb.gofpatterns.decorator.wikipedia;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Coffee {
    private double cost;
    private List<String> ingredients;
}
