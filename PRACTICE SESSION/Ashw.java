/**
Author:Mohammed Ashwath
Title:Using "this" keyword
Question:How to use the object using this keyword
**/


public class Ashw{
	int i;	
	Ashw(int i)
	{		//System.out.println(i);
		this.i=i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ashw obj= new Ashw(10);		
		System.out.println("Values are "+obj.i);
		
	}

}