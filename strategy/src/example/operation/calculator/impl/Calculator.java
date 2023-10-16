package example.operation.calculator.impl;

import example.operation.calculator.ICalculator;
import example.operation.operator.IOperator;

public class Calculator implements ICalculator {

    private IOperator iOperator;

    @Override
    public void setIOperator(IOperator iOperator) {
        this.iOperator = iOperator;
    }

    @Override
    public void result() {
        iOperator.result();
    }
}
