package example.game_ai.template;

public class MonsterAI extends GameAI {
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

    @Override
    protected void collectResource() {
        System.out.println("collect resource");
    }
}
