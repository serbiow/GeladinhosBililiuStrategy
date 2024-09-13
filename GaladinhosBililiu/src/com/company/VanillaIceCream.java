package com.company;

/** Classe Sorvete de Baunilha, implementa interface Item */
public class VanillaIceCream implements Item{
    @Override
    public String getDescription() {
        return "Sorvete de Baunilha";
    }
    @Override
    public double getPrice() {
        return 7.00;
    }
}
