package model;

import behavious.FlyWithWings;
import behavious.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.iFlyBehaviour = new FlyWithWings();
        this.iQuackBehaviour = new Quack();
    }

    @Override
    public void display(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. Display.", duck.getName(), duck.getType()));
    }

}
