/**
Author:Mohammed Ashwath
Title:ArithmeticOperator 
Question:Java Program to Implement Arithmetic Operation?
**/

import java.util.Scanner;
public class ArithmeticOperator
{
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("ENTER ANY TWO NUMBERS: ");

int num1 = sc.nextInt();
int num2 = sc.nextInt();

int add = num1 + num2;
int sub = num1 - num2;
int div = num1/num2;
int mul=  num1 * num2;
int mod = num1 % num2;

System.out.println("ADDITION OF TWO NUMBERS:"+add);
System.out.println("SUBSTRACTION OF TWO NUMBERS:"+sub);
System.out.println("DIVISION OF TWO NUMBERS:"+div);
System.out.println("MULTIPLICATION OF TWO NUMBERS:"+mul);
System.out.println ("MODULO OF TWO NUMBERS :"+mod);
  }
 }