/* 1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.[Hint: Use array and loop and try to access the element beyond the last index.] */

package javaProgram;

public class ArrayExceptionDemo {

	
	public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Loop goes beyond the last index
        for (int i = 0; i <= arr.length; i++) {  
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
    }
}

/* output: Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at AnudipEx1/javaProgram.ArrayExceptionDemo.main(ArrayExceptionDemo.java:12)  */