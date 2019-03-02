import java.io.*;
class filehandling1
{
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pw ;

void  create(String fn)throws IOException          
{     
            fw=new FileWriter(fn) ;
            bw=new BufferedWriter( fw);
            pw =new PrintWriter(bw);

}


                
void  add(String s)throws IOException
{
        pw.println(s);
        System.out.println("1 record added");
    }


    void  update(int r)throws IOException
{
    pw.close();
    FileReader fw1=new FileReader("b.txt") ;
    BufferedReader bw1=new BufferedReader( fw1);

    FileWriter fw=new FileWriter("tmp.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    PrintWriter pw = new PrintWriter(bw);    

        String s=" ";
        int i=1;
    while(  (s=bw1.readLine())!=null)
{     
                if(i==r)
    {
        System.out.println("Present record is"+s);
        System.out.println("enter new value");               
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));

s=br.readLine();
    }
    pw.println(s);
    i++;
    System.out.println("1 record added");
}


    bw.close();
} 

void exit()
{
pw.close();
}





public static void main(String arsg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


System.out.println("enter a record................... ");
String s=br.readLine();
goga2 ob=new goga2();

ob.create("b.txt");
for(int i=1;i<=5;i++)
ob.add(s);
ob.update(3);
ob.exit();
}
}
