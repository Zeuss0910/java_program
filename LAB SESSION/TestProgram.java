import java.util.Scanner;

public class TestProgram{
public static void main (String [] args)
{
int number ;
int Value1, Value2 , result;

Scanner sc = new Scanner(System.in);

System.out.println("Choose a number : 1 - addition , 2 - substraction , 3 - multiplication , 4 - division");
number = sc.nextInt();

System.out.println("enter first value: ");
Value1 =sc.nextInt();

System.out.println("enter second value: ");
Value2 =sc.nextInt();

switch(number)
{
case 1 :
result = Value1 + Value2;
System.out.println("Addition of two numbers : "+result);
break;
case  2 :
result = Value1 - Value2;
System.out.println("substraction of two number : " +result);
break;
case 3:
result = Value1 * Value2;
System.out.println("multiplication of two numbers : " +result);
break;
case 4:
result = Value1 / Value2;
System.out.println("division of two number : "+result);
break;

default :

System.out.println("number is invalid guve number given in the choice");
break;
}
}
}