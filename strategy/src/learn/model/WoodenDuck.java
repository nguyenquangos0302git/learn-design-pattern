package learn.model;

import learn.behaviour.IFlyBehaviour;
import learn.behaviour.IQuackBehaviour;
import learn.enums.EDuckType;

public class WoodenDuck extends Duck {

    public WoodenDuck() {}

    public WoodenDuck(EDuckType type,
                      String name,
                      IFlyBehaviour iFlyBehaviour,
                      IQuackBehaviour iQuackBehaviour) {
        super(type, name, iFlyBehaviour, iQuackBehaviour);
    }

    @Override
    public void display(Duck duck) {
        System.out.printf("Name: %s, Type: %s display.%n", duck.getName(), duck.getType());
    }

}
