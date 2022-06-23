import java.io.*;  
    class C
{ 

public static void main(String args[])throws Exception
   {  
    FileInputStream fin=new FileInputStream(args[0]);  
    FileOutputStream fout=new FileOutputStream(args[1]);  
    int i=0;  
    while((i=fin.read())!=-1)
    {  
    fout.write(i);  
    }  
    fin.close();  
    }  
    }  