package use_case.balance.context;

import use_case.balance.strategy.ILoadBalancingStrategy;

public interface ILoadBalancingContext {
    void chooseServer(ILoadBalancingStrategy iLoadBalancingStrategy);
}
