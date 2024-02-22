package operations;

import impl.ComplexNumber;
import impl.ComplexOperation;

public class AddOperation implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        return num1.add(num2);
    }
}
