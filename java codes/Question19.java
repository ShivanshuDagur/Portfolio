/*
Question 19

Write a program to sort the border elements of a n x n matrix in ascending order.
Example – 
INPUT:
Enter the number of rows for a square matrix: 3
Enter 9 elements:
4	9	3
1	7	6
5	8	2

OUTPUT:
Matrix with border in ascending order:
1	2	3
9	5	4
8	7	6 
Algorithm

Step-1: Input the number of rows for a square matrix
Step-2: Create an n x n matrix and enter elements in it
Step-3: Run two loops to access the matrix
Step-4: Check for border elements
Step-5: If found, store them in a single dimension array, say b[]
Step-6: Continue the process till all the border elements are stored in b[]
Step-7: Now, sort the array b[] in ascending order using any sorting technique
Step-8: To store the sorted border elements in the matrix, run a loop for the 
	 first row and store elements from b[] in the matrix
Step-9: Run a loop for last column and do the same
Step-10: Run a loop for last row and then first column to store the elements from b[] to matrix
Step-11: Finally, print the matrix that now has border elements sorted in ascending order.
Step-12: End
*/

 
//Solution

import java.util.*;

public class Question19 {
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

   int b[]=new int[n*n];
   int x=0;

//Run loops to store the border elements in a single dimension array
 for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==0 || j==0 || i==n-1 || j==n-1){
                b[x++]=a[i][j];
            }
        }
    }

// Sort the array containing border elements
  for(i=0;i<x;i++){
        for(j=i+1;j<x;j++){
        if(b[i]>b[j]){
            int t=b[i];
            b[i]=b[j];
            b[j]=t;
        }
      }
    }

//Now store the sorted border elements back to the matrix
   int c=0;
    for(i=0;i<n;i++)	//Store the sorted elements in the first row
        a[0][i]=b[c++];

  for(i=1;i<n;i++)	//Store the sorted elements in the last column
        a[i][n-1]=b[c++];

   for(i=n-2;i>=0;i--)	//Store the sorted elements in the last row
        a[n-1][i]=b[c++];

    for(i=n-2;i>0;i--)	//Store the sorted elements in the first column
        a[i][0]=b[c++];

 for(i=0;i<n;i++){
   for(j=0;j<n;j++){
     System.out.print(a[i][j]+" ")  ;
   }
   System.out.println();
    }

}//end of main
}//end of class
