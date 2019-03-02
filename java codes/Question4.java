/*Question 4

Given the two positive integers p and q, where p < q. Write a program to determine how many kaprekar numbers are there in the range between 'p' and 'q'(both inclusive) and output them.About 'kaprekar' number:

A positive whole number 'n' that has 'd' number of digits is squared and split into 2 pieces, a right hand piece that has 'd' digits and a left hand piece that has remaining 'd' or 'd-1' digits. If sum of the pieces is equal to the number then it's a kaprekar number.

SAMPLE DATA:

INPUT:
p=1
Q=1000

OUTPUT:

THE KAPREKAR NUMBERS ARE:
1,9,45,55,99,297,999

FREQUENCY OF KAPREKAR NUMBERS IS:8*/

 
/*Algorithm

Step-1: Enter the limits
Step-2: Run a loop using the entered limits
Step-3: For each number in the range, count the number of digits(d) in it
Step-4: Find the square of the number
Step-5: Now, divide the square in two parts
Step-6: To do this, first store 10 raised to the power d in t
Step-7: For first part, calculate square mod t
Step-8: For second part, calculate square/t
Step-9: Now add the two parts
Step-10: If the sum is equal to the original number then it is a kaprekar number, print it and 
  count it.
Step-11: If the sum is not equal to the original number it is not a kaprekar number
Step-12: Continue the process till all the numbers in the range are checked
Step-13: Display the frequency of kaprekar numbers.
Step-14: End

*/

//Solution
import java.util.*;

class Question4{
public static void main(String args[])throws InputMismatchException{

Scanner scan=new Scanner(System.in);

System.out.println("Enter the range : ");
int p=scan.nextInt();
int q=scan.nextInt();

int d,i,n,a,b,s,freq;
freq=0;		// to find the frequency of kaprekar numbers

System.out.println("The Kaprekar numbers are : ");

for(i=p;i<=q;i++)
{
n=i;
d=0;		//to store the number of digits

//count the number of digits in the number
while(n>0){
d++;
n/=10;
}

s=i*i;		// find the square of the number

//extract 'd' digits from the right of the square of the number
a=s%(int)Math.pow(10,d);

//extract 'd' or 'd-1' digits from the left of the square of the number
b=s/(int)Math.pow(10,d);

//Check if the two parts add up to the original numberi.e. Condition for Kaprekar number
if(a+b==i){
System.out.print(i+" ");
freq++;
}
}

System.out.println("\nFREQUENCY OF KAPREKAR NUMBER IS : "+freq);
}//end of main
}//end of class
