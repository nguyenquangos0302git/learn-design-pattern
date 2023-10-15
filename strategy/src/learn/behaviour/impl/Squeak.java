package learn.behaviour.impl;

import learn.behaviour.IQuackBehaviour;
import learn.model.Duck;

public class Squeak implements IQuackBehaviour {
    @Override
    public void quack(Duck duck) {
        System.out.printf("Name: %s, Type: %s squeak.%n", duck.getName(), duck.getType());
    }
}
