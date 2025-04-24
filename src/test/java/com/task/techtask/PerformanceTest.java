package com.task.techtask;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerformanceTest {

    @Test
    void testPerformance() {
        int n = 15;
        long expectedMaxTimeNano = 1_000_000_000;

        long actualTimeNano = TechTaskApplication.checkPerformance(n);
        System.out.println("Execution time (ns): " + actualTimeNano);

        assertTrue(actualTimeNano <= expectedMaxTimeNano,
                "Execution time exceeds the limit: " + actualTimeNano + " ns");
    }
}