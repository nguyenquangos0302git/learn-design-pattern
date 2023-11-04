package use_case.balance.context.impl;

import use_case.balance.context.ILoadBalancingContext;
import use_case.balance.strategy.ILoadBalancingStrategy;

public class LoadBalancingContext implements ILoadBalancingContext {
    @Override
    public void chooseServer(ILoadBalancingStrategy iLoadBalancingStrategy) {
        iLoadBalancingStrategy.chooseServer();
    }
}
