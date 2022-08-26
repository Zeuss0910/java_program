/**
Author:Mohammed Ashwath
Title:Interface and Abstract
Question:Write java program to print favorite car details  using abstract and interface 
In Abstract class declare abstract method as Engine_model,Accelerator, Ranges,Break_range,Advanced_Tecnology introced
In Interface class declare all Actions method like Start cars,Running,Stop Cars,Slow,Speed Up
Override all the methods in child class and implements for the reasonable logic.
**/

interface IMachine //created an interface method IMachine
{

//functions inside interface class are declared
 void stop();
 void start();
}
abstract class Car implements IMachine //abstract class Car implements the interface class
{
//the functions of the interface classes are defined by method overriding
public void start()
{
System.out.println("Audi Engine Activated");
}
public void stop()
{
System.out.println("Audi Engine break down" );
}
//method of abstract class
void accelate()
{
System.out.println("Audi's Engine accelate upto 245.59bhp@5000-6000rpm");
}
}
//an extra class is created to create an object to call other functions
class Slow extends Car
{
void slowDown()
{
System.out.println("Low down command is initiated");
}
}
//Main class to execute the above functions
public class Audi 
{
public static void main (String [] args)
{
//creating a object for the class extending abstract class
Slow s = new Slow();
//calling the methods from interface and abstract
s.accelarate();
s.slowDown();
s.stop();
s.start();
}
}
