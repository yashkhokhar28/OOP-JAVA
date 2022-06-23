import java.io.*;  
class Test
{  
public static void main(String args[])
{  
FileOutputStream fout=new FileOutputStream(args[0]);  
String s="Sachin Tendulkar is my favourite player";  
byte b[]=s.getBytes();//converting string into byte array  
fout.write(b);  
fout.close();  
System.out.println("success...");  
      
}  
}  