package use_case.game.context.impl;

import use_case.game.context.IAiGameContext;
import use_case.game.strategy.IAiGameStrategy;

public class AiGameContextImpl implements IAiGameContext {

    @Override
    public void performMove(IAiGameStrategy iAiGameStrategy) {
        iAiGameStrategy.performMove();
    }

}
