package use_case.validation.context;

import use_case.validation.strategy.IValidationStrategy;

public interface IValidationContext {

    void validate(IValidationStrategy iValidationStrategy);

}
