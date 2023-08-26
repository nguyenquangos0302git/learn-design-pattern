package model;

import behavious.IFlyBehaviour;
import behavious.IQuackBehaviour;

public abstract class Duck {

    private DuckType type;

    private String name;

    protected IFlyBehaviour iFlyBehaviour;

    protected IQuackBehaviour iQuackBehaviour;

    public DuckType getType() {
        return type;
    }

    public void setType(DuckType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setiFlyBehaviour(IFlyBehaviour iFlyBehaviour) {
        this.iFlyBehaviour = iFlyBehaviour;
    }

    public void setiQuackBehaviour(IQuackBehaviour iQuackBehaviour) {
        this.iQuackBehaviour = iQuackBehaviour;
    }

    public void swim(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. Swim.", duck.getName(), duck.getType()));
    }

    public void performFly(Duck duck) {
        iFlyBehaviour.fly(duck);
    }

    public void performQuack(Duck duck) {
        iQuackBehaviour.quack(duck);
    }

    public abstract void display(Duck duck);

}
