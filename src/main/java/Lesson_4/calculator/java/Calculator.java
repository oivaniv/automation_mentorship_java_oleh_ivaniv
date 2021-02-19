package Lesson_4.calculator.java;

import java.util.Scanner;

public class Calculator {

    private int firstEnteredValue;
    private int secondEnteredValue;
    private int operationResult;

    void enterValue() {
        Scanner scanner = new Scanner(System.in);

        firstEnteredValue = scanner.nextInt();
        secondEnteredValue = scanner.nextInt();

    }

    public int sumOperation(int firstEnteredValue, int secondEnteredValue) {
        operationResult = firstEnteredValue + secondEnteredValue;
        System.out.println("Sum result is: " + operationResult);
        return operationResult;
    }

    public int subtractOperation(int firstEnteredValue, int secondEnteredValue) {
        operationResult = firstEnteredValue - secondEnteredValue;
        System.out.println("Subtraction result is: " + operationResult);
        return operationResult;
    }

    public int multiplicationOperation(int firstEnteredValue, int secondEnteredValue) {
        operationResult = firstEnteredValue * secondEnteredValue;
        System.out.println("Multiplication result is: " + operationResult);
        return operationResult;
    }

    public int divisionOperation(int firstEnteredValue, int secondEnteredValue) {
        if (secondEnteredValue != 0) {
            operationResult = firstEnteredValue / secondEnteredValue;
            System.out.println("Division result is: " + operationResult);

        } else {
            System.out.println("Second entered value can't be 0!");
        }
        return operationResult;
    }
}
