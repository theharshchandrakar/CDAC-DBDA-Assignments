package com.assignment.assignment6.OperateNumbers;

import java.util.Arrays;
import java.util.List;

public class LambdaCalculator {

    public static void operateOnNumbers(Function func, List<Integer> numbers) {
        for (int number : numbers) {
            int result = func.apply(number);
            System.out.println("Input: " + number + " -> Result: " + result);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //-----------------------------------------------------

        System.out.println("   1. Calculate Square of Numbers   ");

        Function square = n -> n * n;
        operateOnNumbers(square, numbers);

        //-----------------------------------------------------

        System.out.println("\n   2. Calculate Factorial of Numbers   ");

        // Lambda expression to calculate the factorial of a number
        Function factorial = n -> {
            if (n < 0) return -1; 
            if (n == 0) return 1;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        operateOnNumbers(factorial, Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        //-----------------------------------------------------

        System.out.println("\n   3. Find Nearest Even Number   ");

        // Lambda expression to find the nearest even number using a ternary operator
        Function nearestEven = n -> (n % 2 == 0) ? n : n + 1;
        operateOnNumbers(nearestEven, numbers);
    }
}