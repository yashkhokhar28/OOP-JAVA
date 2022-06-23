    import java.io.*;  
    class SimpleRead
{  
     public static void main(String args[])throws Exception
       {  
       
        FileInputStream fin=new FileInputStream("io.java");  
        BufferedInputStream bin=new BufferedInputStream(fin);  
        int i;  
        while((i=bin.read())!=-1)
          {  
         System.out.print((char)i);  
          }  
        bin.close();  
        fin.close();  
       
     }  
}  