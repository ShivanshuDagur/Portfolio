/*
Question 11

Write a program to create an array of n elements and delete a given element from the array. Your program should display appropriate error message if the element to be deleted is not found in the array.

Example – 

Input:
Size of the array: 5
Input 5 integers: 1 2 4 5 6
Enter the element to be deleted: 4

Output:
1 2 5 6

Input:
Size of the array: 7
Input 5 integers: 4 3 5 8 6 2 7
Enter the element to be deleted: 1

Output:
Element not found in the array. 


 
Algorithm

Step-1: Enter the size in n
Step-2: Create an array of size (n+1)
Step-3: Enter n elements from the user
Step-4: Enter the element(e) to be deleted
Step-5: Run a loop i to access array
Step-6: Check if the element(e) is present in the array
Step-7: If match not found goto step 11
Step-8: If match found run a loop from i to n-1
Step-9: Shift all the elements one place to the left
Step-10: decrease the size of loop, raise a flag and break out of loop
Step-11: Keep checking the rest of the array until the end
Step-12: If the flag is raised display the modified array else display error message
Step-13: End
*/
 
//Solution

import java.util.*;

public class Question11{
public static void main(String args[])throws InputMismatchException{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int n=sc.nextInt();
int a[]=new int[n];
int i,j,k;
System.out.println("Enter "+n+" integers:");
for(i=0;i<n;i++){
    a[i]=sc.nextInt();
}
System.out.println("Enter the element to be deleted: ");
int e=sc.nextInt();

boolean flag=false;

for(i=0;i<n;i++){
if(a[i]==e){
    for(j=i;j<n-1;j++){
        a[j]=a[j+1];
    }
    flag=true;
    n--;
    break;
}
}
if(flag){
    for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
}else{
        System.out.print("Element not found");
}

}//end of main
}//end of class

