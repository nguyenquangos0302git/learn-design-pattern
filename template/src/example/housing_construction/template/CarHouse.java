package example.housing_construction.template;

public class CarHouse extends HouseTemplate {

    @Override
    protected void buildDoor() {
        System.out.println("build another door");
    }

}
