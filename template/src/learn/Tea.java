package learn;

public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Steep Tea Bag");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add Lemon");
    }

}
