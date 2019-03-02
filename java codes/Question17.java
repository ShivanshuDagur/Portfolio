/*
Question 17

Write a program to enter a sentence and sort it in alphabetical order. You can convert the sentence in either uppercase or lowercase before sorting.

Example – 
INPUT:
Enter a sentence: Every cloud has a silver lining.
OUTPUT:
a cloud every has lining silver 
Algorithm

Step-1: Enter a sentence
Step-2: Convert it into lowercase
Step-3: Take the length of the string
Step-4: Run a loop to access the string
Step-5: Extract a character
Step-6: If character is blank space or a period, extract the word
	and store it in an array
Step-7: Continue the process until all the words are stored in the array
Step-8: Now run two loops i and j for sorting
Step-9: Compare the strings in the array
Step-10: If ith string is greater than jth string swap them
Step-11: Continue the process till the entire array is sorted in ascending order
Step-12: Run a loop and display array elements with a blank space.
Step-13: End
*/
 
//Solution

import java.io.*;

public class Question17 {
public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a string : ");
String str = br.readLine();

str=str.toLowerCase();
int l=str.length();
String a[]=new String[l];

int i,j,p=0,x=0;

for(i=0;i<l;i++){
    char ch=str.charAt(i);
    if(ch==' ' || ch=='.'){    //Extract the word when a space or period is found
        String temp=str.substring(p,i);
        a[x++]=temp;    //store the word in a string array
        p=i+1;
    }
}

//Sort the array alphabetically
for(i=0;i<x;i++){   // limit is x since array a[] has x elements
    for(j=i+1;j<x;j++){
        if(a[i].compareTo(a[j])>0){	//Comparing strings
            String temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
System.out.println("Sentence in alphabetical order: ");
for(i=0;i<x;i++)
    System.out.print(a[i]+" ");

}//end of main
}//end of class
