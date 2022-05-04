/*

Program: Assignment13.java          Date: 5/5/2022




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
		System.out.println("Please Enter an Age:");
		int userAge = userInput .nextInt();
	//Determines what stage of life the user is at based on age
		if (userAge < 6)
		{
			System.out.println("You are a: Toddler");
		}
		else if ((userAge >5)&&(userAge < 11))
		{
			System.out.println("You are a: Child");
		}
		else if ((userAge >10)&&(userAge < 13))
		{
			System.out.println("You are a: Pre-teen");
		}
		else if ((userAge >12)&&(userAge < 19))
		{
			System.out.println("You are a: Teenager");
		}
		else (userAge > 18)
		{
			System.out.println("You are a: Adult");
		}
		
		
	}

}

/* Screen Dump:
 
 Please Enter an Age: 12
 
 You are a: Pre-teen
 
 
*/
 