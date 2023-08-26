import model.*;

public class Main {

    public static void main(String[] args) {

        mallarDuck();
        rubberDuck();
        redheadDuck();
        woodenDuck();

    }

    private static void mallarDuck() {
        Duck mallard = new MallardDuck();
        mallard.setName("Mallard");
        mallard.setType(DuckType.MALLARD);
        mallard.swim(mallard);
        mallard.display(mallard);
        mallard.performFly(mallard);
        mallard.performQuack(mallard);
    }

    private static void rubberDuck() {
        Duck rubber = new RubberDuck();
        rubber.setName("Rubber");
        rubber.setType(DuckType.RUBBER);
        rubber.swim(rubber);
        rubber.display(rubber);
        rubber.performFly(rubber);
        rubber.performFly(rubber);
    }

    private static void redheadDuck() {
        Duck redhead = new RedheadDuck();
        redhead.setName("Redhead");
        redhead.setType(DuckType.REDHEAD);
        redhead.swim(redhead);
        redhead.display(redhead);
        redhead.performQuack(redhead);
        redhead.performFly(redhead);
    }

    private static void woodenDuck() {
        Duck wooden = new WoodenDuck();
        wooden.setName("Wooden");
        wooden.setType(DuckType.WOODEN);
        wooden.swim(wooden);
        wooden.display(wooden);
        wooden.performFly(wooden);
        wooden.performQuack(wooden);
    }

}
