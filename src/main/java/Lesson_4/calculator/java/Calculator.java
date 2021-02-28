package Lesson_4.calculator.java;

import java.util.Scanner;

public class Calculator {

    private Double operationResult = 0.0;

    public double calculator(double firstEnteredValue, double secondEnteredValue, CalculatorOperations calculatorOperations) {

        switch (calculatorOperations) {
            case SUM:
                operationResult = firstEnteredValue + secondEnteredValue;
                break;
            case SUBTRACT:
                operationResult = firstEnteredValue - secondEnteredValue;
                System.out.println(operationResult);
                break;
            case MULTIPLICATION:
                operationResult = firstEnteredValue * secondEnteredValue;
                System.out.println(operationResult);
                break;
            case DIVISION:
                if (secondEnteredValue == 0) {
                    throw new IllegalArgumentException("Second entered value can't be 0!");
                } else {
                    operationResult = firstEnteredValue / secondEnteredValue;
                    System.out.println(operationResult);
                }
                break;
        }
        //System.out.println(operationResult);
        //Why i see .000000 after value???
        //System.out.printf("Result of " + calculatorOperations + " operation for %g and %g is %g", firstEnteredValue, secondEnteredValue, operationResult);
        System.out.println("Result of " + calculatorOperations + " operation for " + firstEnteredValue + " and " + secondEnteredValue + " is " + operationResult);

        return operationResult;


        //System.out.println("Division result for: (" + firstEnteredValue + ") / (" + secondEnteredValue + ") is: " + operationResult);

    }


}
