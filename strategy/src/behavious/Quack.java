package behavious;

import model.Duck;

public class Quack implements IQuackBehaviour {

    @Override
    public void quack(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. Quack.", duck.getName(), duck.getType()));
    }

}
