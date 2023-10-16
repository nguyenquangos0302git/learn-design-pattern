package example.payment.method.impl;

import example.payment.method.IPaymentMethod;

public class Cash implements IPaymentMethod {

    @Override
    public void pay() {
        System.out.println("Cash");
    }

}
