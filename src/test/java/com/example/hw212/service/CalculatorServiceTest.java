package com.example.hw212.service;

import com.example.hw212.exception.DivByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest() {
        Number actual = calculatorService.plus(7, 5);
        Number expected = 12;
        Assertions.assertEquals(expected, actual);

        actual = calculatorService.plus(6, 2);
        expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minusTest() {
        Number actual = calculatorService.minus(7, 5);
        Number expected = 2;
        Assertions.assertEquals(expected, actual);

        actual = calculatorService.minus(6, 2);
        expected = 4;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void multiplyTest() {
        Number actual = calculatorService.multiply(7, 5);
        Number expected = 35;
        Assertions.assertEquals(expected, actual);

        actual = calculatorService.multiply(6, 2);
        expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideTest() {
        Number actual = calculatorService.divide(10, 5);
        Number expected = 2.0;
        Assertions.assertEquals(expected, actual);

        actual = calculatorService.divide(6, 2);
        expected = 3.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divideExceptionTest() {
        Assertions.assertThrows(DivByZeroException.class, () -> calculatorService.divide(10, 0));
        Assertions.assertThrows(DivByZeroException.class, () -> calculatorService.divide(5, 0));
    }
}
