/*

Program: Assignment11.java          Date: 5/10/2022



Author: Steven On 
School: CHHS
Course: Computer Science 10
 

*/
package Assignments;

import java.util.Scanner;

public class Assignment12 
{

	public static void main(String[] args)  
	{

		Scanner userInput = new Scanner(System.in);
			System.out.println("Please enter a Grade Percentage:");
			int grade = userInput.nextInt();
			if (grade >= 90) 
			{
				System.out.println("The corresponding grade letter is: A+");
			} 
			
		       else if ((grade < 89)&&(grade > 80))
		    {
				System.out.println("The corresponding grade letter is: A");
			}
		       else if ((grade < 79)&&(grade > 75))	
		   {
		    	System.out.println("The corresponding grade letter is: B+");		
		   }
		       else if ((grade < 74)&&(grade > 70))
		       {
		           System.out.println("The corresponding grade letter is: B ");
		       }
		       else if ((grade < 69)&&(grade > 65))
		       {
		           System.out.println("The corresponding grade letter is: C+ ");
		       }
		       else if ((grade < 64)&&(grade > 60))
		       {
		           System.out.println("The corresponding grade letter is: C ");
		       }
		       else if ((grade < 59)&&(grade > 55))
		       {
		           System.out.println("The corresponding grade letter is: D+ ");
		       }
		       else if ((grade < 54)&&(grade > 51))
		       {
		           System.out.println("The corresponding grade letter is: D ");
		       }
		       else if (grade < 50)
		       {
		           System.out.println("The corresponding grade letter is: F ");
		       }  
			
			// Used Switch since you can't do : else if ((grade =< 89)
			
			switch (grade) {
			case 89:
				System.out.println("The corresponding grade letter is: A");
				break;
			case 80:
				System.out.println("The corresponding grade letter is: A");
				break;
			case 79:
				System.out.println("The corresponding grade letter is: B+");
				break;
			case 75:
				System.out.println("The corresponding grade letter is: B+");
				break;
			case 74:
				System.out.println("The corresponding grade letter is: B");
				break;
			case 70:
				System.out.println("The corresponding grade letter is: B");
				break;	
			case 69:
				System.out.println("The corresponding grade letter is: C+");
				break;	
			case 65:
				System.out.println("The corresponding grade letter is: C+");
				break;	
			case 64:
				System.out.println("The corresponding grade letter is: C");
				break;	
			case 60:
				System.out.println("The corresponding grade letter is: C");
				break;
			case 59:
				System.out.println("The corresponding grade letter is: D+");
				break;	
			case 55:
				System.out.println("The corresponding grade letter is: D+");
				break;
			case 54:
				System.out.println("The corresponding grade letter is: D");
				break;	
			case 51:
				System.out.println("The corresponding grade letter is: D");
				break;
			case 50:
				System.out.println("The corresponding grade letter is: F");
				break;			
			}
				
				
		}

  }	    
			
/* Screen Dump:


Enter a grade percentage: 75
The corresponding letter grade is: B+



 */			
			
			

	


