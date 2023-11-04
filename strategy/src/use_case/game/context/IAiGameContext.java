package use_case.game.context;

import use_case.game.strategy.IAiGameStrategy;

public interface IAiGameContext {

    void performMove(IAiGameStrategy iAiGameStrategy);

}
