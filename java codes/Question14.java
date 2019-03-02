/*
Question 14

Write a program to enter a string and remove consecutively repeating characters from a string.
Example – 
Input:
Enter a string: The freedom of expression is immensely overused.
Output:
The fredom of expresion is imensely overused.



 
Algorithm

Step-1: Enter a string
Step-2: Find the length of the string
Step-3: Copy the string to a character array
Step-4: Run a loop ‘i’ to access the array
Step-5: Compare ith and (i+1)th element of the array
Step-6: If both the elements are not equal goto step 9
Step-7: Run a loop from i to the end
Step-8: Shift all the characters one place to the left
Step-9: Decrease the length of the array
Step-10: Keep checking the rest of the string until the end
Step-11: Set original string to null
Step-12: Run a loop and add all the elements of the array to the string
Step-13: Display the string
Step-14: End
*/
 
//Solution

import java.io.*;
public class Question14{
public static void main(String fh[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string : ");
String str = br.readLine();
char a[]=str.toCharArray();

int i,j,l=a.length;

for(i=0;i<l-1;i++){
    if(a[i]==a[i+1]){
        for(j=i;j<l-1;j++){
            a[j]=a[j+1];
        }
        l--;
        i--;
    }
}
str="";
for(i=0;i<l;i++){
    str+=a[i];
}
System.out.println("The modified string is: "+str);

}//end of main
}//end of class
