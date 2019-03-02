import java.util.*;
class evenodd
{
public static void main(String args[])
		
	{
		
		Filewriter  fw=new Filewriter("even.txt");
Bufferedwriter bw=new BufferedWriter(fw);
PrintWriter pw1=new PrintWriter(bw);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in))
Filewriter  fw=new Filewriter("even.txt");
Bufferedwriter bw=new BufferedWriter(fw);
PrintWriter pw1=new PrintWriter(bw);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in))
for(int i=0;i<20;i++)
	{
		System.out.println("Enter a number");
		n=Integer.parseint(br.readline());
					if(n%2==0)
				pw1.print(n);
		else
	p2.print(n);
				}
		pw1.close();
		pw2.close();
		}
}
						