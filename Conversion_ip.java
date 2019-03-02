import java.io.*;
import java.lang.*;
public class Conversion_ip
{
    Conversion_ip()
    {
        System.out.println("Constructor got called");
    }
    public String get_ip()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flag = 1, i = 0;
        String ip = "",ip2 = "", temp = "";
        char ch;

        do
        {
            flag = 1;

            System.out.println("Enter 32bit IP in binary");
            ip = br.readLine();

            if (ip.length() == 35)
            {
                System.out.println("length of ip: "+ip.length());

                for(i = 0; i < 35; i++)
                {
                    ch = ip.charAt(i);

                    if(ch == '1' || ch == '0'){
                        temp = temp + ch;}  
                    if(ch == '.' || i == 34)
                    {
                        if(temp.length() == 8)
                        {
                            ip2 = ip2.concat(temp);
                            temp = "";
                        }
                        else
                        {
                            flag = 0;
                            // break;
                        }
                    }
                    
                    if (ch != '1' || ch !='0' || ch != '.')
                    {
                        flag = 0;
                        //  break;
                    }

                }
            }
            else 
                {flag = 0;}
            
            

        }
        while(flag == 0);

        return ip2;
    }
   
public static void main(String args[])throws IOException
{
    Conversion_ip ob = new Conversion_ip();
    String IP = ob.get_ip();


    System.out.println("valid ip: "+IP);
    System.out.println("length: "+IP.length());
}
}

