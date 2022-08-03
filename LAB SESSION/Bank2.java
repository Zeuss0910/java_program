/**
Author:Mohammed Ashwath
Title:java program to get the user credit,debit and account balance information
Question:How to get the bank credit,debit and account balance information?
**/

import java.util.Scanner;
class Account
{
static int balance = 8257; //static variable is declared as it does not need to be called by method

void balance() // a method is created for checking balance
{
if (balance >0) // if the balance is greater then 0 then the balance amount will be printed
{
System.out.println("your current balance is "+balance);
  }
}

int credit(int amount) // integer method is used as the amount is passed through it for calculating credit
{
int cred = balance+amount; // after crediting the amount is increased from the balance amount
System.out.println("Balance after credited:"+cred);
return cred;
}
int debit (int amount)//integer method is used as the amount is passed through it for calculating debit
{
int deb = balance-amount; // after debiting the amount is decreased from the balance amount
System.out.println("Balance after debited:"+deb) ;
return deb;
 }
}
public class Bank2 //a separate class is created for using main method and the public class it can be first accessed by the compiler
{
public static void main (String [] args)
{

Scanner s= new Scanner (System.in); // Scanner is used to get the desired amount from the user
System.out.println("enter your amount");

int amount = s.nextInt ();// the user is stored in amount variable amount

Account a = new Account();//an object is created for accessing the non static methods of account class 

//using object a the non static methods are called 
a.balance();
a.credit(amount);
a.debit (amount) ;
 }
}
