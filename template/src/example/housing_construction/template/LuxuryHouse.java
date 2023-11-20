package example.housing_construction.template;

public class LuxuryHouse extends HouseTemplate {

    @Override
    protected void buildRoof() {
        System.out.println("build another roof");
    }

}
