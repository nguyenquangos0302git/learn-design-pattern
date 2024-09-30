package uml.director.impl;

import uml.builder.IBuilder;
import uml.director.IDirector;
import uml.product.IProduct;

public class Director implements IDirector {

    @Override
    public IProduct buildProduct(IBuilder builder, String featureA, String featureB, String featureC) {
        return builder
                .buildFeatureA(featureA)
                .buildFeatureB(featureB)
                .buildFeatureC(featureC)
                .buildProduct();
    }

}
