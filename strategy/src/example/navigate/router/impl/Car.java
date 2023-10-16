package example.navigate.router.impl;

import example.navigate.router.IRouter;

public class Car implements IRouter {
    @Override
    public void buildRouter() {
        System.out.println("Car");
    }
}
