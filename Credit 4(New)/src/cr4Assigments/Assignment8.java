package cr4Assigments;
/*

Program: Assignment8.java          Date: 4/27/2022


Author: Steven On 
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment8 
{
	public static void main(String[] args) 
	{
	     Scanner userinput = new Scanner(System.in);
	       System.out.println("Enter three digits: ");
	       int digit = userinput.nextInt();
	       int first = digit / 100;
	       int second = (digit / 10) %10;
	       int third = digit % 10;
	       System.out.println("The hundreds place digit is: " +first);
	       System.out.println("The tens place digit is: " +second);
	       System.out.println("The ones place digit is: " +third);
		
	}

}

/* Screen Dump

Enter three digits: 
385
The hundreds place digit is: 3
The tens place digit is: 8
The ones place digit is: 5

 
 */