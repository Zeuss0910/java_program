/**
Author:Mohammed Ashwath
Title:Constructor using argument and object
Question:To assign Constructor using argument and object
**/

class Student
{
	public int Student_id;
	String Student_Name;
	Student(){
		System.out.println("No -args Students cons");
	}
	Student(int Student_id){
		System.out.println("1 -args Students cons = "+ Student_id);
	}
	Student(int Student_id,String Student_Name){
		this.Student_id=Student_id;
		System.out.println("2 -args Students cons = "+Student_id+", "+Student_Name);
	}
	public static void main(String[] args) 
	{
		
		Student Student_Object = new Student();
		Student Student_Object1 = new Student(100);
		Student Student_Object2 = new Student(40,"Anudip");
		
		System.out.println("From main Student_id "+Student_Object2.Student_id);
		
		Batch Batch_Object = new Batch();
		Batch Batch_Object1 = new Batch(100);
		Batch Batch_Object2 = new Batch(40,"java");
		Batch Batch_Object3 = new Batch(40,".net","Running");
		
	}

}	
		
class Batch 
{
	int Batch_id; 
	String Batch_name;
	String Batch_Status;	
	Batch(){
		System.out.println("From Batch No-args Constructer");
	}
	Batch(int Batch_id){
		System.out.println("From Batch 1 - args Constructer");
	}
	Batch(int Batch_id,String Batch_name){
		System.out.println("From Batch 2-args Constructer");
	}
	Batch(int Batch_id,String Batch_name,String Batch_Status)
	{
		System.out.println("From Batch 3-args Constructer "+Batch_id+", "+Batch_name+", "+Batch_Status);
	}
	
}
public class Con3 
{
	
	public static void main(String[] args) 
	{
		
		Student Student_Object = new Student();
		Student Student_Object1 = new Student(100);
		Student Student_Object2 = new Student(40,"Anudip");
		
		System.out.println("From main Student_id "+Student_Object2.Student_id);
		
		Batch Batch_Object = new Batch();
		Batch Batch_Object1 = new Batch(100);
		Batch Batch_Object2 = new Batch(40,"java");
		Batch Batch_Object3 = new Batch(40,".net","Running");
		
	}

}