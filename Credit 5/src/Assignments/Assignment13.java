/*

Program: Assignment13.java          Date: 5/10/2022



Author: Steven On 
School: CHHS
Course: Computer Science 10
 

*/
package Assignments;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please Enter the Number of Copies to be Printed:");
		int copies = userInput.nextInt();
		if ((copies > 0)&&(copies < 100))
		{
		 System.out.println("Price Per Copies: $0.30");
		 System.out.println("Total Cost is:" + (copies * 0.30));  
		}
		else if ((copies > 99)&&(copies < 500))
		{
			 System.out.println("Price Per Copies: $0.28");
			 System.out.println("Total Cost is:" + (copies * 0.28));  
			}
		else if ((copies > 499)&&(copies < 750))
		{
			 System.out.println("Price Per Copies: $0.27");
			 System.out.println("Total Cost is:" + (copies * 0.27));  
			}
		else if ((copies > 749)&&(copies < 1001))
		{
			 System.out.println("Price Per Copies: $0.26");
			 System.out.println("Total Cost is:" + (copies * 0.26));  
			}
		else if (copies > 1000)
		{
			 System.out.println("Price Per Copies: $0.25");
			 System.out.println("Total Cost is:" + (copies * 0.25));  
			}
	}

}

/* Screen Dump:
 
 
 
Enter the number of copies to be printed: 1001

Price per copy is: $0.25

Total cost is: $250.25
 
 

*/
 