package example;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (hook()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boil Water");
    }

    private void pourInCup() {
        System.out.println("Pour In Cup");
    }

    protected boolean hook() {
        return true;
    }

}
