/**
Author:Mohammed Ashwath
**/


public class Demo {
	
	int i;
	Demo()
	{
		this(false,101,"Raja");
		System.out.println("No-arg cons ");
		
	}
	Demo(String name)
	{
		
		System.out.println("1-arg cons " + name);
	}
	Demo(int id ,String name)
	{
		this("Venket");
		System.out.println("2-arg cons " + name +", "+id);
	}
	Demo(boolean isAdmin,int id ,String name)
	{
		this(01,"kamal");
		System.out.println("3-arg cons " + name +", "+id+", "+isAdmin);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj = new Demo();
		/*Demo obj1 = new Demo("Raja");
		Demo obj2 = new Demo(001,"Dinesh");
		Demo obj3 = new Demo(true,001,"Dinesh");*/
		
		method1();
	}
	
	
	public static void method1()
	{
		System.out.println("From method 1");
		//method2(10);
	}
	
	public  void method2(int i)
	{
		
		this.i=i;
		System.out.println("From method 2");
	}


}