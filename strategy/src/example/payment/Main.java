package example.payment;

import example.payment.order.IOrder;
import example.payment.order.impl.Order;
import example.payment.method.IPaymentMethod;
import example.payment.method.impl.Cash;
import example.payment.method.impl.CreditCard;
import example.payment.method.impl.Paypal;

public class Main {

    public static void main(String[] args) {
        String method = "credit";
        pay(method);
    }

    private static void pay(String method) {
        IOrder iOrder = new Order();
        IPaymentMethod iPaymentMethod = new Cash();

        if ("credit".equalsIgnoreCase(method)) {
            iPaymentMethod = new CreditCard();
        } else if ("paypal".equalsIgnoreCase(method)) {
            iPaymentMethod = new Paypal();
        }

        iOrder.setIPaymentMethod(iPaymentMethod);
        iOrder.pay();
    }

}
