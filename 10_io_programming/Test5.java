    import java.io.*;  
    class Test5
{  
     public static void main(String args[])throws Exception
{  
      FileReader fr=new FileReader("41.java"); 
	FileWriter fw=new FileWriter("3.txt");
 

      int i; 
 
      while((i=fr.read())!=-1)  
	{
     // System.out.print((char)i);  
	fw.write((char)i);
	}
      
      fr.close();  
	fw.close();
     }  
    }  