package cr4Assigments;
/*

Program: Assignment1.java          Date: 4/27/2022


Author: Steven On 
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;
public class Assignment7 
{

	public static void main(String[] args) 
	{
	       Scanner userinput = new Scanner(System.in);
	        
	       System.out.println("Enter your change: ");
	       
	       int change = userinput.nextInt();
	       
	       int quarters = change / 25;
	       
	       int dimes = ((change % 25) / 10);
	       
	       int nickels = (((change % 25)%10)/ 5);
	       
	       System.out.println("The change you provided is: " + change);
	       
	       System.out.println("Quarters: " + quarters);
	       
	       System.out.println("Dimes: " + dimes);
	       
	       System.out.println("Nickels: " + nickels);


	}

}

/* Screen Dump

Enter your change: 
212
The change you provided is: 212
Quarters: 8
Dimes: 1
Nickels: 0

 
 */
