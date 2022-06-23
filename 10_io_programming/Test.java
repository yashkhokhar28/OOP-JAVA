

import java.io.*;  
class Test
{  
public static void main(String args[]) throws Exception
{  
	FileInputStream fin=new FileInputStream("41.java");  
	int i=0;  
	while((i=fin.read())!=-1)
	{  
	System.out.print((char)i);  
	}  
	fin.close();  
}  
}  