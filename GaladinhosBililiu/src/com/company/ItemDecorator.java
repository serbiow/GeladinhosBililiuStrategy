package com.company;

/** Classe abstrata de personalização do pedido, implementa interface Item */
public abstract class ItemDecorator implements Item{
    protected Item decoratedItem;

    public ItemDecorator(Item decoratedItem) {
        this.decoratedItem = decoratedItem;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription();
    }
    @Override
    public double getPrice() {
        return decoratedItem.getPrice();
    }

}
