/*Question 6

A unique-digit integer is a positive integer (without leading zeros) with no duplicate digits.
For example 7, 135, 214 are all unique-digit integers whereas 33, 3121, 300 are not.
Given two positive integers m and n, where m< n, write a program to determine how many unique-digit integers are there in the range between m and n (both inclusive) and output them.

The input contains two positive integers m and n. Assume m< 30000 and n< 30000.

You are to output the number of unique-digit integers in the specified range along with their values in the format specified below:

SAMPLE DATA:

INPUT: m = 100 n = 120 
OUTPUT: THE UNIQUE- DIGIT INTEGERS ARE : 102, 103, 104, 105, 106, 107, 108, 109, 120.
FREQUENCY OF UNIQUE-DIGIT INTEGERS IS: 9. */

 
/*Algorithm

Step-1: Input the limits m and n
Step-2: Run a loop from m to n
Step-3: For each value of the loop, extract its digits
Step-4: Store the digits in an array
Step-5: Set flag as true
Step-6: Run a two loops till the length of the array
Step-7: If the array values of the two loops match, set the flag to false and break the loops
Step-8: If the flag is true display the number and count
Step-9: Outside the loop display the count as frequency of unique-digit numbers
Step-10:End */
 
//solution
import java.util.*;
class Question6{
public static void main(String ar[])throws InputMismatchException{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range: ");
int m=sc.nextInt();
int n=sc.nextInt();
int a[]=new int[10];
int i,j,k,p,x,freq=0;
boolean flag;
System.out.println("Unique-Digit numbers are:");
for(i=m;i<=n;i++){
p=i;
x=0;
while(p>0){
a[x++]=p%10;
p/=10;
}
flag=true;






for(j=0;j<x;j++){
for(k=j+1;k<x;k++){
if(a[j]==a[k]){
flag=false;
j=x;
break;
}
}
}
if(flag){
System.out.print(i+" ");
freq++;
}
}
System.out.println("\nFrequenct of Unique-digit numbers: "+freq);
}//end of main
}//end of class







