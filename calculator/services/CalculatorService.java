package services;

import impl.ComplexNumber;
import impl.ComplexOperation;
import impl.Calculator;
import operations.AddOperation;
import operations.DivideOperation;
import operations.MultiplyOperation;

public class CalculatorService {
    private Calculator calculator;

    public CalculatorService() {
        this.calculator = new Calculator();
    }

    public ComplexNumber addComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
        ComplexOperation addOperation = new AddOperation();
        return calculator.calculate(num1, num2, addOperation);
    }

    public ComplexNumber multiplyComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
        ComplexOperation multiplyOperation = new MultiplyOperation();
        return calculator.calculate(num1, num2, multiplyOperation);
    }

    public ComplexNumber divideComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
        ComplexOperation divideOperation = new DivideOperation();
        return calculator.calculate(num1, num2, divideOperation);
    }
}


