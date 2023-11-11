package example.user.context.impl;

import example.user.context.IUserManagerContext;
import example.user.strategy.IUserManagerStrategy;

public class UserManagerContextImpl implements IUserManagerContext {

    @Override
    public void getUserInformation(IUserManagerStrategy iUserManagerStrategy) {
        iUserManagerStrategy.getUserInformation();
    }

}
