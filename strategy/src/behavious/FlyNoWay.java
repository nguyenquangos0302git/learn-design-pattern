package behavious;

import model.Duck;

public class FlyNoWay implements IFlyBehaviour {

    @Override
    public void fly(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. No Fly.", duck.getName(), duck.getType()));
    }

}
