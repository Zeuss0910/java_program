import java.util.Scanner;
public class IncreDecre
{
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any two numbers for A and B : ");

int A = sc.nextInt();
int B = sc.nextInt();

System.out.println("Post Increment of A: "+(A++));
System.out.println("Pre Increment of A: " +(++A));
System.out.println("Post Decrement of B:" +(B--));
System.out.println("Pre Decrement of B :" +(--B));
 }
}