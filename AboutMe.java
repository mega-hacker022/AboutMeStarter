/*
 * Programmer: Meghan Dasilva
 * Date: 9/23/2020
 * Purpose: to print a brief description about me, including my age and height now, and my height five years later.
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
    	String myName = "Meghan";
    	int myAge = 16;
    	double myHeightInMetres = 1.62;

        // Print the values
        System.out.println("Hi, my name is " + myName + ".");
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        myAge = 21;
        myHeightInMetres = 1.64;

        // Print the new values
        System.out.println("Some time passes...");
        System.out.println("I am now " + myAge + " years old.");
        System.out.println("I have grown and am " + myHeightInMetres + " m tall.");
    }
}