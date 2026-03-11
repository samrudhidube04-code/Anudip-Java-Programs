/* 2.Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat. ● TheAnimal class should have a method called makeSound(), which simply prints "The animal makes a sound." ● TheDogandCatclasses should override this method to print "TheCat/The dog meows/barks" respectively. ● Theprogram should allow the user to create and display objects of each class. [Hint:Use multilevel inheritance]  */

package javaProgram;

import java.util.Scanner;

// Superclass
class Animal4 {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass 1 (Level 1)
class Dog3 extends Animal4 {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2 (Level 2 - Multilevel Inheritance)
class Cat extends Dog3 {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main Class
public class Animal3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Animal");
        System.out.println("2. Dog");
        System.out.println("3. Cat");

        int choice = sc.nextInt();

        Animal4 a;  // Parent class reference (Corrected)

        switch (choice) {

            case 1:
                a = new Animal4();
                a.makeSound();
                break;

            case 2:
                a = new Dog3();
                a.makeSound();
                break;

            case 3:
                a = new Cat();
                a.makeSound();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

/* Output: Choose an option:
1. Animal
2. Dog
3. Cat
*/