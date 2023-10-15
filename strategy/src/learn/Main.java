package learn;

import learn.behaviour.impl.*;
import learn.enums.EDuckType;
import learn.model.*;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck(EDuckType.MALLARD, "Mallard", new FlyWithWings(), new Quack());
        Duck redhead = new RedHeadDuck(EDuckType.REDHEAD, "Redhead", new FlyWithWings(), new Quack());
        Duck rubber = new RubberDuck(EDuckType.RUBBER, "Rubber", new FlyNoWay(), new Squeak());
        Duck wooden = new WoodenDuck(EDuckType.WOODEN, "Wooden", new FlyNoWay(), new MuteQuack());

        show(mallard);
        show(redhead);
        show(rubber);
        show(wooden);
    }

    private static void show(Duck duck) {
        duck.quack(duck);
        duck.swim(duck);
        duck.fly(duck);
        duck.display(duck);
    }

}
