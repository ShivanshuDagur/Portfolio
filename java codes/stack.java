import java.util.*;
class stack
{
int a[]=new int[100];
int limit,front,rear,top;
public stack( )
{
  top= -1;
  limit=10;
  }
    public stack(int l)
  {
      top= -1;
    limit= l;
    }
    public void push(int x)
      {
        if(!full ())
      {
        a[++ top]=x;
        }
        else
        System.out.println(" Stack overflow");
      }
            public int pop()
              {
              if(!empty() )
                return a[top --];
              else
              return -999;
      }
                public boolean empty()
      {
                  if (top<0)
                  return true;
                else
                return false;
        }
            public boolean full()
{
          if (top >=limit)
          return true;
      else
    return false;
}
  public void display()
  {   
      System.out.println("-------------------------------------------------");
      for(int i=0; i<=top; i++)
      System.out.println(" Value ="+a[i]);
    System.out.print("-------------------------------------------------");      
  }
      public void peek()
{
    if(!empty())

  System.out.println(a[top]);
  else
  System.out.println ("stack is overflow");
}

  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  stack ob=new stack(6);
    int n=0;
    while (true);
    System.out.println("............Menu.............");
    System.out.println("................1.Push..........");
    System.out.println("..................2.Pop...........");
    System.out.println("................3.Display..........");
    System.out.println("................4Peek...............");
    System.out.println(".................5.Exit...........");

  System.out.println("Input your choice");
  int c=sc.nextInt();
    switch(c)
{
    case 1:
  System.out.println("Input a number to Push------");
    n=sc.nextInt();
    ob.push(n);
    break;
  case 2:
  n=ob.pop();
  System.out.println("Value poped is -----"+n);
  break;
    case 3:
    ob.display();
    break;
  case 4:
  System.out.println("Topmost value is -------");
  ob.peek();
  break;
    case 5:
    System.out.println("Exiting-------");
    System.exit(0);
}
}
}

