package uml.builder;

import uml.product.IProduct;

public interface IBuilder {

    IBuilder buildFeatureA(String featureA);

    IBuilder buildFeatureB(String featureB);

    IBuilder buildFeatureC(String featureC);

    IProduct buildProduct();

    IProduct getProduct();

}
