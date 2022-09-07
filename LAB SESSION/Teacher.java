 /**
Author:Mohammed Ashwath
Title:Synchronization
Question:Write a java program using synchronization and extend the thread  by using both synchronizedand non synchronized
**/
 
 
 
class Student{
void method1() {
Thread t1 = Thread.currentThread();
for(int i=0;i<500;i++) {
System.out.println("S method1 : "+ i +", "+t1.getName());
}
}
	
void method2() {
Thread t1 = Thread.currentThread();
for(int i=0;i<500;i++) {
System.out.println("S method2 : "+ i+", "+t1.getName());
}
}
synchronized void method3() {
Thread t1 = Thread.currentThread();
for(int i=0;i<1000;i++) {
System.out.println("S method3 : "+ i+", "+t1.getName());
}
}
	
synchronized void method4() {
Thread t1 = Thread.currentThread();
for(int i=0;i<1000;i++) {
System.out.println("S method4 : "+ i+", "+t1.getName());
}
}
void method5() {
Thread t1 = Thread.currentThread();
for(int i=0;i<500;i++) {
System.out.println("S method5 : "+ i+", "+t1.getName());
}
}
	
synchronized void method6() {
Thread t1 = Thread.currentThread();
for(int i=0;i<1000;i++) {
System.out.println("S method6 : "+ i+", "+t1.getName());
}
}
	
	
}
class Thread6 extends Thread{
Student obj;
	
Thread6(Student obj)
{
this.obj=obj;
}
	
@Override
public void run() {
// TODO Auto-generated method stub
obj.method3();
}
	
}
class Thread7 extends Thread{
Student obj;
Thread7(Student obj)
{
this.obj=obj;
}
	
@Override
public void run() {
// TODO Auto-generated method stub
obj.method5();
}
	
}
public class Teacher {

public static void main(String[] args) {
// TODO Auto-generated method stub
		
Student obj = new Student();
Student obj1 = new Student();
		
Thread6 obj2 = new Thread6(obj);
		
Thread7 obj3 = new Thread7(obj);
		
obj2.start();
obj3.start();
		

}

}