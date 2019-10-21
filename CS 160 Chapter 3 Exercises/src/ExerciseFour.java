//HEADER
//Program Name: Chapter 3 Exercise 1-3
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 10/19/2019
//Description: A program which prompts the user to guess a random number.

import java.util.Random;
import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {  
       
        
		Scanner scan =	new Scanner(System.in);
		
		//Receive input from user
        System.out.println("I'm thinking of a number between 1 and 100, (including both), Can you guess what it is?");
        System.out.println("Type a number: ");
        int Yournumber = scan.nextInt();
        System.out.println("Your guess is: " + Yournumber);       
        
           // Generate a random number
        Random random = new Random();
        int Generatednumber = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " + Generatednumber);   
        
        //What's the difference?
          System.out.println("You were off by: " + Math.abs(Yournumber - Generatednumber));        
        
	       
	}

}

/*Footer
 * I'm thinking of a number between 1 and 100, (including both), Can you guess what it is?
Type a number: 
48
Your guess is: 48
The number I was thinking of is: 100
You were off by: 52
*/



