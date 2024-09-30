package uml.product.impl;

import uml.product.IProduct;

public class Product1 implements IProduct {

    private String featureA;
    private String featureB;
    private String featureC;

    public Product1(String featureA, String featureB, String featureC) {
        this.featureA = featureA;
        this.featureB = featureB;
        this.featureC = featureC;
    }

    @Override
    public String getFeatureA() {
        return featureA;
    }

    @Override
    public String getFeatureB() {
        return featureB;
    }

    @Override
    public String getFeatureC() {
        return featureC;
    }
}
