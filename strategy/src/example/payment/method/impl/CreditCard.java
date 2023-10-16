package example.payment.method.impl;

import example.payment.method.IPaymentMethod;

public class CreditCard implements IPaymentMethod {

    @Override
    public void pay() {
        System.out.println("Credit Card");
    }

}
