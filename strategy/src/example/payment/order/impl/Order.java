package example.payment.order.impl;

import example.payment.order.IOrder;
import example.payment.method.IPaymentMethod;

public class Order implements IOrder {

    private IPaymentMethod iPaymentStrategy;

    @Override
    public void setIPaymentMethod(IPaymentMethod iPaymentStrategy) {
        this.iPaymentStrategy = iPaymentStrategy;
    }

    @Override
    public void pay() {
        iPaymentStrategy.pay();
    }
}
