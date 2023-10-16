package example.navigate.router.impl;

import example.navigate.router.IRouter;

public class Cycle implements IRouter {
    @Override
    public void buildRouter() {
        System.out.println("Cycle");
    }
}
