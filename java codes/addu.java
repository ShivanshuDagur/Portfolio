import java.io.*;
public class addu
{
public static void main(String args[])throws IOException
{
FileReader fr=new FileReader("names.txt");
BufferedReader br=new BufferedReader(fr);
String s;
int i=1;
while((s=br.readLine())!=null)
{
System.out.println("line "+i+":"+s);
i++;
}
br.close();
}
}
