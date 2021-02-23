package Lesson_4.calculator.test;

import Lesson_4.calculator.java.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractOperationTest extends BaseTestClass{

    Calculator calculator = new Calculator();

    @Test(testName = "Verify entering correct value for subtract operation")
    public void correctValueForSubtractOperation(){
        Assert.assertEquals(calculator.subtractOperation(10, 5),5);
    }

    @Test(testName = "Verify entering second value for subtract operation higher than first")
    public void secondParameterValueForSubtractOperationHigher(){
        Assert.assertEquals(calculator.subtractOperation(10, 20),-10);
    }

    @Test(testName = "Verify entering two minus values for subtract operation")
    public void twoMinusValuesForSubtractOperation() {
        Assert.assertEquals(calculator.subtractOperation(-10, -20), 10);
    }

    @Test(testName = "Verify entering first parameter as minus values for subtract operation")
    public void firstMinusParameterValuesForSubtractOperation() {
        Assert.assertEquals(calculator.subtractOperation(-10, 10), -20);
    }

    @Test(testName = "Verify entering second parameter as minus values for subtract operation")
    public void secondMinusParameterValuesForSubtractOperation() {
        Assert.assertEquals(calculator.subtractOperation(-10, 10), -20);
    }

    @Test(testName = "Verify entering double as parameter for subtract operation")
    public void doubleValueForSumOperation() {
        Assert.assertEquals(calculator.subtractOperation((int) 0.1, (int) 0.9), 1);
    }




}
