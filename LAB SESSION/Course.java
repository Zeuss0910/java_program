/**
Author:Mohammed Ashwath
Title:Synchronization
Question:Write a java program using synchronization and extend the thread 
**/



class Anudip extends Thread{
	
synchronized void test1() {
for(int i=0;i<5;i++) {
System.out.println(i);
}
}
synchronized void test2() {
for(int i=5;i<10;i++) {
System.out.println(i);
}
}	
}

class Java extends Thread{
Anudip obj;
	
Java(Anudip obj)
{
this.obj=obj;
}	
@Override
public void run() {
// TODO Auto-generated method stub
obj.test1();
}
}

class Students extends Thread{
Anudip obj1;
Students(Anudip obj1)
{
this.obj1=obj1;
}
@Override
public void run() {
// TODO Auto-generated method stub
obj1.test2();
}
}

public class Course {	

public static void main(String[] args) {
// TODO Auto-generated method stub
Anudip obj = new Anudip();			
Java obj1 = new Java(obj);
Students obj2 = new Students(obj);			
obj1.start();
obj2.start();	
}

}