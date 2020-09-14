import java.util.Scanner;

/**
* A program to say hello to a user and calculate their approximate age
* @author Gavin Sandhar
*/
public class Main {

 /**
  * The method that is executed when you hit the run button.
  * @param args the command line arguments
  */
 public static void main(String[] args) {
   // Creates a Scanner used for input
   Scanner input = new Scanner(System.in);

   // declare a variable that will store a name
   String name;

   // ask the user for their name
   System.out.println("Please enter your name:");
   // initialize the name variable with Steve
   name = input.nextLine();
   // Say hello to the user
   System.out.println("Hello " + name + "!");
  
   // declare and initialize a constant to store the current year
   final int CURRENT_YEAR= 2020;
   // Ask the user for the year they were born
   System.out.println("Please enter the year you were born:");
   // declare and initialize a variable to store the year they were born
   int birthYear = input.nextInt();

   // declare and calculate their age
   int age = CURRENT_YEAR - birthYear;
   // Tell the user their age
   System.out.println("You are " + age + " years old.");

 }
}