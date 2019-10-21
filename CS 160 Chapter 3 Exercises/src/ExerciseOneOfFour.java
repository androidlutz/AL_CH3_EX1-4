
public class ExerciseOneOfFour {

	public static void main(String[] args) {
		
		//Gives the exercise context
		System.out.println(5/3);
		
		//The %f format using integers resulted in the compile error below.
		
		//Using the %f format with doubles
		System.out.printf("Five Divided by Three is: %.2f " , 5.0/3.0 );
		
		
		
		
		
		
	}

}


/*
System.out.println(5/3); 


  The error if an integer is used with the %f format
Five Divided by Three is: Exception in thread "main" java.util.IllegalFormatConversionException: f != java.lang.Integer
at java.util.Formatter$FormatSpecifier.failConversion(Unknown Source)
at java.util.Formatter$FormatSpecifier.printFloat(Unknown Source)
at java.util.Formatter$FormatSpecifier.print(Unknown Source)
at java.util.Formatter.format(Unknown Source)
at java.io.PrintStream.format(Unknown Source)
at java.io.PrintStream.printf(Unknown Source)
at ExerciseOneOfFour.main(ExerciseOneOfFour.java:7)

Five Divided by Three is: 1.67 
*/