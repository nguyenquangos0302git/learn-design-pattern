package use_case.image.context.impl;

import use_case.image.context.IFilterImageContext;
import use_case.image.strategy.IFilterImageStrategy;

public class FilterImageContext implements IFilterImageContext {

    @Override
    public void processFilter(IFilterImageStrategy iFilterImageStrategy) {
        iFilterImageStrategy.processFilter();
    }

}
