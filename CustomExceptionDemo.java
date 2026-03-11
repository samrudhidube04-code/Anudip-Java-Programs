// 2.Create program for Custom Exception. 

package javaProgram;

//Custom Exception Class
class InvalidAgeException extends Exception {

 // Constructor
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class CustomExceptionDemo {


	    // Method to check age
	    static void checkAge(int age) throws InvalidAgeException {
	        if (age < 18) {
	            // Throw custom exception
	            throw new InvalidAgeException("Age must be 18 or above.");
	        } else {
	            System.out.println("You are eligible to vote.");
	        }
	    }

	    public static void main(String[] args) {

	        try {
	            checkAge(16);  // Change value to test
	        } catch (InvalidAgeException e) {
	            System.out.println("Custom Exception Caught: " + e.getMessage());
	        }

	        System.out.println("Program continues...");
	    }
	}


/* Output: Custom Exception Caught: Age must be 18 or above.
Program continues...
*/