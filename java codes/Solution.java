import java.io. * ;
import java.util . * ;
public class Solution
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System. in);
int n=sc.nextInt();
int []counts=new int [101];
for(int i=0; i < n; i++)
{
int a=sc.nextInt ();
counts[a]++  ;
System.out.println(counts[a]);
System.out.println(" ");
}
System.out.println("hold on");
sc.nextInt();
for(int i = 0; i < 100; i ++)
{
for(int j = 0; j < 101 - i -1; j++)
{
if(counts[j]>=counts[j + 1])
{
int t = counts[j];
counts[j] = counts[j + 1];
counts[j + 1] = t;
}
}
}
for(int i=0; i < 101; i++)
{

System.out.println(counts[i]);

}
System.out.println("hold on");
sc.nextInt();


System.out.println(n - counts[100]);
}
}