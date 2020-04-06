package week02HomeworkBooleanConditionalsLoops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /* 5.	Create a new class called Loops. In the main method of this class, create the following loops with any variables you feel are needed:
		 *a.	A while loop that prints all even numbers from 0 to 100
		 *b.	A while loop that prints every 3rd number going backwards from 100 until we reach 0
		 *c.	A for loop that prints every other number from 1 to 100
		 *d.	A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		 */
		
		int evenNumber = 0;
				
		while ( evenNumber < 100 ) {
				
			if (evenNumber % 2 == 0);
			System.out.println(evenNumber);
			evenNumber=evenNumber+2;

       								}

		int oddNumber = 100;
		
		while ( oddNumber > 0) {
			
			System.out.println(oddNumber);
			oddNumber=oddNumber-3;

								}
		
	
	for (int count = 1; count < 100; count+=2) 
		{
		  System.out.println(count);
		} 
		//for (int everyOtherNumber = 1; everyOtherNumber <= 100; everyOtherNumber+=2);
		//{
		//System.out.println(everyOtherNumber);
		
		//}	
	
	for (int number = 1; number <= 100; number++ ) {
		
		if (number % 3 == 0) { 
			
			System.out.println("?Hello?");
								}
	    if (number % 5 == 0 ) {
			
	    	System.out.println("?World?");
	    						}
			if ((number % 3 == 0) && (number % 5 == 0)) {
			
				System.out.println("Hello World!");
														}
			else {
				System.out.println(number);
			}
	    }	
		
	}

}
