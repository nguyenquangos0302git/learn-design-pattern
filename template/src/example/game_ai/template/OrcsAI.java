package example.game_ai.template;

public class OrcsAI extends GameAI {
    @Override
    protected void buildStructures() {
        System.out.println("build structures");
    }

    @Override
    protected void buildUnits() {
        System.out.println("build units");
    }

    @Override
    protected void sendScouts() {
        System.out.println("send scouts");
    }

    @Override
    protected void sendWarriors() {
        System.out.println("send warriors");
    }
}
