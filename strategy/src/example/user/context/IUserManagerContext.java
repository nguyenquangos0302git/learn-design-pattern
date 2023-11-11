package example.user.context;

import example.user.strategy.IUserManagerStrategy;

public interface IUserManagerContext {

    void getUserInformation(IUserManagerStrategy iUserManagerStrategy);

}
