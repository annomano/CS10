package cr4Assigments;
/*

Program: Assignment9.java          Date: 5/3/2022


Author: Steven On 
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment9 
{

	public static void main(String[] args) 
	{
	     Scanner userinput = new Scanner(System.in);
	       System.out.println("Enter an Integer: ");
	       int integer1 = userinput.nextInt();
	       
	       System.out.println("Enter a second integer: ");
	    
	       int integer2 = userinput.nextInt();
	    
	       int answer1 = (integer1 / integer2);
	       
	       int answer2 =(integer1 % integer2);
	       
	       int answer3 =(integer2 / integer1);
	       
	       int answer4 =(integer2 % integer1);
	      
	       System.out.print(integer1);
	       System.out.print(" / ");
	       System.out.print(integer2);
	       System.out.print(" = ");
	       System.out.println(answer1);
	       
	       System.out.print(integer1);
	       System.out.print(" % ");
	       System.out.print(integer2);
	       System.out.print(" = ");
	       System.out.println(answer2);
	       
	       System.out.print(integer2);
	       System.out.print(" / ");
	       System.out.print(integer1);
	       System.out.print(" = ");
	       System.out.println(answer3);
	       
	       System.out.print(integer2);
	       System.out.print(" % ");
	       System.out.print(integer1);
	       System.out.print(" = ");
	       System.out.println(answer4);
     
		
	}

}

/* Screen Dump

Enter an integer: 
14
Enter a second integer: 
4

14 / 4 = 3
14 % 4 = 2
4 / 14 = 0
4 % 14 = 4

 
 */
