/*Question 2

Encryption is a technique of coding messages to maintain their secrecy. A String array of size 'n' where 'n' is greater than 1 and less than 10, stores single sentences (each sentence ends with a full stop) in each row of the array.

Write a program to accept the size of the array.

Display an appropriate message if the size is not satisfying the given condition.

Define a string array of the inputted size and fill it with sentences row-wise. 

Change the sentence of the odd rows with an encryption of two characters ahead of the original character. Also change the sentence of the even rows by storing the sentence in reverse order.

Display the encrypted sentences as per the sample data given below.

Test your program on the sample data and some random data.

INPUT: n=4

IT IS CLOUDY. IT MAY RAIN. THE WEATHER IS FINE. IT IS COOL.

OUTPUT: KV KU ENQWFA. RAIN MAY IT. VJG YGCVJGT KU HKPG. COOL IS IT.


INPUT: n=13

OUTPUT: INVALID ENTRY */


 /*
Algorithm

Step-1: Store n sentences in an array.
Step-2: Start a loop and add a blank space at the end of each sentence so that the last word can 
be extracted.
Step-3: If the sentence is on the odd row GOTO Step 4 else GOTO Step 8
Step-4: Run a loop and extract each character of the sentence one by one
Step-5: If the character is not a blank or a sentence terminator add 2 to its ASCII value
Step-6: If the result exceeds 90 subtract 26 from it.
Step-7: Add the changed character to a temporary string and GOTO Step 
Step-8: store the last index of the sentence in p
Step-9: Run a reverse loop
Step-10: When a blank space is found extract the word from position+1 to p
Step-11: Store the word with a space in a temporary string
Step-12: Keep on updating p to point to the last character of previous word until all the words 
  are extracted
Step-13: Display the temporary string
Step-14: End*/

 
//Solution
import java.io.*;
class Question2{
public static void main(String args[])
throws IOException{
BufferedReader br=new BufferedReader(
new InputStreamReader(System.in));

int nos;
System.out.print("Enter number of sentences : ");
nos=Integer.parseInt(br.readLine());

if(nos<1 || nos>=10)
System.out.println("\nInvalid Entry");
else{
     int i,j,p,l;
    String s[]=new String[nos];

    System.out.print("\nEnter "+nos+" sentences : ");

    for(i=0;i< nos;i++)
    s[i]=(br.readLine()).toUpperCase();

    for(i=0;i< nos;i++)
    {

        String t;
        s[i]=" "+s[i];// add a blank space before each sentence 
       l=s[i].length();

        if(i%2==0){
        t="";
        for(j=0;j< l;j++){

// store the ASCII code of the character
            int ch=s[i].charAt(j);
            if(ch!=32 && ch!='.'){
                ch=ch+2;//shift the letter two spaces
                if(ch>90)//to maintain cyclic order
                ch=ch-26;// subtract 26
              }
//convert to character and add to a temporary string
              t=t+(char)ch;
        }

        s[i]=t.trim();// remove leading or trailing spaces
    }else{
        t="";
        p=l-1;
        for(j=l-1;j>=0;j--){ 
//reverse loop to start extraction of words 
//from last to first
        char ch=s[i].charAt(j);
        if(ch==' '){
        t=t+s[i].substring(j+1,p)+" "; 
// add the extracted word and a space
        p=j;

        }
    }
    t=t+"."; 
    s[i]=t;
    }

    }
    System.out.println("\nOUTPUT:");
    for(i=0;i< nos;i++)
    System.out.print(s[i]);
  }

}//end of main
}//end of class
