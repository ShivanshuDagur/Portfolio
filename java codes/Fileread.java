import java.io.*;
public class Fileread  
{
 public static void main(String ab[])throws IOException
{
FileReader fr=new FileReader("a.txt");
BufferedReader br=new BufferedReader(fr);
String s="";
for(;;)
{
s=br.readLine();
if(s==null)
break;
else 
System.out.println("data read="+s);
}
br.close();
}
}