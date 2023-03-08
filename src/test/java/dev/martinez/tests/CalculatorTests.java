package dev.martinez.tests;

import dev.martinez.app.AwesomeCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    void testAdd(){
        double result = AwesomeCalculator.add(2,2);
        Assertions.assertEquals(4, result);
    }

    @Test
    void testAddNegNums(){
        double result = AwesomeCalculator.add(-5,-5);
        Assertions.assertEquals(-10, result);
    }

    @Test
    void get_environ_variable(){
        System.out.println(System.getenv("GREETING"));
    }
}
