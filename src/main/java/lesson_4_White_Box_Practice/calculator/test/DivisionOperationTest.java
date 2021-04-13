
package lesson_4_White_Box_Practice.calculator.test;

import lesson_4_White_Box_Practice.calculator.java.CalculatorOperations;
import lesson_4_White_Box_Practice.calculator.java.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionOperationTest extends BaseTestClass {
    Calculator calculator = new Calculator();

    @Test(testName = "Verify entering correct value for division operation")
    public void correctValueForDivisionOperation() {
        Assert.assertEquals(calculator.calculator(10.0, 5.0, CalculatorOperations.DIVISION), 2.0);
    }

    //We will assert this value with null
    @Test(testName = "Verify entering zero values for division operation", expectedExceptions = IllegalArgumentException.class)
    public void zeroValueForDivisionOperation() {
        calculator.calculator(0.0, 0.0, CalculatorOperations.DIVISION);
    }

    @Test(testName = "Verify entering zero values as first parameter for division operation")
    public void firstParameterZeroValueForDivisionOperation() {
        Assert.assertEquals(calculator.calculator(0.0, 2.0, CalculatorOperations.DIVISION), 0.0);
    }

    //Can't use null for /0 result, cause we can't return null as method result!
    @Test(testName = "Verify entering zero values as second parameter for division operation", expectedExceptions=IllegalArgumentException.class)
    public void secondParameterZeroValueForDivisionOperation() {
        calculator.calculator(2.0, 0.0, CalculatorOperations.DIVISION);
    }


    @Test(testName = "Verify entering two minus values for division operation")
    public void twoMinusValuesForDivisionOperation() {
        Assert.assertEquals(calculator.calculator(-10.0, -2.0, CalculatorOperations.DIVISION), 5.0);
    }

    @Test(testName = "Verify entering minus values as first parameter for division operation")
    public void firstParameterMinusValueForDivisionOperation() {
        Assert.assertEquals(calculator.calculator(-10.0, 2.0, CalculatorOperations.DIVISION), -5.0);
    }

    @Test(testName = "Verify entering minus values as second parameter for division operation")
    public void secondParameterMinusValueForDivisionOperation() {
        Assert.assertEquals(calculator.calculator(10.0, -2.0, CalculatorOperations.DIVISION), -5.0);
    }

    @Test(testName = "Verify entering int as parameter for division operation")
    public void intValueForDivisionOperation() {
        Assert.assertEquals(calculator.calculator(10,  2, CalculatorOperations.DIVISION), 5.0);
    }
}
