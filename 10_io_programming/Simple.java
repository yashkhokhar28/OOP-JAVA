import java.io.*;  
class Simple{  
 public static void main(String args[])throws Exception
{  
   
   FileWriter fw=new FileWriter("abc.txt");  
   fw.write("my name is yash");  
   fw.close();  
   
  System.out.println("success");  
 }  
}  