import java.io.*;
class writerprog
{
public static void main(String args[])throws IOException
{
InputStreamReader x=new InputStreamReader(System.in);
BufferedReader y=new BufferedReader(x);
FileWriter fw=new FileWriter("name.txt");
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw);
System.out.println("Enter the number of Students in the class ");
int n=Integer.parseInt(y.readLine());
System.out.println("Enter the name of the students");
String N;
for(int i=0;i<n;i++)
{
	System.out.println("Enter the name");
	N=y.readLine();
	pw.println(N);
}
pw.close();
bw.close();
fw.close();
}
}
