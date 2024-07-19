package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

        @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(10, 4);
        assertEquals(40, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 4);
        assertEquals(2.5, result, 0.0001); // 10 / 4 は 2.5 です。第3引数は許容誤差
    }

    @Test
    public void testDivide_DivisionByZero_ShouldThrowIllegalArgumentException() {
        Calculator calculator = new Calculator();
            // 例外がスローされることを確認
        try {
            calculator.divide(10, 0);
            fail();
        } catch (IllegalArgumentException e) {
            // assertThat(e.getMessage(), is("argument cannot be ZERO."));
        }
    }

}
