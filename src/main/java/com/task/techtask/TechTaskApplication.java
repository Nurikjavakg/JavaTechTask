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
        return countCombinations(0, 0, n);
    }

    private static int countCombinations(int open, int close, int max) {
        if (open == max && close == max) {
            return 1;
        }

        int count = 0;

        if (open < max) {
            count += countCombinations(open + 1, close, max);
        }

        if (close < open) {
            count += countCombinations(open, close + 1, max);
        }

        return count;
    }
}