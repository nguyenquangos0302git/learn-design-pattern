package uml.director;

import uml.builder.IBuilder;
import uml.product.IProduct;

public interface IDirector {

    IProduct buildProduct(IBuilder builder, String featureA, String featureB, String featureC);

}
