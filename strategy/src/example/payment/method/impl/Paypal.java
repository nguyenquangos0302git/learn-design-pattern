package example.payment.method.impl;

import example.payment.method.IPaymentMethod;

public class Paypal implements IPaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paypal");
    }

}
