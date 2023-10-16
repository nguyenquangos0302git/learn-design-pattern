package learn;

import learn.behaviour.impl.*;
import learn.enums.EDuckType;
import learn.model.*;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck(EDuckType.MALLARD, "Mallard");
        mallard.setiFlyBehaviour(new FlyWithWings());
        mallard.setiQuackBehaviour(new Quack());

        Duck redhead = new RedHeadDuck(EDuckType.REDHEAD, "Redhead");
        redhead.setiFlyBehaviour(new FlyWithWings());
        redhead.setiQuackBehaviour(new Quack());

        Duck rubber = new RubberDuck(EDuckType.RUBBER, "Rubber");
        rubber.setiFlyBehaviour(new FlyNoWay());
        rubber.setiQuackBehaviour(new Squeak());

        Duck wooden = new WoodenDuck(EDuckType.WOODEN, "Wooden");
        wooden.setiFlyBehaviour(new FlyNoWay());
        wooden.setiQuackBehaviour(new MuteQuack());

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
