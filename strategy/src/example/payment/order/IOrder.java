package example.payment.order;

import example.payment.method.IPaymentMethod;

public interface IOrder {

    void setIPaymentMethod(IPaymentMethod iPaymentStrategy);

    void pay();

}
