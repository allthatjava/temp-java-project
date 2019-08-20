package brian.temp.java.project;

public class FizzBuzz {

	public static void fizzBuzz(int count) {
		
		for(int i = 1; i <= count; i++) {
			
			boolean mulpliedBy3Or5 = false;
			
			// Multiply of 3 print "Fizz" instead of number
			if ( i % 3 == 0 )
			{
				System.out.print("Fizz");
				mulpliedBy3Or5 = true;
			}
			
			// multiply of 5 pint "Buzz" instead of number
			if( i % 5 == 0 ) { 
				System.out.print("Buzz");
				mulpliedBy3Or5 = true;
			}
			
			// Multiply of 3 and 5 print "FizzBuzz" instead of number1
			if( mulpliedBy3Or5 )
				System.out.println("");
			else
				System.out.println(""+i);
		}
	}
}
