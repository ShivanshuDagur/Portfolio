/*Question:
Write a program to input a natural number less than 1000 and display it in words.

Test your program on the sample data and some random data.

Example – 

INPUT: 29
OUTPUT: TWENTY NINE

INPUT: 17001
OUTPUT: OUT OF RANGE

INPUT: 119
OUTPUT: ONE HUNDRED AND NINETEEN

INPUT: 500
OUTPUT: FIVE HUNDRED */
 
/*
Algorithm

Step-1: INPUT n
Step-2: IF n>=1000 THEN exit 
Step-3: Create three string arrays ones[], teens[] and tens[] and store ones, teens and 
  tens in words. 
Step-4: IF n>=100 AND n<1000 THEN GOTO Step 5 ELSE GOTO Step 12
Step-5: set a = n/100
Step-6: store ones[a-1] + “hundred”  in result
Step-7: update n as n/100
Step-8: IF n mod 10 = 0 AND n<>0 THEN GOTO Step 9 ELSE GOTO Step 11
Step-9: set a=n/10
Step-10: IF result = NULL THEN set result= tens[n-1] 
	   ELSE set result= result +” and “+tens[a-1] 
Step-11: set n as n mod 10
Step-12: IF n>20 AND n<100 THEN GOTO Step 13 ELSE GOTO Step 16
Step-13: set a as n/10
Step-14: set b as n mod 10
Step-15: IF result = NULL THEN set result as tens[a-1]+” “+tens[b-1] 
             ELSE set result as result+” and “+tens[a-1]+” and “+tens[b-1]
Step-16: IF n>10 AND n<20 THEN GOTO Step 17 ELSE GOTO Step 19
Step-17: set a as n mod 10
Step-18: IF result = NULL THEN set result as teens[a-1] 
	  ELSE set result as result+” and “+teens[a-1]
Step-19: IF n<10 AND n<>0 THEN GOTO Step 20 ELSE GOTO Step 21
Step-20: IF result=NULL THEN set result as ones[n-1] 
	  ELSE set result as result+ “ and “ +ones[n-1]
Step-21: DISPLAY result
Step-20: END */

import java.util.*;

class Question1{
public static void main(String args[])
throws InputMismatchException{

Scanner scan=new Scanner(System.in);

int n;

System.out.println("Enter a number less than 1000");
n=scan.nextInt();

if(n>=1000)
{
System.out.println("OUT OF RANGE");
}else{
String result,h="",t="",o="";
int a,b,c;
String ones[]={"one", "two","three","four","five",
"six","seven","eight","nine"};
String teens[]={"eleven","twelve","thirteen","fourteen",
"fifteen","sixteen","seventeen","eighteen","nineteen"};
String tens[]={"ten","twenty","thirty","forty","fifty",
"sixty","seventy","eighty","ninety"};

        if(n>=100 && n<1000){
             a=n/100;
            result=ones[a-1]+" hundred";
            n=n%100;
        }
        if(n%10==0 && n!=0){
        a=n/10;
        if(result!=null){
        result+=" and ";
        result+=tens[a-1];
        }

else{
            result=tens[a-1];
        }
        n=n%10;
    }
        if(n>20 && n<100){
        a=n/10;
        b=n%10;
        if(result!=null){
        result+=" and ";
        result+=tens[a-1]+" "+ones[b-1];
        }else{
        result=tens[a-1]+" "+ones[b-1];
        }
    }
        if(n>10 && n<20){
        a=n%10;
       if(result!=null){
        result+=" and ";
        result+=teens[a-1];
        }else{
        result=teens[a-1];
        }
    }
        if(n<10 && n!=0){

        if(result!=null)
        {
            result+=" and ";
            result+=ones[n-1];
        }else{
            result=ones[n-1];
        }

System.out.println("\n"+result.toUpperCase());

}

}//end of main
}//end of class
