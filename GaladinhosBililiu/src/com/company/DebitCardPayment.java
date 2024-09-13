package com.company;

/** Classe pagamento no Cartão de Débito, implementa interface PaymeentStrategy */
public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado com cartão de débito.");
    }
}
