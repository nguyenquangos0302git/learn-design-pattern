package model;

import behavious.FlyNoWay;
import behavious.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.iFlyBehaviour = new FlyNoWay();
        this.iQuackBehaviour = new Squeak();
    }

    @Override
    public void display(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. Display.", duck.getName(), duck.getType()));
    }

}
