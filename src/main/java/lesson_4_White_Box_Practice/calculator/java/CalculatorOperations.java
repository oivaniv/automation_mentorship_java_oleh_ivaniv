package lesson_4_White_Box_Practice.calculator.java;

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
