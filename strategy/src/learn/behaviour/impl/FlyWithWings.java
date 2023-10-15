package learn.behaviour.impl;

import learn.behaviour.IFlyBehaviour;
import learn.model.Duck;

public class FlyWithWings implements IFlyBehaviour {
    @Override
    public void fly(Duck duck) {
        System.out.printf("Name: %s, Type: %s fly with wings.%n", duck.getName(), duck.getType());
    }
}
