/**
Author:Mohammed Ashwath
Title:java program to get the user credit,debit and account balance information
Question:How to get the bank credit,debit and account balance information?
**/

import java.util.*;
class Bank
{
static int balance=8257;
public static void main (String[]args)
{
Scanner sc = new Scanner(System.in); 
System.out.println("Select any one opinion to proceed:1,2,3");
System.out.println("To get the balance amount press 1");
System.out.println("To get the credit amount press 2");
System.out.println("To get the debit amount press 3");

int number= sc.nextInt();
int Credit=balance;
int Debit=balance;
switch(number)
{
		
case 1:
System.out.println("Current Balance :" + balance);
break;
        
case 2:
System.out.println("Enter your amount :");
int i = sc.nextInt();
balance=balance+i;
System.out.println("Credited : "+balance);
break;
			
case 3:
System.out.println("Enter your amount :");
int deb = sc.nextInt();
balance=balance-deb;
System.out.println("debited : " +balance);
break;
}
}      
}