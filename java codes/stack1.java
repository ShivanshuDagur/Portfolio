import java.io.*;
class stack1
{
int s[]=new int[20];
int top,n;
stackoper(int nn)
  {
    for(int i=0;i<20;i++)
    s[i]=0;
    top=-1;
    n=nn;
  }
void pushdata(int item)
{
    if(top==(n-1))
    System.out.println("Stack Overflows");
    else
    {
        top++;
        s[top]=item;
    }
}
int popdata()   
{ 
  int v=0;
  if(top==-1) 
  System.out.println("Stack Overflows");
  else
    {
        v=s[top];
      top--;
    }
    return(v);
}
void display()
{
  if(top==-1)
  System.out.println("Stack Empty");
  else
    {
      System.out.println("SP--------->|"+s[top]+"|");
      System.out.println("            ___");
      for(int i=top-1;i>=0;i--)
        {
          System.out.println("         |"+s[i]+"|");
          System.out.println("         ___");
        }
    }
}


public static void main (String args[])throws IOException
{
  InputStreamReader read=new InputStreamReader (System.in);
  BufferedReader in=new BufferedReader (read);
  stackoper st=new stackoper(5);
  int val,ch;
  do{
System.out.println("The Main Menu");
System.out.println("1.push");
System.out.println("2.pop");
System.out.println("3.display");
System.out.println("exit");
System.out.println("Enter your choice");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
  case 1:
  System.out.println("Enter the value to be inserted");
  val=Integer.parseInt(in.readLine());
  st.pushdata(val);
  break;
case 2:
  val=st.popdata();
  System.out.println("the popped out element is"+val);
  break;
case 3:
  st.display();
  break;
}
            }	while(ch!=4);
  
}
}