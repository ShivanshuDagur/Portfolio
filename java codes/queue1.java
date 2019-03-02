import java.io.*;

class queue1
{
int s[]=new int[10];
int rear,front,limit;

public boolean empty()
{
if(rear<front)
return true;
else
return false;
}


public boolean full()
{
if(rear>=limit)
return true;
else
return false;
}

public queue1(int nm)
{
int i;
for(i=0;i<10;i++)
s[i]=0;

rear=front=0;
limit=nm;
}

public void addval(int item)
{
if(full())
System.out.println("Queue Over flows");
else
s[rear++]=item;

}


int popdata()
{
int v=0;
if(empty())
System.out.println("queue underflows");
else
v=s[front++];

return(v);
}

public void display()
{
int i;
if(empty())
System.out.println("Queue is  Empty");
else
{
System.out.println("values in the queue are ");

for(i=front;i<=rear-1;i++)
{
System.out.println(s[i]);
System.out.println(" ");
}//for
}//else 
}


public static void main(String args[])throws IOException
{
InputStreamReader x=new InputStreamReader(System.in);
BufferedReader y=new BufferedReader(x);
int limit;
System.out.println("Enter the limit");
limit=Integer.parseInt(y.readLine());

queue1 ob1=new queue1(limit);
int ch;

do{
System.out.println("**MENU**");
System.out.println("1.Push");
System.out.println("2.Pop");
System.out.println("3.Display");
System.out.println("4.EXIT");
System.out.println("Enter choice");
ch=Integer.parseInt(y.readLine());
if(ch==1)
{
System.out.println("Enter the item to be pushed");
int item=Integer.parseInt(y.readLine());
ob1.addval(item);

}
else if(ch==2)
{
int val=ob1.popdata();

}

else if(ch==3)
{
ob1.display();

}  
else if(ch>4)
{
System.out.println("Wrong option");
}
}while(ch!=4);
}
}