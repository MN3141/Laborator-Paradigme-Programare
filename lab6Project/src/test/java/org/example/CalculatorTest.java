package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        Calculator ti=new Calculator(0.5f);
        ti.add(-0.5f);
        float temp=ti.getValue();
        assertEquals(0,temp);
    }

    @Test
    void subtract() {
        Calculator ti=new Calculator(0.5f);
        ti.subtract(-0.5f);
        float temp=ti.getValue();
        assertEquals(1,temp);
    }

    @Test
    void multiplyTest() {
        Calculator ti=new Calculator(0.5f);
        ti.multiply(4);
        float temp=ti.getValue();
       assertEquals(2,temp);
    }

    @Test
    void divideNull() {
        Calculator ti=new Calculator(1);
        ti.divide(0);
        float temp=ti.getValue() ;
        assertEquals(-12345,temp);
    }

    @Test
    void getValue() {
    }
}