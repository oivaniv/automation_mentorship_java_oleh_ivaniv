package Lesson_4.calculator.java;

public class Runner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sumOperation(-10, 20);
        calculator.subtractOperation(10,20);
        calculator.multiplicationOperation(15, 20);

        calculator.divisionOperation(10, 0);
        calculator.divisionOperation(100, 10);
    }
}
