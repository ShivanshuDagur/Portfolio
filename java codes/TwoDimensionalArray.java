
import java.util.Scanner;
public class TwoDimensionalArray 
{
	int size;
	int[][] matrix;
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of Square matrix");
		size=sc.nextInt();
		matrix=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.println("enter value in"+j+"th"+"column of"+i+"th row");
			matrix[i][j]=sc.nextInt();
			}
		}
	}
	
	
    void show()
    {
    for(int i=0;i<size;i++)
    {
    	for(int j=0;j<size;j++)
    	{
    		System.out.print(matrix[i][j]+"	");
    	}
    	System.out.println();
    }
System.out.println();
    }
void showTranspose()
{
	for(int i=0;i<size;i++)
    {
    	for(int j=0;j<size;j++)
    	{
    		System.out.print(matrix[j][i]+"	");
    	}
    	System.out.println();
    }
	
	
}
int sumOfMatrix()
{
	int sum=0;
	for(int i=0;i<size;i++)
    {
    	for(int j=0;j<size;j++)
    	{
    		sum=sum+matrix[i][j];
    	}
    	
    }
return sum;
}
void rowSum()
{
	int sum=0;
	for(int i=0;i<size;i++)
    {
    	for(int j=0;j<size;j++)
    	{
    		sum=sum+matrix[i][j];
    	}
    	System.out.println("Sum of"+i+"th row="+sum);
    	sum=0;
    }
}
void columnSum()
{
	int sum=0;
	for(int i=0;i<size;i++)
    {
    	for(int j=0;j<size;j++)
    	{
    		sum=sum+matrix[j][i];
    	}
    	System.out.println("sum of "+i+"th column="+sum);
    	sum=0;
    }
}
void findMax()
{
int maxi=0,maxj=0;
for(int i=0;i<size;i++)
{
	for(int j=0;j<size;j++)
	{
	if(matrix[i][j]>matrix[maxi][maxj])
		maxi=i;
	maxj=j;
	}
	
}
System.out.println("Lagrest number in the whole matrix ="+matrix[maxi][maxj]);
}
void findMin()
{
	int mini=0,minj=0;
	for(int i=0;i<size;i++)
    {
    	for(int j=0;j<size;j++)
    	{
    		if(matrix[i][j]<matrix[mini][minj])
    			mini=i;
    		minj=j;
    	}
    	
    }
	System.out.println("Smallest number in whole matrix="+matrix[mini][minj]);
}
void printDigonal()
{
	for(int i=0;i<size;i++)
    {
    	for(int j=0;j<size;j++)
    	{
    		if(i==j)
    		System.out.print(matrix[i][j]);
    		else
    		System.out.print("	");
    	}
    	System.out.println();
    }
	for(int i=0;i<size;i++)
    {
    	for(int j=0;j<size;j++)
    	{
    		if(j==((size-1)-i))
    		System.out.print(matrix[i][j]);
    		else
    			System.out.print("	");
    	}
    	System.out.println();
    }
}
 void printClockwise()
 {
	 int row=0;
	 int column=0;
	 int e=0;
	 while(e<(((size)+(size-2))*2)) 
	 {
		 if(row==0)
		 {
			 System.out.print(matrix[row][column++]+" ");
	           e++;
		 }
		 if(column==(size-1))
		 {
			 System.out.print(matrix[row++][column]+" ");
		 e++;
		 }
         if(row==(size-1))
         {
        	 System.out.print(matrix[row][column--]+" ");
         e++;
         }
         if(column==0)
         {
        	 System.out.print(matrix[row--][column]+" ");
        	 e++;
         }
         
	 }
	 System.out.println();
}
void printAnticlockwise()
{
	int row=0;
int column=0;
int e=0;
	 
while(e<(((size)+(size-2))*2)) 
{
	 if(column==0)
	 {
		 System.out.print(matrix[row++][column]+" ");
          e++;
	 }
	 if(row==(size-1))
	 {
		 System.out.print(matrix[row][column++]+" ");
	 e++;
	 }
    if(column==(size-1))
    {
   	 System.out.print(matrix[row--][column]+" ");
    e++;
    }
    if(row==0)
    {
   	 System.out.print(matrix[row][column--]+" ");
   	 e++;
    }
    
}
}
public static void main(String args[])
{
	TwoDimensionalArray ob=new TwoDimensionalArray();
	ob.getdata();
	ob.show();
	ob.showTranspose();
	ob.rowSum();
	ob.columnSum();
	ob.findMax();
	ob.findMin();
	ob.printDigonal();
	ob.printClockwise();
	ob.printAnticlockwise();
	
	
	
}
}

