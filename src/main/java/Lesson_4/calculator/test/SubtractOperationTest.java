package Lesson_4.calculator.test;

import Lesson_4.calculator.java.Calculator;
import Lesson_4.calculator.java.CalculatorOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractOperationTest extends BaseTestClass{

    Calculator calculator = new Calculator();

    @Test(testName = "Verify entering correct value for subtract operation")
    public void correctValueForSubtractOperation(){
        Assert.assertEquals(calculator.calculator(10.0, 5.0, CalculatorOperations.SUBTRACT),5.0);
    }

    @Test(testName = "Verify entering second value for subtract operation higher than first")
    public void secondParameterValueForSubtractOperationHigher(){
        Assert.assertEquals(calculator.calculator(10.0, 20.0, CalculatorOperations.SUBTRACT),-10.0);
    }

    @Test(testName = "Verify entering two minus values for subtract operation")
    public void twoMinusValuesForSubtractOperation() {
        Assert.assertEquals(calculator.calculator(-10.0, -20.0,CalculatorOperations.SUBTRACT), 10.0);
    }

    @Test(testName = "Verify entering first parameter as minus values for subtract operation")
    public void firstMinusParameterValuesForSubtractOperation() {
        Assert.assertEquals(calculator.calculator(-10.0, 10.0,CalculatorOperations.SUBTRACT), -20.0);
    }

    @Test(testName = "Verify entering second parameter as minus values for subtract operation")
    public void secondMinusParameterValuesForSubtractOperation() {
        Assert.assertEquals(calculator.calculator(-10.0, 10.0,CalculatorOperations.SUBTRACT), -20.0);
    }

    @Test(testName = "Verify entering int as parameter for subtract operation")
    public void doubleValueForSumOperation() {
        Assert.assertEquals(calculator.calculator( 10,  2,CalculatorOperations.SUBTRACT), 8.0);
    }

}
