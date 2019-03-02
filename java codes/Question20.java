/*Question 20

Write a program to create a m x n matrix and print the prime elements in it along with the row and column in which they are present.
Example – 
INPUT:
Enter the row and column for the matrix: 	3
4

Enter 12 elements:

4	5	1	6
8	25	30	2
16	9	45	3

OUTPUT:

Prime Element		Row		Column
        5			0		    1
        2			1		    3
        3			2		    3		

 
Algorithm

Step-1: Input the number of rows and columns as m and n
Step-2: Create a m x n matrix
Step-3: Enter m x n elements in the matrix
Step-4: Run a loop for the rows m
Step-5: Run a loop for the columns n
Step-6: Now run a loop to find the number of factors of the matrix element
Step-7: If the number of factors is 2 print the element, its row index and column index
Step-8: Continue process for all the elements
Step-9: End
*/

 
//Solution

import java.util.*;
public class Question20{
public static void main(String args[])throws InputMismatchException{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows and columns of a matrix: ");
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    int i,j,k,s=0;

    System.out.println("Enter "+(m*n)+" elements:");
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
        a[i][j]=sc.nextInt();
        }
    }
    System.out.println("Prime Element\t Row\t Column");
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){

            int c=0;
            for(k=1;k<=a[i][j];k++){
                if(a[i][j]%k==0){
                    c++;
                }
            }
            if(c==2){
                System.out.println(a[i][j]+"\t\t"+i+"\t\t"+j);
            }
        }
    }

}//end of main
}//end of class

