/**
Author:Mohammed Ashwath
Title:SIB with three class
**/

class Student
{
	static int i=100;
	static
	{
		System.out.println("from Student SIB ");
	}
	
	public static void main(String []args)
	{
		System.out.println("From Student Main");
	}		
}
class StudentAddress
{
	static String Streetname="Viveganather theru,dubai";
	static
	{
		System.out.println("StudentAddress SIB");
	}
	
}
class D
{
	//Static initialized block SIB
	static
	{
		//main(null);
		//method1();
		System.out.println("From SIB");
	}
	public static void main(String[]args)
	{
		System.out.println(Student.i);
		
		System.out.println(StudentAddress.Streetname);
		
		System.out.println("From Main Method 1 ");
		
	}
	static
	{   
		System.out.println("From SIB-1");
		//method2();
	}
}