import java.io.*;  
class Test3{  
  public static void main(String args[])throws Exception
{  
  
   FileInputStream fin1=new FileInputStream("io.java");  
   FileInputStream fin2=new FileInputStream("gunjan.txt");  
  
   FileOutputStream fout=new FileOutputStream("f3.txt");  
  
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
   int i;  
   while((i=sis.read())!=-1)  
   {  
     fout.write(i);      
   }  
   sis.close();  
   fout.close();    
   fin1.close();    
   fin2.close();    
  
  }  
}  