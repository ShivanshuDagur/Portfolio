import java.io.*;
import java.util.*;
public class filehandaling
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int ch=0;
int l=0;
int i,c=0;
int f=0;
String s="";
String rollno="";
String clas="";
String name="";
String sp;
while(ch!=5)
{
String df=br.readLine();
System.out.println("*****MENU*****");
System.out.println("1. FOR CREATING A FILE");
System.out.println("2. FOR APPEND");
System.out.println("3. FOR READING A FILE");
System.out.println("4.FOR DISPLAYING A RECORD");
System.out.println("5. FOR EXIT");

System.out.print("enter your choice");
ch=Integer.parseInt(br.readLine());

switch(ch)
{

          case 1:
{
FileWriter fw=new FileWriter("school.txt");
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw);
System.out.println("input name");
name=br.readLine();
pw.print(name+"    ");
System.out.println("class");
clas=br.readLine();
l=clas.length();
for(i=l;i<2;i++)
clas="0"+clas;
pw.print(clas+"    ");
System.out.println("roll number");
rollno=br.readLine();
l=rollno.length();
for(i=l;i<10;i++)
rollno="0"+rollno;
pw.println(rollno+"    ");

pw.close();
break;
}
             case 2:
{
FileWriter fw=new FileWriter("school.txt",true);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw);
System.out.println("input name");
name=br.readLine();
pw.print(name+"    ");
System.out.println("class");
clas=br.readLine();
l=clas.length();
for(i=l;i<2;i++)
clas="0"+clas;
pw.print(clas+"    ");
System.out.println("roll number");
rollno=br.readLine();
l=rollno.length();
for(i=l;i<10;i++)
rollno="0"+rollno; 
pw.println(rollno);

pw.close();
break;
}         
case 3:
{
FileReader fr=new FileReader("school.txt");
BufferedReader brr=new BufferedReader(fr);

while((s=brr.readLine())!=null)
{
System.out.println("line"+":"+s);
}
brr.close();
break;
           
}
case 4:
{
System.out.print("enter name");
String nn=br.readLine();
FileReader fr=new FileReader("school.txt");
BufferedReader brr=new BufferedReader(fr);
while((s=brr.readLine())!=null)
{
StringTokenizer st = new StringTokenizer(s);
String n=st.nextToken();
if(n.equals(nn))
System.out.println(s);
}
break;
}


          case 5:
System.exit(0);
break;

         default:
System.out.print("invalid choice");
}
}
}
} 


