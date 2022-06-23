    import java.io.*;  
    class Simple2{  
     public static void main(String args[])throws Exception{  
      
      CharArrayWriter out=new CharArrayWriter();  
      out.write("our name is yash&abhi");  
      
      FileWriter f1=new FileWriter("x.txt");  
      FileWriter f2=new FileWriter("y.txt");  
      FileWriter f3=new FileWriter("z.txt");  
      FileWriter f4=new FileWriter("v.txt");  
      
      out.writeTo(f1);  
      out.writeTo(f2);  
      out.writeTo(f3);  
      out.writeTo(f4);  
      
      
      f1.close();  
      f2.close();  
      f3.close();  
      f4.close();  
     }  
    }  