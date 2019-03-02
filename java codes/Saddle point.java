

import java.io.*;

class SaddlePoint

{//class open

public static void main(String args[])throws IOException

{//main open          
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("Enter the order of the matrix : ");

int n=Integer.parseInt(br.readLine());

int A[][]=new int[n][n];

System.out.println("Inputting the elements in the matrix");

System.out.println("******************************"); // Ignore these. They are just for styling

for(int i=0;i<n;i++)

{//for open

    for(int j=0;j<n;j++)

        {//for open
            System.out.print("Enter Element at ["+i+"]["+j+"] : ");

                A[i][j]=Integer.parseInt(br.readLine());

        }//for close

}
//for close          

                /* Printing the Original Matrix */


System.out.println("******************************");

System.out.println("The Original Matrix is");

for(int i=0;i<n;i++)

{//for open

    for(int j=0;j<n;j++)

        {//for open

                System.out.print(A[i][j]+"\t");

        } //for close

System.out.println();

}//
//for close

int max, min, x, f=0;

for(int i=0;i<n;i++)

{
//for open          
            /* Finding the minimum element of a row */

    min = A[i][0]; // Initializing min with first element of every row

x = 0;

for(int j=0;j<n;j++)

        {
//for open             
                if(A[i][j]<min)

    { //if open

        min = A[i][j];
    
x = j; // Saving the column position of the minimum element of the row

    } //if close
    }
//if close           

/* Finding the maximum element in the column
* corresponding to the minimum element of row */

    max = A[0][x]; // Initializing max with first element of that column

for(int k=0;k<n;k++)

            {//for open

                if(A[k][x]>max)

    {//if open
        max = A[k][x];

    }//if close 

    } //if close 


    /* If the minimum of a row is same as maximum of the corresponding column,
then, we have that element as the Saddle point */

    if(max==min)

            {
//if open            
System.out.println("********************");

            System.out.println("Saddle point = "+max);

            System.out.println("********************");

            f=1;

            }
//if close 


}
//for close 

if(f==0)

{
//if open
System.out.println("********************");

System.out.println("No saddle point");

System.out.println("********************");

}//if close 
}//main close 

}//class close