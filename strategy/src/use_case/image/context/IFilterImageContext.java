package use_case.image.context;

import use_case.image.strategy.IFilterImageStrategy;

public interface IFilterImageContext {

    void processFilter(IFilterImageStrategy iFilterImageStrategy);

}
