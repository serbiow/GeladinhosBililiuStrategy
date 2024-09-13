package com.company;

/** Classe cobertura de morango, estende a classe abstrata ItemDecorator */
public class StrawberryTopping extends ItemDecorator{
    public StrawberryTopping(Item decoratedItem){
        super(decoratedItem);
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " com cobertura de morango";
    }
    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + 1.50;
    }

}
