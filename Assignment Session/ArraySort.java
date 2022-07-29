/**
Author:Mohammed Ashwath
Title:To print the Array value in asending and descending order
Question:How to assign the array values in ascending and descending order?
**/

import java.util.Arrays;
public class ArraySort
{
public static void main (String [] args)//main method
{
int []arr={55,12,35,96,2,40} ;//array declaration

int n=arr.length;// to store the lenghth of the array in variable 'n'
int temp;// temporary variable is used for swapping

for(int i=0;i<n;i++)//frst for loop is for iterating over loop i.e, i indicates the frst element of the array for comparison
{
for( int j=i+1;j<n;j++)//second for loop is for comparison purpose i.e, the j indicates the second element of the array so that i and j can be compared
{
if(arr[i]>arr[j])//while comparing is" i>j"then swapping is done if i is not greater than j then swapping
                 //will not be done for the particular element moves to the next element and starts to compare
{        
temp =arr[i];//in the temporary varibles the i element of arr is stored ie 55- 12 so 55 stored in temp
arr[i]= arr[j];//in arr[i] 12 is stored
arr[i] = temp;//and arr[i] 55 is stored from temp _like wise for the remaining elements
   }
  }
 }
System.out.println ("Array elements in ascending order: "+Arrays.toString(arr));//printing the array elements using Arrays.to String()method

for(int i=0;i<n;i++)//same as above
{
for(int j=i+1;j<n;j++)//same as above
{
if(arr[i]<arr[j])//here if i<j then only swapping occurs for the particular element
{
temp =arr[i];
arr[i]= arr[j];
arr[j] = temp;
  }
 }
}
System.out.println("Array elements in Descending order: "+Arrays.toString(arr));
 }
}


 


