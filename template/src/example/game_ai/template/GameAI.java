package example.game_ai.template;

public abstract class GameAI {

    public final void buildAi() {
        takeTurn();
        collectResource();
        buildStructures();
        buildUnits();
        attack();
        sendScouts();
        sendWarriors();
    }

    private void takeTurn() {
        System.out.println("take turn");
    }

    protected void collectResource() {
        System.out.println("collect resource");
    }

    protected abstract void buildStructures();

    protected abstract void buildUnits();

    private void attack() {
        System.out.println("attack");
    }

    protected abstract void sendScouts();

    protected abstract void sendWarriors();



}
