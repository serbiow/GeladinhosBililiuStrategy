package com.company;

/** Classe Sorvete de Chocolate, implementa interface Item */
public class ChocolateIceCream implements Item{
    @Override
    public String getDescription() {
        return "Sorvete de Chocolate";
    }
    @Override
    public double getPrice() {
        return 10.00;
    }
}
