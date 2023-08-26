package behavious;

import model.Duck;

public class MuteQuack implements IQuackBehaviour {

    @Override
    public void quack(Duck duck) {
        System.out.println(String.format("Duck: %s. Type: %s. Mute Quack.", duck.getName(), duck.getType()));
    }

}
