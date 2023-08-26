package model;

import behavious.FlyNoWay;
import behavious.MuteQuack;

public class WoodenDuck extends Duck {

    public WoodenDuck() {
        this.iFlyBehaviour = new FlyNoWay();
        this.iQuackBehaviour =  new MuteQuack();
    }

    @Override
    public void display(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. Display.", duck.getName(), duck.getType()));
    }

}
