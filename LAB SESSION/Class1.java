/**
Author:Mohammed Ashwath
Title:Abstract using get percentage and constructor
Question:We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B.
Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. 
The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
Create an object for eac of the two classes and print the percentage of marks for both the students.
**/

public class Class1  //main class class1
{
public static void main(String[] args)
{
A ob = new A(65, 70, 75);   //an object for parametrized constructor of class A is created

System.out.println("Student 1 Per: " +ob.getPercentage()); //println statement to get the percentage of student 1 

B obj = new B(80 , 85, 90, 95);  //an object for parametrized constructor of class A is created


System.out.println("Student 2 Per: " +obj.getPercentage()); //println statement to get the percentage of student 1 
}   
}

abstract class Mark. //an abstract class mark is created 

{
abstract float getPercentage(); // abstract method for the abstract class 
}

class A extends Mark  // class A extends the abstract class mark 
{
float sub1 , sub2 , sub3;
float per=0;        
A(float a , float b, float c)// parameterized method of class A
{
//where sub 1,2,3 refers to a,b,c 
sub1 = a;
sub2 = b;
sub3 = c;    
}
@Override
public float getPercentage() //method overriding is done 
{
per = (sub1 + sub2 + sub3 )/300* 100; // calculating the percentage 

return per; //returning the float percentage value as the return type is a float 
}
}


class B extends Mark. // class B extends the abstract class mark 
{
//where sub 1,2,3 refers to a,b,c

float sub1 , sub2 , sub3 , sub4;
float per=0;        //initializing percentage variable by 0

B(float a , float b, float c,float d)
{
sub1 = a;
sub2 = b;
sub3 = c;    
sub4 = d;
}
@Override
public float getPercentage() //method overriding is done 
{
per = (sub1 + sub2 + sub3 + sub4 )/400* 100; 

return per; //returning the float percentage value as the return type is a float 

}
}
