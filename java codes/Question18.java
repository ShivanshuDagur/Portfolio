/*
Question 18

Write a program to print the sum of border elements of an n x n matrix.
Example – 
INPUT:
Enter the number of rows for a square matrix: 3
Enter 9 elements:
1	2	3
4	5	6
7	8	9

OUTPUT:

Sum of the border elements: 40
 

Algorithm

Step-1: Input the number of rows ‘n’ for a square matrix
Step-2: Create an nxn matrix
Step-3: Enter nxn elements from the user
Step-4: Run a loop for the number of rows
Step-5: Run a loop for the number of columns
Step-6: If row is first or last or if column if first or last add the element 
Step-7: Continue the process till the entire matrix is checked
Step-8: Display the sum
Step-9: End

*/
 

//Solution

import java.util.*;
public class Question18 {
public static void main(String args[])throws InputMismatchException{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows for a sqaure matrix: ");
    int n=sc.nextInt();

    int a[][]=new int[n][n];
    int i,j,s=0;

    System.out.println("Enter "+(n*n)+" elements:");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
        a[i][j]=sc.nextInt();
        }
    }
    /* Border of a matrix consists of the first row, first column,
     * last row and last column.
     */
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==0 || j==0 || i==n-1 || j==n-1){
                s=s+a[i][j];
            }
        }
    }
    System.out.println("Sum of border elements: "+s);

}//end of main
}//end of class
