package learn.behaviour.impl;

import learn.behaviour.IFlyBehaviour;
import learn.model.Duck;

public class FlyNoWay implements IFlyBehaviour {
    @Override
    public void fly(Duck duck) {
        System.out.printf("Name: %s, Type: %s not fly.%n", duck.getName(), duck.getType());
    }
}
