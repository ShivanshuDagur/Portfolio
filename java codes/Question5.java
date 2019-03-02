/*Question 5

A smith number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1). 
The first few such numbers are 4, 22, 27, 58, 85, 94, 121.....

Example 1. 

666 Prime factors are 2, 3, 3 and 37
Sum of the digits are (6+6+6) = 18
Sum of the digits of the factors (2+3+3+(3+7) = 18

Write a program to input a number and check whether it is a smith number or not.

Sample data:
Input:	 94 		Output: SMITH Number
Input:	 102 		Output: NOT SMITH Number
*/

 /*
Algorithm

Step-1: Input n
Step-2: Run a while loop to find the sum of digits of n
Step-3: Now run a for loop from 2 to the number
Step-4: Look for the factors of n
Step-5: If a factor is found, run a while loop to store its sum of digits
Step-6: Update the number by dividing it with the factor
Step-7: Decrement the loop counter so that the same factor is checked again
Step-8: Outside the loop compare if the two sums are equal or not
Step-9: If they are equal display “Smith number” else display “Not Smith number”
Step-10: End */
//Solution

import java.util.*;
class Question5{
public static void main(String sr[])throws InputMismatchException{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int n=sc.nextInt();
int p,q,i,sod=0,sopf=0,t;
p=q=n;
//Find the sum of all the digits of the number
while(p>0){
sod+=p%10;
p/=10;
}

for(i=2;i<=q;i++){
if(q%i==0){	//check if ‘i’ is a factor
t=i;
while(t>0){		//find the sum of the digits of the factor
sopf+=t%10;
t/=10;
}
q=q/i;
i--;	//decrement the factor so that next time the same factor is checked again and again until it is not a factor. This is the prime factorization method.
}
}
if(sod==sopf)	// if sum of digits and sum of prime factors are equal, it is smith number
System.out.println("Smith number");
else
System.out.println("Not Smith number");

}//end of main
}//end of class
