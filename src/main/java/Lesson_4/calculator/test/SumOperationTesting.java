package Lesson_4.calculator.test;

import Lesson_4.calculator.java.Calculator;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SumOperationTesting extends BaseTestClass {

    Calculator calculator = new Calculator();

    @Test(testName = "Verify entering correct value for sum operation")
    public void correctValueForSumOperation() {
        Assert.assertEquals(calculator.sumOperation(10, 20), 30);
    }

    @Test(testName = "Verify entering zero values for sum operation")
    public void zeroValueForSumOperation() {
        Assert.assertEquals(calculator.sumOperation(0, 0), 0);
    }

    @Test(testName = "Verify entering two minus values for sum operation")
    public void twoMinusValuesForSumOperation() {
        Assert.assertEquals(calculator.sumOperation(-10, -20), -30);
    }

    @Test(testName = "Verify entering minus values as first parameter for sum operation")
    public void firstParameterMinusValueForSumOperation() {
        Assert.assertEquals(calculator.sumOperation(-10, 20), 10);
        //Reporter.log("Test is passed");
    }

    @Test(testName = "Verify entering minus values as second parameter for sum operation")
    public void secondParameterMinusValueForSumOperation() {
        Assert.assertEquals(calculator.sumOperation(15, -5), 10);
    }

    @Test(testName = "Verify entering double as parameter for sum operation")
    public void doubleValueForSumOperation() {
        Assert.assertEquals(calculator.sumOperation((int) 0.1, (int) 0.9), 1);
    }


}
