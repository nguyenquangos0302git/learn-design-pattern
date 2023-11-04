package use_case.validation;

import use_case.validation.context.IValidationContext;
import use_case.validation.context.impl.ValidationContext;
import use_case.validation.strategy.impl.EmailValidation;

public class Main {

    public static void main(String[] args) {
        IValidationContext iValidationContext = new ValidationContext();
        iValidationContext.validate(new EmailValidation());
    }

}
