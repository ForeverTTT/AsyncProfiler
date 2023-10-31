package org.example;

public class PerformanceExample {
    public static void main(String[] args) {
        long result = performHeavyComputation(1000000000);
       // long result = performOptimizedComputation(100000000);
        System.out.println("Result: " + result);
    }

    public static long performHeavyComputation(int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long performOptimizedComputation(int n) {
        return (long) n * (n - 1) / 2;
    }
}

// other possibilities: Binary Exponentiation vs iteration, merge sort vs bubble sort