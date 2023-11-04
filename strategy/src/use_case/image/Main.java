package use_case.image;

import use_case.image.context.IFilterImageContext;
import use_case.image.context.impl.FilterImageContext;
import use_case.image.strategy.impl.Blur;

public class Main {

    public static void main(String[] args) {
        IFilterImageContext iFilterImageContext = new FilterImageContext();
        iFilterImageContext.processFilter(new Blur());
    }

}
