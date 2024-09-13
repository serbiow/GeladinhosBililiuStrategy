package com.company;

/** Classe cobertura de chocolate, estende a classe abstrata ItemDecorator */
public class ChocolateTopping extends ItemDecorator{
    public ChocolateTopping(Item decoratedItem){
        super(decoratedItem);
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription() + " com cobertura de chocolate";
    }
    @Override
    public double getPrice() {
        return decoratedItem.getPrice() + 2.00;
    }

}
