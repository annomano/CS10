package Assignments;
/*

Program: Assignment1.java          Date: 4/14/2022


Author: Steven On 
School: CHHS
Course: Computer Science 10
 

*/
public class assignment4 
{

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
     	double size = 0.0;
     	double cost = 0.0;
 	System.out.println("\nEnter the diameter of the pizza in inches: ");
     	size = sc.nextDouble();
     	cost = ((.05 * size * size) + 1 + .75);
 	System.out.println("The cost of making the pizza is: $" + cost);

	}

}

/* Screen Dump

Enter the diameter of the pizza in inches: 10
The cost of making the pizza is: $6.75

 
 */