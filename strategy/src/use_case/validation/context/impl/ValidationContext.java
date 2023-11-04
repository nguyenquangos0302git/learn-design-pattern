package use_case.validation.context.impl;

import use_case.validation.context.IValidationContext;
import use_case.validation.strategy.IValidationStrategy;

public class ValidationContext implements IValidationContext {
    @Override
    public void validate(IValidationStrategy iValidationStrategy) {
        iValidationStrategy.validate();
    }
}
