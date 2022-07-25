class Student1
{	
	Student1()
	{
		System.out.println("No-Constructor");
		
	}	
	Student1(int i)
	{
		System.out.println("1 Arg- Constructor " +i );
		
	}
	Student1(int i,String name)
	{
		
		System.out.println("2 Arg- Constructor " +i+"Name "+name);
	}
	Student1(int i,String name,boolean isAdmin)
	{
		System.out.println("3 Arg- Constructor "+i +" Name "+name+", "+isAdmin);
		
	}
	public static void main(String[]args)
	{
		Student1 obj =new Student1();
		Student1 obj1 =new Student1(57);
		Student1 obj2 =new Student1(58,"Anudip");
		Student1 obj3 =new Student1(2000,"kamal",true);
		
		obj.method1();
		obj.method2("sachin",true);
	}	
	static{
	
		System.out.println("from an SIB");
		
	}
	public void method1()
	{
		System.out.println("From Method1");
	}
	public void method2(String s1,boolean b1)
	{
		System.out.println("from method arg-" +s1 + ", "+b1);
	}
}