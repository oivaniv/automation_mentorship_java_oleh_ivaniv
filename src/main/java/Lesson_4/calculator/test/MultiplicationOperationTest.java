package Lesson_4.calculator.test;

import Lesson_4.calculator.java.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationOperationTest extends BaseTestClass {

    Calculator calculator = new Calculator();

    @Test(testName = "Verify entering correct value for multiplication operation")
    public void correctValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.multiplicationOperation(10, 2), 20);
    }

    @Test(testName = "Verify entering zero values for multiplication operation")
    public void zeroValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.multiplicationOperation(0, 0), 0);
    }

    @Test(testName = "Verify entering two minus values for multiplication operation")
    public void twoMinusValuesForMultiplicationOperation() {
        Assert.assertEquals(calculator.multiplicationOperation(-10, -2), -20);
    }

    @Test(testName = "Verify entering minus values as first parameter for multiplication operation")
    public void firstParameterMinusValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.multiplicationOperation(-10, 2), -20);
        //Reporter.log("Test is passed");
    }

    @Test(testName = "Verify entering minus values as second parameter for multiplication operation")
    public void secondParameterMinusValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.multiplicationOperation(10, -2), -20);
    }

    @Test(testName = "Verify entering double as parameter for multiplication operation")
    public void doubleValueForMultiplicationOperation() {
        Assert.assertEquals(calculator.multiplicationOperation((int) 1.1, (int) 1.2), 1);
    }
}
