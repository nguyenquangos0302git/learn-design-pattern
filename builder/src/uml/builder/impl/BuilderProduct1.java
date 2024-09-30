package uml.builder.impl;

import uml.builder.IBuilder;
import uml.product.IProduct;
import uml.product.impl.Product1;

public class BuilderProduct1 implements IBuilder {

    private String featureA;
    private String featureB;
    private String featureC;
    private IProduct product;

    @Override
    public IBuilder buildFeatureA(String featureA) {
        this.featureA = featureA;
        return this;
    }

    @Override
    public IBuilder buildFeatureB(String featureB) {
        this.featureB = featureB;
        return this;
    }

    @Override
    public IBuilder buildFeatureC(String featureC) {
        this.featureC = featureC;
        return this;
    }

    @Override
    public IProduct buildProduct() {
        return new Product1(featureA, featureB, featureC);
    }

    @Override
    public IProduct getProduct() {
        return product;
    }

}
