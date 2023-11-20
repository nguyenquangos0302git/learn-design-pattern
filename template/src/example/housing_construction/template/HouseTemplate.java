package example.housing_construction.template;

public abstract class HouseTemplate {

    public final void constructHouse() {
        buildFrame();
        buildLaying();
        buildDoor();
        buildWindow();
        buildRoof();
        buildHouse();
    }

    protected void buildDoor() {
        System.out.println("build door");
    }

    protected void buildRoof() {
        System.out.println("build roof");
    }

    private void buildFrame() {
        System.out.println("build frame");
    }

    private void buildLaying() {
        System.out.println("build laying");
    }

    private void buildWindow() {
        System.out.println("build window");
    }

    private void buildHouse() {
        System.out.println("build house");
    }

}
