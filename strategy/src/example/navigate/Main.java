package example.navigate;

import example.navigate.navigator.INavigator;
import example.navigate.navigator.impl.Navigator;
import example.navigate.router.IRouter;
import example.navigate.router.impl.Car;
import example.navigate.router.impl.Cycle;
import example.navigate.router.impl.Walking;

public class Main {

    public static void main(String[] args) {
        String transport = "walking";
        routerPlan(transport);
    }

    private static void routerPlan(String transport) {
        INavigator iNavigator = new Navigator();
        IRouter iRouter = new Walking();

        if ("cycle".equalsIgnoreCase(transport)) {
            iRouter = new Cycle();
        } else if ("car".equalsIgnoreCase(transport)) {
            iRouter = new Car();
        }

        iNavigator.setIRouter(iRouter);
        iNavigator.buildRouter();
    }

}
