import java.io. * ;
import java.util . * ;
public class Solution3
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System. in);
int n=sc.nextInt();
int []counts=new int [n];
for(int i=0; i < n; i++)
{
counts[i]=sc.nextInt();//WHILE ENTERING VALUES IN ARRAY ISTEAD OF WRITING VALUES IN DIFFERENT LINE AFTER PRESSING ENTER, VALUES CAN BE SEPARATED BY SPACE(S) AND INPUT CAN BE GIVEN  IN SINGLE LINE.
}
System.out.println ("array printing");
for(int i=0;i<n;i++)
{
System.out.print(counts[i]);
}
}
}