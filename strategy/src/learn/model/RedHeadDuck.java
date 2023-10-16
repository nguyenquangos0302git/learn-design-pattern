package learn.model;

import learn.behaviour.IFlyBehaviour;
import learn.behaviour.IQuackBehaviour;
import learn.enums.EDuckType;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {}

    public RedHeadDuck(EDuckType type,
                       String name) {
        super(type, name);
    }

    @Override
    public void display(Duck duck) {
        System.out.printf("Name: %s, Type: %s display.%n", duck.getName(), duck.getType());
    }

}
