/*Question 3

A bank intends to design a program to display the denomination of an input amount, upto 5 digits. The available denomination with the bank are of rupees 1000, 500, 100, 50, 20, 10 ,5, 2 and 1.

Design a program to accept the amount from the user and display the break-up in descending order of denominations. (i,e preference should be given to the highest denomination available) along with the total number of notes. [Note: only the denomination used should be displayed]. Also print the amount in words according to the digits.

Example 1:

INPUT: 14836

OUTPUT: ONE FOUR EIGHT THREE SIX
DENOMINATION:
1000 X 14 =14000
500 X 1 =500
100 X 3 =300
50 X 1 =50
5 X 1 =5
1 X 1 =1

EXAMPLE 2:

INPUT: 235001
OUTPUT: INVALID AMOUNT
*/
 
/*Algorithm

Step-1: Enter the amount in n
Step-2: Store the basic denominations (1000, 500, 100, 50, 20, 10, 5, 2, 1)  in an array
Step-3: Run a loop to access the array
Step-4: Divide the amount n by each value in the array to get the quotient 
Step-5: If the quotient is not zero, display the denomination and update amount.
Step-6: To display the denomination digits in words, create an array and store the digits in 
 words
Step-7: Now run a while loop to reverse the original number.
Step-8: Run another loop and extract each digit of the reversed number.
Step-9: Print each digit in words using the array just created.
Step-10: End
*/

 
//Solution
import java.util.*;

class Question3{
public static void main(String args[])throws InputMismatchException{
Scanner scan=new Scanner(System.in);
int amt;
System.out.print("Enter a five-digit amount : ");
amt=scan.nextInt();
    if(amt>99999)
    {
    System.out.println("INVALID AMOUNT.");
    }else{
    int a[]={1000,500,100,50,20,10,5,2,1};
    int i,p,r,b,t;
    p=amt;
    for(i=0;i<a.length;i++){
        t=amt/a[i];
        if(t!=0){
        System.out.println(a[i]+"X"+t+"="+(t*a[i]));
        amt=amt%a[i];
        }
}

        String ones[]={"one","two","three","four","five","six","seven","eight","nine"};

        r=0;
        while(p>0){
        r=r*10+p%10;
        p/=10;
        }

        while(r>0){
        b=r%10;
        System.out.print(ones[b-1].toUpperCase()+" ");
        r/=10;
        }

    }//end of if
}//end of main
}//end of class
