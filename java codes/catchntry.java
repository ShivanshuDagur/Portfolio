import java.util.*;
class catchntry
{
public static void main(String args[])
		
	{
		
		FileInput Stream f1=new FileInput Stream("temp2.dat");
		Data Input Stream b1=new DataInput Stream(f1);
		Boolean eof=false;
		int n=0;
		try
	{
	while(!eof)
		{
				n=b1.readInt();
			System.out.println("value="+n);
		}
	}
			catch(exception 2)
	{
		eof=true;
	}
		}
}     