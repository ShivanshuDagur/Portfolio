/*
Question 13

Write a program to enter a string and print each word along with the number of vowels in it.

Example – 

INPUT:
Enter a string: These are wonderful times

OUTPUT:

Word		Vowel
These		   2
are		   2
wonderful	   3
times		   2



 
Algorithm

Step-1: Enter a string
Step-2: Find the length of the string
Step-3: Run a loop to access the string
Step-4: Extract a character from the string
Step-5: If it is not blank goto step 11
Step-6: Extract the word from the string
Step-7: Run a loop to access the word
Step-8: Check for vowels
Step-9: If vowel found, increment a counter
Step-10: Once the inner loop terminates display the word and the counter
Step-11: Keep checking the rest of the string until the end
Step-12: End
*/
 
//Solution

import java.io.*;
class Question13
{
public static void main(String fh[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence : ");
String str=br.readLine();
str+=" ";
int l=str.length();
String t=" ";
int i,j,c=0,p=0;
for(i=0;i<l;i++)
{
char ch=str.charAt(i);
if(ch==' ')
{
t=str.substring(p,i+1);
    c=0;
    for(j=0;j<t.length();j++)
    {
       char k=t.charAt(j);
       if(k=='a'||k=='e'|| k=='i' || k=='o'||k=='u' || k=='A' || k=='E' || k=='I' || k=='O' || k=='U')
         c++;
    }
 System.out.println(t+"\t"+c);
    p=i+1;
   }

    }

}//end of main
}//end of class
