//1.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.

package javaProgram;

import java.util.ArrayList;

public class SumOfEvenNumbers {

	public static void main(String[] args) {

        // Creating ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        int sum = 0;

        // Loop through ArrayList
        for (int num : numbers) {
            if (num % 2 == 0) {   // Check if number is even
                sum += num;      // Add to sum
            }
        }

        // Print result
        System.out.println("Sum of even numbers: " + sum);
    }
}

// Output: Sum of even numbers: 60