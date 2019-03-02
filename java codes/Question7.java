/*Question 7

Write a program to create an array of n integers and display the frequency of each element of the array.

Example:

Input:
Enter the number of terms: 10
Enter 10 integers: 1 2 2 2 3 4 3 4 5 6 

Output:
Frequency of 1: 1
Frequency of 2: 3
Frequency of 3: 2
Frequency of 4: 2
Frequency of 5: 1
Frequency of 6: 1
*/





/*
Algorithm

Step-1: Input the size of the array as n
Step-2: Create an array of n elements
Step-3: Run a loop i from 0 to n
Step-4: Run a loop j from i+1 to n
Step-5: If the elements a[i] and a[j] are equal and a[j] is not zero, count and put zero in a[j]
Step-6: Outside the inner loop, print frequency of a[i] if it is not zero
Step-7: End
*/

 
//Solution
import java.util.*;

class Question7{
public static void main(String args[])throws InputMismatchException{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms: ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter "+n+ " integers");
int i;
for(i=0;i<n;i++)
a[i]=sc.nextInt();

int j,f;
for(i=0;i<n;i++)
{
    f=1;
    for(j=i+1;j<n;j++)
    {
        if(a[i]==a[j] && a[j]!=0)
            {
                f++;
                a[j]=0;
            }
    }
    if(a[i]!=0)
    System.out.println("Frequency of "+a[i]+" : "+f);
}

}//end of main
}//end of class
