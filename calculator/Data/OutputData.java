package Data;

import impl.ComplexNumber;
import services.CalculatorService;

public class OutputData {
    private CalculatorService calculatorService;

    public OutputData() {
        this.calculatorService = new CalculatorService();
    }

    public void doLogic() {
        InputData input = new InputData();
        ComplexNumber complex1 = input.getComplexNumber();
        ComplexNumber complex2 = input.getComplexNumber();

        ComplexNumber sum = calculatorService.addComplexNumbers(complex1, complex2);
        System.out.println("Сумма: " + sum.getReal() + " + " + sum.getImaginary() + "i");

        ComplexNumber product = calculatorService.multiplyComplexNumbers(complex1, complex2);
        System.out.println("Произведение: " + product.getReal() + " + " + product.getImaginary() + "i");

        ComplexNumber quotient = calculatorService.divideComplexNumbers(complex1, complex2);
        System.out.println("Частное: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");

        input.closeScanner();
    }
}
