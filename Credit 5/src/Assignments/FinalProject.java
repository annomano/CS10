/*

Program: Final Project.java          Date: 5/19/2022




Author: Steven On 
School: CHHS
Course: Computer Science 10
 

*/
package Assignments;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FinalProject 
{
// Currency conversion system
	public static void main(String[] args) 
	{
		double rupee,dollar,pound,code,euro,cnd;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the currency code:");
        System.out.println("1: Rupees");
        System.out.println("2: US Dollar");
        System.out.println("3: Pound");
        System.out.println("4: Euro");
        System.out.println("5: Canadian Dollar");
        code=sc.nextInt();
        if(code == 1)
        {
            System.out.println("Please enter amount in rupees:");
            rupee = sc.nextFloat();
            dollar = rupee / 77.76;
            System.out.println("Dollar : "+f.format(dollar));
            pound = rupee / 96.02;
            System.out.println("Pound : "+f.format(pound));
            euro = rupee / 84;
            System.out.println("Euro : "+f.format(euro));
            cnd = rupee / 58;
            System.out.println("Canadian Dollar : "+f.format(cnd));
        }
        else if (code == 2)
        {
            System.out.println("Please enter amount in US dollar:");
            dollar = sc.nextFloat();
            rupee = dollar * 77.76;
            System.out.println("Rupees : "+f.format(rupee));
            pound = dollar * 0.81;
            System.out.println("Pound : "+f.format(pound));
            euro = dollar * 0.95;
            System.out.println("Euro : "+f.format(euro));
            cnd = dollar * 1.25;
            System.out.println("Canadian Dollar : "+f.format(cnd));
        }
        else if(code == 3)
        {
            System.out.println("Please enter amount in Pound:");
            pound = sc.nextFloat();
            rupee = pound * 96.02;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = pound * 0.81;
            System.out.println("Us Dollar : "+f.format(dollar));
            euro = pound * 1.18;
            System.out.println("Euro : "+f.format(euro));
            cnd = pound * 1.59;
            System.out.println("Canadian Dollar : "+f.format(cnd));
        }
        else if(code == 4)
        {
            System.out.println("Please enter amount in Euro:");
            euro = sc.nextFloat();
            rupee = euro * 84;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = euro * 0.95;
            System.out.println("US Dollar : "+f.format(dollar));
            pound = euro * 1.18;
            System.out.println("Pound : "+f.format(pound));
            cnd = euro * 1.35;
            System.out.println("Canadian Dollar : "+f.format(cnd));
        }
        else if(code == 5)
        {
            System.out.println("Please enter amount in Canadian Dollar:");
            cnd = sc.nextFloat();
            rupee = cnd * 58;
            System.out.println("Rupees : "+f.format(rupee));
            dollar = cnd * 1.25;
            System.out.println("Dollar : "+f.format(dollar));
            pound = cnd * 1.59;
            System.out.println("Pound : "+f.format(pound));
            euro = cnd * 1.35;
            System.out.println("Euro : "+f.format(euro));
        }
        else
            System.out.println("Invalid Code!");
		
		
	}

}
/*
 Please enter the currency code
1: Rupees
2: US Dollar
3: Pound
4: Euro
5: Canadian Dollar

2

Enter amount in US dollar:

1

Rupees : 77.76
Pound : 0.81
Euro : 0.95
Canadian Dollar : 1.25 
 
 ** If enter wrong currency code**
 
 Invalid Code!
 
 
 
 
 
 */
