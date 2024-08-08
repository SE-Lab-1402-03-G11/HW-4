package calculator;

public class Calculator {
    public int newOperation(int num1, int num2) {
        if (num2 != 0) return (int) (Math.round(Math.sqrt(num1 / num2)));
        else throw new ArithmeticException("Do not divide by zero");
    }
}
