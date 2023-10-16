package example.navigate.navigator.impl;

import example.navigate.navigator.INavigator;
import example.navigate.router.IRouter;

public class Navigator implements INavigator {

    private IRouter iRouter;

    @Override
    public void setIRouter(IRouter iRouter) {
        this.iRouter = iRouter;
    }

    @Override
    public void buildRouter() {
        iRouter.buildRouter();
    }
}
