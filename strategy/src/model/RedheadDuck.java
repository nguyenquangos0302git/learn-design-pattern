package model;

import behavious.FlyWithWings;
import behavious.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.iFlyBehaviour = new FlyWithWings();
        this.iQuackBehaviour = new Quack();
    }

    @Override
    public void display(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. Display.", duck.getName(), duck.getType()));
    }

}
