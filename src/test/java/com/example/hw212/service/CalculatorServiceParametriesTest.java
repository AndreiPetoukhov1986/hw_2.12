package com.example.hw212.service;


import com.example.hw212.exception.DivByZeroException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParametriesTest {
    private final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> plusTestParams() {
        return Stream.of(
                Arguments.of(1, 5,6),
                Arguments.of(2, 6,8)

        );
    }
    @ParameterizedTest
    @MethodSource("plusTestParams")
    public void plusTest(int a, int b, int expected){
        Assertions.assertThat(calculatorService.plus(a,b))
                .isEqualTo(expected);
    }
    public static Stream<Arguments>  minusTestParams() {
        return Stream.of(
                Arguments.of(10, 5,5),
                Arguments.of(8, 5,3)

        );
    }
    @ParameterizedTest
    @MethodSource("minusTestParams")
    public void  minusTest(int a, int b, int expected){
        Assertions.assertThat(calculatorService. minus(a,b))
                .isEqualTo(expected);
    }
    public static Stream<Arguments>   multiplyTestParams() {
        return Stream.of(
                Arguments.of(10, 5,50),
                Arguments.of(8, 5,40)

        );
    }
    @ParameterizedTest
    @MethodSource("multiplyTestParams")
    public void  multiplyTest(int a, int b, int expected){
        Assertions.assertThat(calculatorService.multiply(a,b))
                .isEqualTo(expected);
    }
    public static Stream<Arguments>    divideTestParams() {
        return Stream.of(
                Arguments.of(10, 5,2),
                Arguments.of(8, 4,2)

        );
    }
    @ParameterizedTest
    @MethodSource("divideTestParams")
    public void   divideTest(int a, int b, int expected){
        Assertions.assertThat(calculatorService. divide(a,b))
                .isEqualTo(expected);
    }
    public static Stream<Arguments>    divideTestExceptionParams() {
        return Stream.of(
                Arguments.of(10, 0),
                Arguments.of(8, 0)

        );
    }
    @ParameterizedTest
    @MethodSource("divideTestExceptionParams")
    public void   divideExceptionTest(int a, int b){
        Assertions.assertThatExceptionOfType(DivByZeroException.class)
                .isThrownBy(() -> calculatorService.divide(a,b));
    }

}
