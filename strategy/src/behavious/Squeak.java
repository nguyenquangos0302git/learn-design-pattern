package behavious;

import model.Duck;

public class Squeak implements IQuackBehaviour {

    @Override
    public void quack(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. Squeak.", duck.getName(), duck.getType()));
    }

}
