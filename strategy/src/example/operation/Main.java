package example.operation;

import example.operation.calculator.ICalculator;
import example.operation.calculator.impl.Calculator;
import example.operation.operator.IOperator;
import example.operation.operator.impl.Add;
import example.operation.operator.impl.Multiply;
import example.operation.operator.impl.Subtract;

public class Main {

    public static void main(String[] args) {
        String operation = "Add";
        operator(operation);
    }

    private static void operator(String operation) {
        ICalculator iCalculator = new Calculator();
        IOperator iOperator = new Add();

        if ("multiply".equalsIgnoreCase(operation)) {
            iOperator = new Multiply();
        } else if ("subtract".equalsIgnoreCase(operation)) {
            iOperator = new Subtract();
        }

        iCalculator.setIOperator(iOperator);
        iCalculator.result();
    }

}
