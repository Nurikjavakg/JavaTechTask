package com.task.techtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechTaskApplication.class, args);

        int n = 6;
        int result = countWellFormedParenthesis(n);
        System.out.println("Правильные скобочные комбинации для n = " + n + " -> " + result);
    }

    public static int countWellFormedParenthesis(int n) {
        return countCombinations(n);
    }

    private static int countCombinations(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) result;
    }

    public static long checkPerformance(int n){
        long start = System.nanoTime();
        countWellFormedParenthesis(n);
        long end = System.nanoTime();
        return end - start;
    }
}