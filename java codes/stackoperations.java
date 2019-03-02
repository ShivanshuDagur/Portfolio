import java.io.*;
{
public class stackoperations
{
int stack[]=new int[100];
int limit;
int top;

public stackoperations(int l);
{ 
limit=l; top=0;
}
public stackoperations()
{
limit=10;
top=0;
}
public boolean full()
{
  if(top>=limit)
{
  return true;
}
else
{ 
  return false;
}
}
public boolean empty()
{
if(top<0)
{
return true;
}
else
{
return false;
}
}

public void full(int val)
{
if(!full())
{
stack[top]=val;
top++;
}
else
System.out.print("Stackoverflow");
}
public int pop()
{
int x=0;
if(!empty())
{
x=stack[top];
top--;
return x;
if(!empty())
{
    System.out.print(stack[top])
else
    System.out.print("Stack underflow");
}

public void Display()
{
for(i=top;i>=0;i++)
{
System.out.print(stack[i]);
}
public static void main(String args[])
{
stackoperations ob=newoperations();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.println(" 1 push");
  System.out.println(" 2 pop");
  System.out.println(" 3 peek");
    System.out.println(" 4 Display");
      System.out.println(" /n/n Input your choice");
ch=br.readLine();
Switch(ch)
{
case 1:
System.out.println("input value to be pushed");
val=br.readLine();
ob.push(val);
break;
case2:
int x=ob.pop();
System.out.println("Value removed"+x);
break;
Case 3:
System.out.println("Top most value"+ob.peek);
break;
Case 4:
System.out.println("Value are");
ob.Display();
break;
Case 5:
System exit(0);
break;
}
}
}
