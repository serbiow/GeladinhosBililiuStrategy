package com.company;

/** Classe Sorvete de Morango, implementa interface Item */
public class StrawberryIceCream implements Item{
    @Override
    public String getDescription() {
        return "Sorvete de Morango";
    }
    @Override
    public double getPrice() {
        return 8.00;
    }
}
