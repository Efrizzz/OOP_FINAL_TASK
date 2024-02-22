package operations;

import impl.ComplexNumber;
import impl.ComplexOperation;

public class MultiplyOperation implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        return num1.multiply(num2);
    }
}

