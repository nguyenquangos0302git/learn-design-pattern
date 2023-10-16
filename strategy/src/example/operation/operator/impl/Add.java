package example.operation.operator.impl;

import example.operation.operator.IOperator;

public class Add implements IOperator {
    @Override
    public void result() {
        System.out.println("Add");
    }
}
