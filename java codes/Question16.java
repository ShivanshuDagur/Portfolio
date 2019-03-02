/*Question 16

Write a program to enter a sentence and print it in ascending order of its word lengths.
A sentence may either terminate with a   period (.), exclamation mark (!)  or a question mark (?). 
Example – 
INPUT:
Enter a sentence: Days are longer in summers.
OUTPUT:
in are days longer summers.



Algorithm

Step-1: Enter a string
Step-2: Find the length of the string
Step-3: Create a string array
Step-4: Run a loop ‘i’ to access the string
Step-5: Extract word from the string and store it in the string array
Step-6: Continue the process until all the words are stored in the array
Step-7: Now run a loop to access the array
Step-8: Run two loops for sorting, say i and j
Step-9: If length of the ith element is greater than the length of the jth element swap them. 
Step-10: Continue the process till the entire array is sorted
Step-11: Display the words in the array along with a blank space
Step-12: End
*/
 
//Solution

import java.io.*;
class Question16
{
public static void main (String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader (System.in));

System.out.print("enter the string");
String s = br.readLine();
s=s.toLowerCase();
int l= s.length();
String a[]= new String[l];
int t=0,i,p,j;
String g;
char k;
p=0;

for(i=0;i<l;i++)
{
k=s.charAt(i);
if(k==' ' || k== '.' || k==’!’ || k==’?’)// Check for delimiters to extract words
{
String b = s.substring(p,i);
a[t]= b;		//Store the words in an array
t++;
p=i+1;
}
}


//Using bubble sort to arrange the string array in ascending order of word length
for(i=0;i<t;i++)
{
for(j=0;j<t-i-1;j++)
{
if(a[j].length()>a[j+1].length())	//if the word on the left is smaller in length, swap it.
{
g=a[j];
a[j]=a[j+1];
a[j+1]=g;
}
}
}

for(i=0;i<t;i++)
{
System.out.print(a[i]+” “);	//print the words with a blank space
}
System.out.print(".");		//display period to make it a sentence

}//end of main
}//end of class







