import java.io.*;
class file4
{
      FileWriter fw;
      BufferedWriter bw;
      PrintWriter pw ;

  void  create(String fn)throws IOException          
{     
            fw=new FileWriter(fn) ;
            bw=new BufferedWriter( fw);
              pw =new PrintWriter(bw);
            System.out.println(" File "+fn+"  Succesfully Created................");
  }

void display1()
{

                System.out.println("Display File.........");
}  


void display2(int x)
{

                System.out.println("Display a record.........");
}  


                  
  void  add(String s)throws IOException
  {
        pw.println(s);
        System.out.println("\n\n\n1 record added");
        System.out.println("..................................................................");
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
//File f =new File("tmp.txt");
// f.ren("b.txt");

    bw.close();
} 

          void delete(int r)
  {

}
/*       FileWriter fw=new FileWriter("tmp.txt");
    BufferedWriter bw=new BufferedWriter(fw);
    PrintWriter pw = new PrintWriter(bw);    

    String s ;      
    int i=1;
    while((s=bw1.readLine())!=null)
  {     
                if(i!=r)
    {
    
      pw.println(s);
      i++;
    }
        System.out.println("1 record added");
}
}       

*/

  void exit()
{
  System.out.println("Closing Files and Exiting..............");       
    pw.close();
  }





public static void main(String arsg[])throws IOException
{
file4 ob=new file4();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=0,x=0;

while(true)
{
System.out.println("1. Create A File ");
System.out.println("2. Add a Record ");
System.out.println("3. Display All The Records ");
System.out.println("4. Display One Record");
System.out.println("5. Update One Record");
System.out.println("6. Delete One Record");
System.out.println("7. Exit");
System.out.println("enter your choice...........");
n=Integer.parseInt(br.readLine());


switch(n)
{

    case 1:
      ob.create("b.txt");
      break;

    case 2:
          System.out.println("\n\n\n enter a record .......");
          String p=br.readLine();
          ob.add(p);
      break;


    case 3:
      ob.display1();
      break;
    
    case 4:
          System.out.println(" enter record no to display.......");
          x=Integer.parseInt(br.readLine());
          ob.display2(x);
      break;

    case 5:
          System.out.println(" enter record no to update.......");
            x=Integer.parseInt(br.readLine());
          ob.update(x);
      break;

    case 6:
          System.out.println(" enter record no to delete.......");
            x=Integer.parseInt(br.readLine());
          ob.delete(x);
      break;
    case 7:
        ob.exit();
        System.exit(1);
      break;
}//switch

}//while

}
}
