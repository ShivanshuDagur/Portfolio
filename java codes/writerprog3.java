import java.io.*;
class writerprog3
{
public static void main(String args[])throws IOException
  {
	InputStreamReader x=new InputStreamReader(System.in);
	BufferedReader y=new BufferedReader(x);
        
	
	FileReader fr=new FileReader("name.txt");
	BufferedReader br=new BufferedReader(fr);
	
        String a[]=new String[100];
	int ch,n=0,i,j;
	String text,temp;
	while((text=br.readLine())!=null)
	{
	a[n]=text;
	n++;
	}
	
	FileWriter fw=new FileWriter("name.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	PrintWriter pw=new PrintWriter(bw);
	
	
	  System.out.println("         *****OPTIONS***** ");
	  System.out.println("(1)-Arrange the names in ascending order");
	  System.out.println("(2)-Arrange the names in descending order");
	  System.out.println("enter the choice");
	  ch=Integer.parseInt(y.readLine());
	switch(ch)
	 {
	  case 1:  
	for(i=0;i<n;i++)
	{
	 for(j=0;j<n-1-i;j++)
	  {
	   if(a[j].compareTo(a[j+1])>0)
	   {
	     temp=a[j];
	     a[j]=a[j+1];
	     a[j+1]=temp;
	   }
	 }
	}
	break;
	  case 2:
	    for(i=0;i<n;i++)
	{
	 for(j=0;j<n-i-1;j++)
	  {
	   if(a[j].compareTo(a[j+1])<0)
	   {
	     temp=a[j];
	     a[j]=a[j+1];
	     a[j+1]=temp;
	   }
	 }
	}
	break;
	default: System.out.println("Sorry wrong choice entered");
	}
  	for(i=0;i<n;i++)
	{
	pw.println(a[i]);
	}
	pw.close();
	bw.close();
	fw.close();
	FileReader fr1=new FileReader("name.txt");
	BufferedReader br1=new BufferedReader(fr1);
	while((text=br1.readLine())!=null)
	System.out.println(text);
	br1.close();
  }
}