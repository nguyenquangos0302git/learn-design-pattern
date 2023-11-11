package example;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Brew Coffee Grinds");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add Sugar And Milk");
    }

    @Override
    protected boolean hook() {
        return false;
    }
}
