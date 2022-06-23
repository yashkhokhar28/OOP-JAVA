   import java.io.*;  
    class Test2{  
     public static void main(String args[])throws Exception{  
      FileOutputStream fout1=new FileOutputStream("monu.txt");  
      FileOutputStream fout2=new FileOutputStream("gunjan.txt");  
      
      ByteArrayOutputStream bout=new ByteArrayOutputStream();  
      bout.write(65);  
      bout.writeTo(fout1);  
      bout.writeTo(fout2);  
      
      bout.flush();  
      bout.close();//has no effect  
      System.out.println("success...");  
     }  
    }