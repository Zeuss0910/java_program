/**
Author:Mohammed Ashwath
Title:Comparitive Operator
Question:Using if,else Statement
**/

import java.util.Scanner;
public class ComparitiveOperator
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("ENTER ANY TWO NUMBERS : ");

int A= sc.nextInt(); // getting input A from user
int B= sc.nextInt();// getting input B from user

if (A!=B)//to proceed only if A and B is not equal
{
if (A>B)//to check whether A greater than B
{
System.out.println("the greater number is " +A); // if yes A> B then print this statment
System.out.println("the lesser number is " +B); // it A is greater then next number will be lesser number
}
else//if A is not greater than B then else part is executed
{
System.out.println("the greater number is "+B);// prints B is greater
System.out.println("the lesser number is "+A);//and A is lesser
 }
}
else //this else is for the frst it condition if A and B are equal then else part will be printed directly
{
System.out.println("both the numbers are same"); 
     }
	}
   }
