package com.company;

/** Testes de Saída */
public class Main {
    public static void main(String[] args) {
        // Cliente faz um pedido de hambúrguer com queijo extra e bacon
        Item chocolateIceCream = new ChocolateIceCream();
        chocolateIceCream = new StrawberryTopping(chocolateIceCream);
        chocolateIceCream = new Granulated(chocolateIceCream);

        // Cria o pedido com o item personalizado
        Order order = new Order(chocolateIceCream);

        // Define o método de pagamento como Pix
        order.setPaymentStrategy(new CashPayment());

        // Processa o pedido
        order.processOrder();
    }
}
