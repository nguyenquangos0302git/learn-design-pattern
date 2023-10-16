package example.navigate.router.impl;

import example.navigate.router.IRouter;

public class Walking implements IRouter {
    @Override
    public void buildRouter() {
        System.out.println("Walking");
    }
}
