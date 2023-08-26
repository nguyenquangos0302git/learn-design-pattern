package behavious;

import model.Duck;

public class FlyWithWings implements IFlyBehaviour{
    @Override
    public void fly(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. Fly With Wings.", duck.getName(), duck.getType()));
    }
}
