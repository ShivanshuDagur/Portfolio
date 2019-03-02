import java.io.*;
import java.util.*;
public class book
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter a string");
String s=br.readLine();
String as="";
String token="";
String rs;
int len;
int c=0;
char ch;
int j;
int rem=0;
int rav=0;
int av;

StringTokenizer st=new StringTokenizer(s);
int l=st.countTokens();
int i;
for(i=0;i<l;i++)
{
token=st.nextToken();
len=token.length();
for(j=0;j<len;j++)
{
ch=token.charAt(j);
av=(int)ch;
while(av!=0)
{
rem=av%10;
av=av/10;
rav=(rav*10)+rem;
}
rs=Integer.toString(rav);
as=as+rs;
rav=0;
rem=0;
}
if(c!=(l-1))
{
c++;
as=as+"23";
}
}
System.out.print(as);
}
}





















