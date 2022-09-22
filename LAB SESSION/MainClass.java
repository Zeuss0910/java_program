import java.util.Date; // importing date package to get the current date

public class MainClass 
{
public static void main (String [] args) 
{
//three threads are created to display three times
Thread t1= new Thread((new MainClass().new  MyCurrentDate())); 
		
	
//t1.start executed the run() method
t1.start();
}
class MyCurrentDate implements Runnable  
{
//an object is created for date class
Date d = new Date();
//run methods is triggered when we use start() method
public void run()    {    
//for loop is used to print the thread for three times
for(int i=1;i<=3;i++)   {    
//thread.sleep() is used to make the thread wait for 100 miliseconds using try catch nblock
try  
{  
System.out.println("Date :"+d);
Thread.sleep(1000);  
}
catch(InterruptedException e) {System.out.println(e); }
}
}	 }
}