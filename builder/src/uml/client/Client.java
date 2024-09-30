package uml.client;

import uml.builder.IBuilder;
import uml.builder.impl.BuilderProduct1;
import uml.director.IDirector;
import uml.director.impl.Director;
import uml.product.IProduct;

public class Client {

    public static void main(String[] args) {

        String featureA = "featureA";
        String featureB = "featureB";
        String featureC = "featureC";

        IDirector director = new Director();
        IBuilder iBuilder = new BuilderProduct1();
        IProduct iProduct = director.buildProduct(iBuilder, featureA, featureB, featureC);

    }


}
