package structure_common;

public class Client {

    public static void main(String[] args) {

        test3();


    }

    private static void test1() {
        IComponent iComponent = new Leaf();
        iComponent.execute();
    }

    private static void test2() {
        Composite component1 = new Composite();
        IComponent leaf1 = new Leaf();
        IComponent leaf2 = new Leaf();

        component1.addChildren(leaf1);
        component1.addChildren(leaf2);

        component1.execute();
    }

    private static void test3() {
        Composite component1 = new Composite();
        IComponent leaf1 = new Leaf();
        IComponent leaf2 = new Leaf();
        component1.addChildren(leaf1);
        component1.addChildren(leaf2);

        Composite component2 = new Composite();
        component2.addChildren(component1);
        IComponent leaf3 = new Leaf();
        component2.addChildren(leaf3);

        component2.execute();
    }

}
