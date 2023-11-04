package use_case.balance;

import use_case.balance.context.ILoadBalancingContext;
import use_case.balance.context.impl.LoadBalancingContext;
import use_case.balance.strategy.impl.LeastConnectionsStrategy;

public class Main {

    public static void main(String[] args) {
        ILoadBalancingContext iLoadBalancingContext = new LoadBalancingContext();
        iLoadBalancingContext.chooseServer(new LeastConnectionsStrategy());
    }

}
