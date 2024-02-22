package impl;

import java.util.logging.Logger;

public class Calculator {
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2, ComplexOperation operation) {
        LOGGER.info("Выполнение операции над двумя комплексными числами: ");
        return operation.operate(num1, num2);
    }
}



