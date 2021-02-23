package Lesson_4.calculator.test;

import Lesson_4.calculator.java.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionOperationTest extends BaseTestClass {
    Calculator calculator = new Calculator();

    @Test(testName = "Verify entering correct value for division operation")
    public void correctValueForDivisionOperation() {
        Assert.assertEquals(calculator.divisionOperation(10, 2), 5);
    }

    //What should be value to verify this test case
    @Test(testName = "Verify entering zero values for division operation")
    public void zeroValueForDivisionOperation() {
        Assert.assertEquals(calculator.divisionOperation(0, 0), 0);
    }

    @Test(testName = "Verify entering zero values as first parameter for division operation")
    public void firstParameterZeroValueForDivisionOperation() {
        Assert.assertEquals(calculator.divisionOperation(0, 2), 0);
    }

    //What should be value to verify this test case
    @Test(testName = "Verify entering zero values as second parameter for division operation")
    public void secondParameterZeroValueForDivisionOperation() {
        Assert.assertEquals(calculator.divisionOperation(2, 0), -0);
    }

    @Test(testName = "Verify entering two minus values for division operation")
    public void twoMinusValuesForDivisionOperation() {
        Assert.assertEquals(calculator.divisionOperation(-10, -2), 5);
    }

    @Test(testName = "Verify entering minus values as first parameter for division operation")
    public void firstParameterMinusValueForDivisionOperation() {
        Assert.assertEquals(calculator.divisionOperation(-10, 2), -5);
        //Reporter.log("Test is passed");
    }

    @Test(testName = "Verify entering minus values as second parameter for division operation")
    public void secondParameterMinusValueForDivisionOperation() {
        Assert.assertEquals(calculator.divisionOperation(10, -2), -5);
    }

    @Test(testName = "Verify entering double as parameter for division operation")
    public void doubleValueForDivisionOperation() {
        Assert.assertEquals(calculator.multiplicationOperation((int) 1.1, (int) 1.2), 1);
    }
}
