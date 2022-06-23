    import java.io.*;  
    class Test1
{  
      public static void main(String args[])throws Exception
     {  
       FileInputStream fin1=new FileInputStream("io.java");  
       FileInputStream fin2=new FileInputStream("monu.txt");  
      
       SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
       int i;  
       while((i=sis.read())!=-1)
       {  
        System.out.print((char)i);  
       }  
       sis.close();  
       fin1.close();  
       fin2.close();
    
      }  
}  