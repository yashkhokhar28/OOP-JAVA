

import java.io.*;  
public class Test
{  
public static void main(String args[]) throws Exception
{  
	FileInputStream fin=new FileInputStream("41.java");  
	int i=0;  
	while((i=fin.read())!=-1)
	{  
	System.out.println((byte)i);  
	}  
	fin.close();  
}  
}  