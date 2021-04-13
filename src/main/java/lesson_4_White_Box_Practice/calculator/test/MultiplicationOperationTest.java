package lesson_4_White_Box_Practice.calculator.test;

import lesson_4_White_Box_Practice.calculator.java.Calculator;
import lesson_4_White_Box_Practice.calculator.java.CalculatorOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationOperationTest extends BaseTestClass {

    Calculator calculator = new Calculator();

    @Test(testName = "Verify entering correct value for multiplication operation")
    public void correctValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.calculator(10.0, 2.0, CalculatorOperations.MULTIPLICATION), 20.0);
    }

    @Test(testName = "Verify entering zero values for multiplication operation")
    public void zeroValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.calculator(0.0, 0.0, CalculatorOperations.MULTIPLICATION), 0.0);
    }


    @Test(testName = "Verify entering zero values as first parameter for multiplication operation")
    public void firstParameterZeroValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.calculator(0.0, 2.0, CalculatorOperations.MULTIPLICATION), 0.0);
    }

    @Test(testName = "Verify entering zero values as second parameter for multiplication operation")
    public void secondParameterZeroValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.calculator(2.0, 0.0, CalculatorOperations.MULTIPLICATION), 0.0);
    }

    @Test(testName = "Verify entering two minus values for multiplication operation")
    public void twoMinusValuesForMultiplicationOperation() {
        Assert.assertEquals(calculator.calculator(-10.0, -2.0, CalculatorOperations.MULTIPLICATION), 20.0);
    }

    @Test(testName = "Verify entering minus values as first parameter for multiplication operation")
    public void firstParameterMinusValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.calculator(-10.0, 2.0, CalculatorOperations.MULTIPLICATION), -20.0);
    }

    @Test(testName = "Verify entering minus values as second parameter for multiplication operation")
    public void secondParameterMinusValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.calculator(10.0, -2.0, CalculatorOperations.MULTIPLICATION), -20.0);
    }

    @Test(testName = "Verify entering int as parameter for multiplication operation")
    public void doubleValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.calculator(2, 5,CalculatorOperations.MULTIPLICATION), 10.0);
    }
}
