/*

Program: Assignment15.java          Date: 5/5/2022




Author: Steven On 
School: CHHS
Course: Computer Science 10
 

*/
package Assignments;
import java.util.Random;
import java.util.Scanner;
public class Assignment15 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
		
		String operatorSwitch;
        int b;
        int c = 0;

        Random number = new Random();
        int d = number.nextInt(50) +1;
        int e = number.nextInt(50) +1;

        Random operatorChoice = new Random();
        int operator = operatorChoice.nextInt(4);

        switch (operator){

            case 0: operatorSwitch= "+";
                c = d+e;
                break;
            case 1: operatorSwitch= "-";
                c = d-e;
                break;
            case 2: operatorSwitch= "*";
                c = d*e;
                break;
            case 3: operatorSwitch= "/";
                c = d/e;
                break;
            default: operatorSwitch= "";
        }
        System.out.println("What is: "+d+operatorSwitch+e+"?");
        b = userinput.nextInt();
        
        if (b == c)
        {
        	System.out.println("Correct!" +c);
        
        }
        else if (b!=c)
        {
        	System.out.println("Wrong. The Correct answer is:" +c);
        }
		
		
		
		
		
		
	}

}


/*Screen Dump:
 
 
 
 What is: 23*25?  575
 Correct! 575
 
 or 
 
What is: 23*25?  2341
Wrong. The Correct answer is: 575

/* Screen Dump

What is: 2*39?
78
Right answer78

n
 
 */


 