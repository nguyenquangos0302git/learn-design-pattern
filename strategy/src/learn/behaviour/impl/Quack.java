package learn.behaviour.impl;

import learn.behaviour.IQuackBehaviour;
import learn.model.Duck;

public class Quack implements IQuackBehaviour {
    @Override
    public void quack(Duck duck) {
        System.out.printf("Name: %s, Type: %s quack.%n", duck.getName(), duck.getType());
    }
}
