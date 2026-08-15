import java.io.*;
import javax.swing.*;

public class Filesio{


public static void signingUp(String username,String password,String email,String contact_No,String address)
{
File f1= new File("data.txt");
                       File f2 = new File("info.txt");

    try {
      f1.createNewFile();
      f2.createNewFile();
     
    } catch (IOException io1) {
      System.out.println("Cannot create file.");
    }

          FileWriter fw = null;
          FileWriter fw2 = null;

    try {
      fw = new FileWriter(f1,true);

      fw.write(String.format("%s,%s\n", username, password));
      fw.write("\n");
      
      fw2 = new FileWriter(f2,true);
      fw2.write(String.format("%s,%s,%s\n", email, contact_No,address));
      fw2.write("\n");
    }
    catch(IOException io2) {
      System.out.println("Error writing in file.");
    } 
    finally {
      try {
        fw.close();
        fw2.close();
      }
      catch(IOException io3) {
        System.out.println("Error closing file.");
      }
                
            }
}

public static void writeOrder(String username,String name,String mobile,String contact_No,String adrs,String address,String i,String item,String amount,int q,String bill,double t)
{
   File f1= new File("order.txt");
                       

    try {
      f1.createNewFile();
      
     
    } catch (IOException io1) {
      System.out.println("Cannot create file.");
    }

          FileWriter fw = null;
         

    try {
      fw = new FileWriter(f1,true);
      fw.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s,%.2f\n",username, name, mobile,contact_No,adrs,address,i,item,amount,q,bill,t));
      fw.write("\n");
      
    }
    catch(IOException io2) {
      System.out.println("Error writing in file.");
    } 
    finally {
      try {
        fw.close();
       
      }
      catch(IOException io3) {
        System.out.println("Error closing file.");
      }
                
            }
            
}
public static void writeReview(String user,String name1,String item,String p,String rating,String q,String dt,String describe)
{
  File f1= new File("reviews.txt");

                try{
                    f1.createNewFile();
                }
                catch (IOException io1) {
                    System.out.println("Cannot create file.");
                }

                FileWriter fw = null;

                try {
                    fw = new FileWriter(f1,true);
                    fw.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n", user,name1, item,p,rating,q,dt,describe));
                    fw.write("\n");
                    
                  }

                  catch(IOException io2) {
                    System.out.println("Error writing in file.");
                  } 

                  finally 
                  {
                    try {
                      fw.close();
                     
                    }
                    catch(IOException io3) {
                      System.out.println("Error closing file.");
                    }
                  }

}
public static boolean check(String username, String password) {
  BufferedReader br=null;

        try
        {

             br = new BufferedReader(new FileReader("data.txt"));

            String s;

            while ((s = br.readLine()) != null) 
            {
                String[] word = s.split(",");

                if ( word[0].equals(username) && word[1].equals(password)) 
                {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }finally {
          try {
            br.close();
            
          }
          catch(IOException io3) {
            System.out.println("Error closing file.");
          }
                    
                }
        return false;
    }

    public static void writeprice(int r,boolean ca1,int p,boolean ca2,int l,boolean ca3,int c,boolean ca4,int s,boolean ca5,int c1,boolean ca6,int a,boolean ca7)
    {
      
      File inputFile = new File("price.txt");
      inputFile.delete();
      File tempFile = new File("price.txt");
      
      try{
      tempFile.createNewFile();}
      catch(IOException ioe)
      {
        System.out.println("error while creating");
      }
   
      BufferedWriter bw = null;
     
     

try {
bw = new BufferedWriter(new FileWriter(tempFile));
bw.write(String.format("%d,%b,%d,%b,%d,%b,%d,%b,%d,%b,%d,%b,%d,%b\n",r,ca1,p,ca2,l,ca3,c,ca4,s,ca5,c1,ca6,a,ca7));
bw.write("\n");
}
catch(IOException io2) {
System.out.println("Error writing in file.");
} 
finally {


if (bw != null) {
                try {
                    bw.close();
                   
                }
catch(IOException io3) {
System.out.println("Error closing file.");
}
    }
  
} 
      
  
}
}