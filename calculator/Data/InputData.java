package Data;

import java.util.Scanner;
import impl.ComplexNumber;

public class InputData {
    private Scanner scanner;

    public InputData() {
        this.scanner = new Scanner(System.in);
    }

    public ComplexNumber getComplexNumber() {
        System.out.println("Введите действительную часть комплексного числа:");
        double real = scanner.nextDouble();
        System.out.println("Введите мнимую часть комплексного числа:");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public void closeScanner() {
        scanner.close();
    }
}
