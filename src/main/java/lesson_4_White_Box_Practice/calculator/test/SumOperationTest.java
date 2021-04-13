package lesson_4_White_Box_Practice.calculator.test;

import lesson_4_White_Box_Practice.calculator.java.Calculator;
import lesson_4_White_Box_Practice.calculator.java.CalculatorOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOperationTest extends BaseTestClass {

    Calculator calculator = new Calculator();

    @Test(testName = "Verify entering correct value for sum operation")
    public void correctValueForSumOperation() {
        Assert.assertEquals(calculator.calculator(10.0, 20.0, CalculatorOperations.SUM), 30.0);
    }

    @Test(testName = "Verify entering zero values for sum operation")
    public void zeroValueForSumOperation() {
        Assert.assertEquals(calculator.calculator(0.0, 0.0, CalculatorOperations.SUM), 0.0);
    }

    @Test(testName = "Verify entering two minus values for sum operation")
    public void twoMinusValuesForSumOperation() {
        Assert.assertEquals(calculator.calculator(-10.0, -20.0, CalculatorOperations.SUM), -30.0);
    }

    @Test(testName = "Verify entering minus values as first parameter for sum operation")
    public void firstParameterMinusValueForSumOperation() {
        Assert.assertEquals(calculator.calculator(-10.0, 20.0, CalculatorOperations.SUM), 10.0);
    }

    @Test(testName = "Verify entering minus values as second parameter for sum operation")
    public void secondParameterMinusValueForSumOperation() {
        Assert.assertEquals(calculator.calculator(15.0, -5.0, CalculatorOperations.SUM), 10.0);
    }

    @Test(testName = "Verify entering double as parameter for sum operation")
    public void doubleValueForSumOperation() {
        Assert.assertEquals(calculator.calculator( 1,  9, CalculatorOperations.SUM), 10.0);
    }


}
