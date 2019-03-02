/*
Question 15

Write a program to enter a string and print the frequency of each word in a string.
Example – 
Input:
Enter a string: The need for enlightenment is the need of the hour.
Output:
Word		        Frequency
The			 3
need			2
for			1
enlightenment		1
is			1
of			1
hour			1
 
Algorithm

Step-1: Enter a string
Step-2: Find the length of the string
Step-3: Create a string array
Step-4: Run a loop ‘i’ to access the string
Step-5: Extract word from the string and store it in the string array
Step-6: Continue the process until all the words are stored in the array
Step-7: Now run a loop to access the array
Step-8: Set f=1
Step-9: Run another loop to check equality of elements of the array
Step-10: If equal, increment f by 1 and shift all the elements to the left
	  by one place and decrease the size of the array
Step-11: Display the element along with its frequency f
Step-12: Repeat the process for all the elements of the array
Step-13: End
*/
 
//Solution

import java.io.*;
class Question15
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a String");
String s=br.readLine();
s=s+" ";
int i,t=0,p=0,f=0,j,k;
int l=s.length();
String a[]=new String[l];
String b;

for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
 b= s.substring(p,i);
a[t]=b;
t++;
p=i+1;
}
}










for(i=0;i<t;i++)
{
f=1;
for(j=i+1;j<t;j++)
{
if(a[i].equals(a[j]))
{
f++;
for(k=j;k<t-1;k++)
{
a[k]=a[k+1];
}

t--;
j--;
}
}
System.out.println("Frequency of " + a[i] + " : " + f);
}

}//end of main
}//end of class
 
