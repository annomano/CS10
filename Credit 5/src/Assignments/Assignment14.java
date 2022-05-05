/*

Program: Assignment14.java          Date: 5/5/2022




Author: Steven On 
School: CHHS
Course: Computer Science 10
 

*/
package Assignments;

import java.util.Scanner;

public class Assignment14 
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a age:");
		int userAge = userInput .nextInt();
		
		if (userAge < 6)
		{
			System.out.println("You are a: Toddler");
		}
		else if ((userAge > 5)&&(userAge < 11)) 
		{
			System.out.println("You are a: Child");
		}
		else if ((userAge > 10)&&(userAge < 13)) 
		{
			System.out.println("You are a: Pre Teen");
		}
		else if ((userAge > 12)&&(userAge < 19)) 
		{
			System.out.println("You are a: Teenager");
		}
		else 
		{
			System.out.println("You are a: adult");
		}
			
			
			
			
			
	}

}

/* Screen Dump:
 
 Please Enter an Age: 12
 
 You are a: Pre-teen
 
 
*/
 