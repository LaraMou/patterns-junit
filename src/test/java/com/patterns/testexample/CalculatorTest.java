package com.patterns.testexample;


import com.patterns.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5,5));
    }

    @Test
    void sumTest(){
        Calculator calc = new Calculator();
        assertEquals(5.5,calc.sum(2.5,3));
        System.out.println("Suma");
    }


    @Test
    void subTest(){
        Calculator calc = new Calculator();
        assertEquals(5.5,calc.rest(10.5,5));
        System.out.println("Resta");
    }
}