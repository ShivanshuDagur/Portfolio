import java.io. * ;
import java.util . * ;
public class baap
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System. in);
int n=sc.nextInt();
int []counts=new int [n];
for(int i=0; i < n; i++)
{
counts[i]=sc.nextInt();
}
int frequency[]=new int[n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(counts[i]==counts[j])
frequency[i]++;
}
}

for(int i = 0; i < n-1; i ++)
{
for(int j = 0; j < n - i -1; j++)
{
if(frequency[j]>=frequency[j + 1])
{
int t = frequency[j];
frequency[j] = frequency[j + 1];
frequency[j + 1] = t;
}
}
}

System.out.print("Min. time="+(n-frequency[n-1]));

}
}