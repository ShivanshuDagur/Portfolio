    /*
Question 12

Write a program to enter a main string and a substring and find the number of times the substring is present in the main string ignoring case considerations. 
Assume that substring is present only as a single word. It is neither found inside the string nor as a group of words.

Example – 

Input:
Enter a main string: The man goes to the theatre.
Enter a substring: the

Output:
No of times substring is present in the main string: 2



 
Algorithm

Step-1: Enter a main string and the substring.
Step-2: Find the length of the main string
Step-3: Run a loop to access the main string
Step-4: Extract a character from the main string
Step-5: If it is not blank goto step 9
Step-6: Extract the word from the main string
Step-7: Compare it with the substring using function to ignore case
Step-8: If the strings are equal increment a counter
Step-9: Keep checking the rest of the string until the end
Step-10: Display the counter along with the message
Step-11: End
*/
 
//Solution

import java.io.*;

public class Question12{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a main string: ");
String ms=br.readLine();

System.out.println("Enter a substring: ");
String ss=br.readLine();

int l=ms.length();
int i,p=0,freq=0;

for(i=0;i<l;i++){
    char ch=ms.charAt(i);
    if(ch==' '){
        String word=ms.substring(p,i);
        if(word.equalsIgnoreCase(ss)){
            freq++;
        }
        p=i+1;
    }
}
System.out.println("No of times substring is present in the main string: "+freq);

}//end of main
}//end of class
