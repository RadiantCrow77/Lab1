//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team < Kathy Moss
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class week01 {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
int planeSeats =20;
		
		// 2. Create a variable to hold the cost of groceries at checkout
double groceryCost= 111.77;
		
		// 3. Create a variable to hold a person's middle initial
char midInitial = 'H';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
boolean isHot = true;
		
		// 5. Create a variable to hold a customer's first name
String firstName = "Jack";
		
		// 6. Create a variable to hold a street address
String address = "1010 Cherenkov Cove";

		// 7. Print all variables to the console
System.out.println("The # of plane seats is: "+planeSeats+"\n");
System.out.println("Grocery Cost: $ "+groceryCost+"\n");
System.out.println("Middle Initial: "+midInitial+"\n");	
System.out.println("Is the weather hot outside? "+isHot+"\n");
System.out.println("First name is "+firstName+"\n");
System.out.println("Address: "+address+"\n");	






		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
planeSeats = (planeSeats-2);
System.out.println("The # of plane seats is now: "+planeSeats+"\n");	


		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
groceryCost = (groceryCost+2.15);
System.out.println("The result of our impulse buy: $ "+groceryCost+" :( \n");	


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
midInitial = 'K';
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
isHot = false;
System.out.println("The weather changed. Is it still hot outside? "+isHot+"\n");	

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
String lastName = "SpaghettiandMeatballs";
String fullName = (firstName+" "+midInitial+". "+lastName);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
System.out.println("Welcome to Chilli's, "+fullName+", "+"is "+address+" still the correct address? Thank you.");

		
		
	}
}