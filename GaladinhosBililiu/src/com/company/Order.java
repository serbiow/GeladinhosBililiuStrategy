package com.company;

/** Classe Pedido */
public class Order {
    private Item item;
    private PaymentStrategy paymentStrategy;
    public Order(Item item) {
        this.item = item;
    }
    // Método para escolher a estratégia de pagamento
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    // Exibe os detalhes do pedido e realiza o pagamento
    public void processOrder() {
        System.out.println("Pedido: " + item.getDescription());
        System.out.println("Total: R$" + item.getPrice());
        paymentStrategy.pay(item.getPrice());
    }
}
