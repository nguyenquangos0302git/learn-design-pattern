package learn.model;

import learn.behaviour.IFlyBehaviour;
import learn.behaviour.IQuackBehaviour;
import learn.enums.EDuckType;

public abstract class Duck {

    private EDuckType type;
    private String name;
    private IFlyBehaviour iFlyBehaviour;
    private IQuackBehaviour iQuackBehaviour;

    public Duck() {
    }

    public Duck(EDuckType type,
                String name) {
        this.type = type;
        this.name = name;
    }

    public EDuckType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setiFlyBehaviour(IFlyBehaviour iFlyBehaviour) {
        this.iFlyBehaviour = iFlyBehaviour;
    }

    public void setiQuackBehaviour(IQuackBehaviour iQuackBehaviour) {
        this.iQuackBehaviour = iQuackBehaviour;
    }

    public void quack(Duck duck) {
        iQuackBehaviour.quack(duck);
    }

    public void swim(Duck duck) {
        System.out.printf("Name: %s, Type: %s swim.%n", duck.name, duck.type);
    }

    public void fly(Duck duck) {
        iFlyBehaviour.fly(duck);
    }

    public abstract void display(Duck duck);

}
