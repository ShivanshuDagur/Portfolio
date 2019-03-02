class datentime
{//class open
   int mon[]={0,31,28,31,30,31,30,31,31};
   int dd,mm,yy;
      boolean validate_pattern(String a)
      {//pattern validate open

      int i=0,p1=0,p2=0; char ch;

   for(i=0;i<a.length();i++)
   {// for open
            ch=a.charAt(i);
      if(i==2 || i==5)
         {//if open
            if(ch!='/')
            {//if open
               p1=1;
               break;
            }//if closed
         }//if closed
      else{//else open

               if(!Character.isDigit(ch))
               {//if condition open
                  p2=1;
                  break;
               }//if condition closed
         }//else closed


   }//for open


   if(p1>0)
         return false;         
System.out.println(" Invalid Pattern...../ not present at proper Location");
if(p2>0)
{//if open
      System.out.println(" Date values should be in numbers only");
   return false;

return true;

      }//if closed

void setVal(int a,int b,int c)
{ //function open
      dd=a;mm=b;yy=c;
   if(yy%4==0 )
{//if open     
mon[2]=29;
}//if closed

}//function closed
boolean valid_day()
{//day validation open
         if(dd>mon[mm])
      return false;
   else 
   return true;
}//day validation closed


boolean valid_month()
{//month validation open

      if(mm<1 || mm>12)
      return false;
   else 
   return true;
}//month validationclosed

boolean valid_year()
{//year validation open

      if(mm<1 || mm>3000)
      return false;
   else 
   return true;
}//year validation closed

public static void main(String aad[])
{//main open
   String a="45/11/2014";
dt ob=new dt();

boolean b1=ob.validate_pattern(a);

int x=Integer.parseInt(a.substring(0,2));
int y=Integer.parseInt(a.substring(3,5));
int z=Integer.parseInt(a.substring(6));


if(b1==true)
   ob.setVal(x,y,z);

if(!ob.valid_day())
   System.out.println("InValid Day");  
else
   System.out.println("Valid Day");  



if(!ob.valid_month())
   System.out.println("InValid Month");  
else
   System.out.println("Valid Month");  


if(!ob.valid_year())
   System.out.println("InValid year");  
else
   System.out.println("Valid year");  

}//main closed



}//class closed