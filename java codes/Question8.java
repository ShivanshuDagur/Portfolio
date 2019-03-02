/*Question 8

Write a program to create an array of n integers and sort the array in ascending order using Insertion sort technique.

Example – 

INPUT:
 Enter the size of the array: 5
Enter 5 elements: 5  9  7  3  -4

OUTPUT:
-4  3  5  7  9
*/
 /*
Algorithm

Step-1: Input the size of the array n
Step-2: Create an array a[] and enter n integers in it.
Step-3: Now to apply insertion sort on this array, run a loop ‘i’ from 1 to n
Step-4: Store the element a[i] in k
Step-5: Run a reverse loop ‘j’ from i-1 till j>=0 and k<a[j]
Step-6: Copy all the elements one position to their right
Step-7: Once the inner loop terminates copy k in a[j+1]
Step-8: Close the loop
Step-9: Display the elements in sorted order using a loop
Step-10:End

*/
 
//Solution


import java.util.*;

class Question8 {
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

for(i=1;i<n;i++){
    k=a[i];
    for(j=i-1;j>=0 && k<a[j];j--){	 //Shift the elements to the right until the condition is false
        a[j+1]=a[j];
    }
    a[j+1]=k;				//Store the element in the proper position of the array
}

System.out.println("Array in ascending order: ");

for(i=0;i<n;i++){
    System.out.print(a[i]+" ");
}
}
}
