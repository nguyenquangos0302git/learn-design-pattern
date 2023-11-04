package use_case.game;

import use_case.game.context.IAiGameContext;
import use_case.game.context.impl.AiGameContextImpl;
import use_case.game.strategy.impl.AggressiveAIStrategy;

public class Main {

    public static void main(String[] args) {
        IAiGameContext iAiGameContext = new AiGameContextImpl();
        iAiGameContext.performMove(new AggressiveAIStrategy());
    }

}
