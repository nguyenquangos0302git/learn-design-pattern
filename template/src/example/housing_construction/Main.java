package example.housing_construction;

import example.housing_construction.template.CarHouse;
import example.housing_construction.template.HouseTemplate;

public class Main {

    public static void main(String[] args) {
        HouseTemplate houseTemplate = new CarHouse();
        houseTemplate.constructHouse();
    }

}
