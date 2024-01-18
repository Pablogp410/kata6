package tests;

import org.junit.Test;
import software.ulpgc.kata6.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void twoNumbersSum() {
        Calculator calculator = new Calculator();
        int result=calculator.sum(1,2);
        assertEquals(result,3);
    }

    @Test
    public void twoNumbersSubst() {
        Calculator calculator = new Calculator();
        int result=calculator.subs(3,2);
        assertEquals(result,1);
    }

    @Test
    public void twoNumbersMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.mult(3,2);
        assertEquals(result,6);
    }

    @Test
    public void twoNumbersDivision() {
        Calculator calculator = new Calculator();
        int result=calculator.div(4,2);
        assertEquals(result,2);
    }

    @Test
    public void divisionByZero() {
        Calculator calculator = new Calculator();
        int result=calculator.div(4,0);
        assertEquals(result,0);
    }

    @Test
    public void squareRootOfANumber() {
        Calculator calculator = new Calculator();
        int result=calculator.squareRoot(4);
        assertEquals(result,2);
    }

    @Test
    public void squareRootOfANegativeNumber() {
        Calculator calculator = new Calculator();
        int result=calculator.squareRoot(-4);
        assertEquals(result,0);
    }

    @Test
    public void numberToThePowerOfAnotherNumber() {
        Calculator calculator = new Calculator();
        int result=calculator.powerOf(3,2);
        assertEquals(result,9);
    }

    @Test
    public void factorialOfANumber() {
        Calculator calculator = new Calculator();
        int result=calculator.factorial(5);
        assertEquals(result,120);
    }
}
