package learn;

public class Main {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        coffee.prepareRecipe();
        System.out.println("\n");
        tea.prepareRecipe();

    }

}
