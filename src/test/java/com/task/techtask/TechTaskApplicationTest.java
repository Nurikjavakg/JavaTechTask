package com.task.techtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TechTaskApplicationTest {

    @Test
    void testCountWellFormedParenthesis_n1() {
        assertEquals(1, TechTaskApplication.countWellFormedParenthesis(1));
    }

    @Test
    void testCountWellFormedParenthesis_n2() {
        assertEquals(2, TechTaskApplication.countWellFormedParenthesis(2));
    }

    @Test
    void testCountWellFormedParenthesis_n3() {
        assertEquals(5, TechTaskApplication.countWellFormedParenthesis(3));
    }

    @Test
    void testCountWellFormedParenthesis_n4() {
        assertEquals(14, TechTaskApplication.countWellFormedParenthesis(4));
    }

    @Test
    void testCountWellFormedParenthesis_n5() {
        assertEquals(42, TechTaskApplication.countWellFormedParenthesis(5));
    }

    @Test
    void testCountWellFormedParenthesis_n6() {
        assertEquals(132, TechTaskApplication.countWellFormedParenthesis(6));
    }

    @Test
    void testPerformance() {
        long start = System.currentTimeMillis();
        int result = TechTaskApplication.countWellFormedParenthesis(15);
        long end = System.currentTimeMillis();

        System.out.println("Result for n=15: " + result);
        System.out.println("Execution time: " + (end - start) + " ms");

        assertEquals(9694845, result);
    }
}