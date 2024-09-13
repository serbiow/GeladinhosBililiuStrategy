package com.company;

/** Classe pagamento em dinheiro, implementa interface PaymeentStrategy */
public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado em Dinheiro.");
    }
}
