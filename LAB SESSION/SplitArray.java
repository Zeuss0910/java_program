/**
Author:Mohammed Ashwath
Title:Array first half average and Second half average
Question: Using array find the first half average and second half average?
**/

import java.util.*;
public class SplitArray
{
public static void main (String[]args)
{
int[]Arr ={10,20,30,40,40,30,20,10}; //Initializing array
int mid =Arr.length/2; // array length is stored in len variable
System.out.println("Mid value" +mid);
int sum=0;
int avg=0;
for(int i=0;i<mid;i++)
{	
sum +=Arr[i];
}
avg = sum/mid;
System.out.println("First Half Avg"+avg);
int ssum =0;
int savg =0;
for(int i=mid; i<Arr.length;i++)
{
	ssum += Arr[i];
}
 savg = ssum/mid;
System.out.println("second Half Avg"+avg);  

 }
}