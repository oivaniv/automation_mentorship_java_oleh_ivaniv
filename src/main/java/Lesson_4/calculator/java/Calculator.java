package Lesson_4.calculator.java;

import java.util.Scanner;

public class Calculator {

    private int firstEnteredValue;
    private int secondEnteredValue;
    private int operationResult;

    public int calculator(int firstEnteredValue, int secondEnteredValue, String operator){

        return operationResult;
    }

    public int sumOperation(int firstEnteredValue, int secondEnteredValue) {
        operationResult = firstEnteredValue + secondEnteredValue;
        System.out.println("Sum result for: (" + firstEnteredValue + ") + (" + secondEnteredValue + ") is: " + operationResult);
        return operationResult;
    }

    public int subtractOperation(int firstEnteredValue, int secondEnteredValue) {
        operationResult = firstEnteredValue - secondEnteredValue;
        System.out.println("Subtraction result for: (" + firstEnteredValue + ") - (" + secondEnteredValue + ") is: " + operationResult);
        return operationResult;
    }

    public int multiplicationOperation(int firstEnteredValue, int secondEnteredValue) {
        operationResult = firstEnteredValue * secondEnteredValue;
        System.out.println("Multiplication result for: (" + firstEnteredValue + ") * (" + secondEnteredValue + ") is: " + operationResult);
        return operationResult;
    }

    public int divisionOperation(int firstEnteredValue, int secondEnteredValue) {
        if (secondEnteredValue != 0) {
            operationResult = firstEnteredValue / secondEnteredValue;
            System.out.println("Division result for: (" + firstEnteredValue + ") / (" + secondEnteredValue + ") is: " + operationResult);

        } else {
            //Can i assign some value to combine it in assert?
            // for example --->
            operationResult = 0;
            System.out.println("Second entered value can't be 0!");
        }
        return operationResult;
    }
}
