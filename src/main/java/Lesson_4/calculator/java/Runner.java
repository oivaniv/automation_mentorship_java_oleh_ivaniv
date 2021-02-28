package Lesson_4.calculator.java;

public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

      calculator.calculator(10, 20, CalculatorOperations.SUM);

      calculator.calculator(20, 10, CalculatorOperations.SUBTRACT);

      calculator.calculator(10, 10, CalculatorOperations.MULTIPLICATION);

      calculator.calculator(100, 10, CalculatorOperations.DIVISION);

      //calculator.calculator(10, 0, CalculatorOperations.DIVISION);
    }
}
