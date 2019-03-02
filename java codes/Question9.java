/*Question 9

Write a program to enter a number and check if it is a magic number or not. 
A number whose sum of digits ultimately yields 1 is known as a Magic number.

Example:
n = 109
109	= 9+0+1
	=10 (Still a number, find the sum again)
10	=0+1
	=1
The result is 1. Hence, 109 is a magic number.

n=18
18	=8+1
	=9
The result is 9, which is not equal to 1, hence 18 is not a magic number.

Input:		n=109
Output:	109 is a magic number

Input:		n=18
Output:	18 is not a magic number. */

 /*
Algorithm

Step-1: Input a number n
Step-2: Copy the number in p
Step-3: Run a loop as long as p is not equal to zero
Step-4: Run another loop to find the sum of digits of p
Step-5: Outside the loop check if sum is greater than 9
Step-6: If it is greater than 9 it means it’s a number, copy it in p and reset the sum
Step-7: The loop will run until p becomes 0
Step-8: If the sum is equal to 1, display “Magic number” else “Not a magic number”
Step-9:End
*/

//Solution

import java.util.*;
public class Question9 {
public static void main(String args[])throws InputMismatchException{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int n=sc.nextInt();
int s=0,p,a;
p=n;

do{
    while(p>0){
        a=p%10;
        s=s+a;
        p=p/10;
    }
    if(s>9){
        p=s;
        s=0;
    }
}while(p>0);
if(s==1)
    System.out.println(n+" is a magic number");
else
    System.out.println(n+" is not a magic number");

}//end of main
}//end of class
