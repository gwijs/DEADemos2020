package org.oose.dea;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void makeCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(4,calculator.add(2,2));
        assertEquals(100,calculator.add(25,75));
    }

    @Test
    public void testSubtract(){
        assertEquals(4, calculator.subtract(8,4));
        assertEquals(100, calculator.subtract(131, 31));
    }

    @Test
    public void testTimes(){
        assertEquals(50, calculator.times(5,10));
        assertEquals(49, calculator.times(7,7));
    }

    @Test
    public void testDivide(){
        assertEquals(32, calculator.divide(96,3));
        assertEquals(2, calculator.divide(4,2));
    }
}
