//HEADER
//Program Name: Chapter 3 Exercise 3 
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 10/19/2019
//Description: A program which changes seconds into hours, minutes and remaining seconds.

import java.util.Scanner;

public class ExerciseThreeOfFour {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
        int seconds;
        int minutes ;
        int hours;
        System.out.print("Please Enter the Number of Seconds: ");
        seconds = input.nextInt();
        hours = seconds / 3600;
        minutes = (seconds%3600)/60;
        int LeftOverSeconds = (seconds% 3600)%60;


        
        System.out.printf(seconds + " Seconds "+ " = "  + " hours: "  +  hours  + " minutes: " +  minutes + " seconds: " + LeftOverSeconds); 
    }
		
		
		
		
	}

/*Footer
 * Please Enter the Number of Seconds: 9874
9874 Seconds  =  hours: 2 minutes: 44 seconds: 34

 */
