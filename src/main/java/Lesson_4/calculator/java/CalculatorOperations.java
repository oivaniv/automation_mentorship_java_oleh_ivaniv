package Lesson_4.calculator.java;

import java.util.Random;

public enum CalculatorOperations {

    SUM ("+"),
    SUBTRACT("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    String calculatorOperations;

    CalculatorOperations(String calculatorOperations) {
        this.calculatorOperations = calculatorOperations;
    }

    public String getCalculatorOperations() {
        return calculatorOperations;
    }
}
