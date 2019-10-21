//HEADER
//Program Name: Chapter 3 Exercise 1-3
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 10/19/2019
//Description: A program which converts degrees in Celcius to Farenheit.



import java.util.Scanner;


public class ExercisesTwoOfFour {

	public static void main(String[] args) {
		
		//Convert Celcius to Farenheit
		
		double celcius, farenheit;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter degrees C ");
		celcius = input.nextDouble();
		farenheit = ((celcius * (9/5)) + 32);
		System.out.printf("Temp in degrees F " + farenheit);
			
		
		
		
		
	}

}

/*
 * Footer
 * Exercise 1:
 * Please enter degrees C 20
   Temp in degrees F 52.0
 */


