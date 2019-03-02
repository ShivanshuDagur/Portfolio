import java.io.*;
import java.util.*;
public class classifyIP
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip;
        
        String temp1="";
        String temp2="";
        String temp3="";
        String temp4="";
        int flag = 1;

        
        while(flag == 1)
        {
        System.out.println("Enter ip adderess in binanry in 8-bit format");
        ip = br.readLine();
        
        StringTokenizer st1 = new StringTokenizer(ip,"."); 
        
         temp1 = st1.nextToken();
         temp2 = st1.nextToken();
         temp3 = st1.nextToken();
         temp4 = st1.nextToken();

         if(temp1.length() == 8 && temp2.length() == 8 && temp3.length() == 8 && temp4.length() == 8)
         {
            flag = 0;
         }
          

        }
              
        int number = Integer.parseInt(temp1,2);
        
        System.out.println("Binary equivalent of first part of ip: "+number);
        if (number >= 0 && number <= 127)
            System.out.println("It is class A IP");
        else if (number > 127 && number  <= 191)
            System.out.println("It is class B IP");
        else if (number > 191 && number  <= 223)
            System.out.println("It is class C IP"); 
        else if (number > 223 && number  <= 239)
            System.out.println("It is class D IP");
        else if (number > 238 && number  <= 255)
            System.out.println("It is class E IP");    


    }
}