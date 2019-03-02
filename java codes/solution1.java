import java.io. * ;
import java.util . * ;
public class Solution1
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System. in);
int n=sc.nextInt();
int []counts=new int [101];
for(int i=0; i < n; i++)
{
counts[sc.nextInt ()]++ ;
}
for(int i = 0; i < 100; i += 2)
{
for(int j = 0; j < 101 - i +1; j++)
{
if(counts[j] < counts[j + 1])
{
int t = counts[j];
counts[j] = counts[j + 1];
counts[j + 1] = t;
}
}
}

System.out.println(n + counts[100]);
}
}