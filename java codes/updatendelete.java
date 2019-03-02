class updatendelete
{
FileWriter fw;
BufferedWriter bw;
PrintWriter pw;
void create (string fn)throwsIOException
{
fw=new FileWriter(fn);
bw=BufferedWriter(fw);
pw=PrintWriter(bw);
}
void add(String s)throwsIOException
{
pw.println(s);
System.out.println("1 record added");
}
void update(int c)throwsIOException
{
String s;
FileWriter fw=new FileWriter("tmp.txt");
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter pw=new PrintWriter(bw);
int i=1;
while(s=bw.readline()!=null)
{
if (i==c);
{
System.out.println("present record is="+s);
System.out.println("enter new values");
s=br.readline();
pw.println(s);
i++;
System.out.println("1 record updated");
file f=new file("tmp.txt");
f.rename("tmp.txt","a.txt")
}
void delete(int r)throwsIOException
{
String s;
FileWriter fw1=new FileWriter("tmp.txt");
BufferedWriter bw1=new BufferedWriter(fw1);
PrintWriter pw1=new PrintWriter(bw1);
int i=3;
while(s=bw.readline()!=null)
{
if(r!=i)
{
pw.println(s);
i++;
System.out.println("1 record deleted");
}
}
}
public static void main(String args[])throws IOException
{
      
      