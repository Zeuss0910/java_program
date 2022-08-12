/**
Author:Mohammed Ashwath
Title:Inheritance
Question:How to display saving account without changing the current account using inheritance
**/

class Bank_Account    
{
void disp()  //parent class method
{
System.out.println(" *******Bank Account Details******** ");
}
}
class Current_Account extends Bank_Account  // child class Current_Account  is extended from parent class
{

int balance  = 1000;

void check_balance()  // method for the child class Current_Account
{
System.out.println("Current Account for Business purpose ");  
System.out.println("Your balance amount in cuurent Account is  "+balance);  // the  current account class will display the current balance of the current account
}
}

class Saving_Account extends Bank_Account   //child class Saving_Account  is extended from parent class
{ 

int  disp_details(String name , int age , String gender  , int limit )  // method for the child class Saving_Account
{
// this method will displays the individual details who has a Saving_Account

System.out.println("Saving Account  for Individual purpose ");  
System.out.println(" NAME : "+name);
System.out.println(" AGE  : "+age);
System.out.println(" GENDER  : "+gender);
System.out.println(" OVERDRAFT LIMIT : "+limit);

return 0; // as we used "int" return type to method we need to return something , here there is nothing to return so return  0 is given
}

}
public class Inheritance//  Main class
{
public static void main (String [] args)
{
Saving_Account s = new Saving_Account();   // an object is created for the child class  savings_account

s.disp(); // using the child class object we can access the parent class methods so parent class methid disp() is called 

System.out.println("Account type : Saving Account"); 

s.disp_details("Mohammed Ashwath" ,  24 , "Male" , 5000); // passing the details to the method disp_details to print the details of the employee having Savings accaount

System.out.println();  // this println is to give a extra  line or gap while displaying the savings the current account

 Current_Account c = new  Current_Account(); // an object is created for the child class  current_account

System.out.println("Account type : Current Account");
c.check_balance(); // using the object the method of the current class is called

}
}

//NOTE : In Inheritance , two child classes are extended from one parent so we should create an object 
         //  for both the child classes to access the methods of the parent class as well as child class


