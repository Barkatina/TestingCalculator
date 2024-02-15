package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest { @BeforeAll
public static void setUp() {
    System.out.println("before all");
}
    @BeforeEach
    public void setUpEach() {
        System.out.println("before each");
    }
    @AfterAll
    public static void setUpAfter() {
        System.out.println("After all");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("After eacH");
    }
    @ParameterizedTest
    @DisplayName("Проверка суммирования")
    @CsvSource({"1,1,2","0,0,0", "-2,3,1"})
    void summ(int a, int b, int expectedSum) {
        Calc calc = new Calc();
        int sum = calc.summ(a, b);
        Assertions.assertEquals (expectedSum, sum,"не тот ответ");

    }

    @ParameterizedTest
    @DisplayName("Проверка вычитания")
    @CsvSource({"5,2,3", "0,0,0", "-2,5,-7"})
    void difference (int a, int b, int expectedDifference) {
        Calc calc = new Calc();
        int result = calc.difference(a,b);
        Assertions.assertEquals (expectedDifference, result,"не тот ответ");
    }
}