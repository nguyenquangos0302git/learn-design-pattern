package learn.behaviour.impl;

import learn.behaviour.IQuackBehaviour;
import learn.model.Duck;

public class MuteQuack implements IQuackBehaviour {
    @Override
    public void quack(Duck duck) {
        System.out.printf("Name: %s, Type: %s mute quack.%n", duck.getName(), duck.getType());
    }
}
