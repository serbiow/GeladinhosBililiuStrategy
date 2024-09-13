package com.company;

/** Classe granulado, estende a classe abstrata ItemDecorator */
public class Granulated extends ItemDecorator{
    public Granulated (Item decoratedItem){
        super(decoratedItem);
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " com granulado";
    }
    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + 1.00;
    }

}
