/*
Question 10

Write a program to create an array of n elements and insert a given element at the given position in the array. Your program should display appropriate error message if the position is invalid.
Example – 

INPUT:
Size of the array: 5
Input 5 integers: 1 2 4 5 6
Enter the element to be inserted: 3
Enter the position at which the element should be inserted: 3

OUTPUT:
1 2 3 4 5 6

INPUT:
Size of the array: 7
Input 5 integers: 4 3 5 8 6 2 7
Enter the element to be inserted: 13
Enter the position at which the element should be inserted: 10

OUTPUT:
Invalid position entered. */

 
/*
Algorithm

Step-1: Enter the size in n
Step-2: Create an array of size (n+1)
Step-3: Enter n elements from the user
Step-4: Enter the element(e) and the position(p)
Step-5: Run a loop i to access array
Step-6: Check if the position is invalid by comparing it with i+1
Step-7: If match not found keep checking with the rest of the array
Step-8: If match found run a loop from n to p and shift all the elements one place to the right,
	store the element e in the desired position, raise a flag and break out of loop
Step-9: Outside the loop, check if the flag is raised
Step-10: If it is display the modified array else display error message
Step-11: End
*/
 
//Solution

import java.util.*;

public class Question10{
public static void main(String args[])throws InputMismatchException{
Scanner sc=new Scanner(System.in);
int i,j,k;

System.out.println("Enter the size of the array: ");
int n=sc.nextInt();

int a[]=new int[n+1];
System.out.println("Enter "+n+" integers:");
for(i=0;i<n;i++){
    a[i]=sc.nextInt();
}
System.out.println("Enter the element to be inserted: ");
int e=sc.nextInt();
System.out.println("Enter the position: ");
int p=sc.nextInt();

boolean flag=false;

for(i=0;i<n;i++){
if(i+1==p){
    for(j=n;j>i;j--){
        a[j]=a[j-1];
    }
    a[i]=e;
    flag=true;
    n++;
    break;
}
}
if(flag){
    for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
}else{
        System.out.print("Position Invalid");
}

}//end of main
}//end of class
