import java.io.*;
import java.util.*;

public class sub_2{
	public static void main(String []args){
		System.out.println("enter 1st number");
		Scanner num1=new Scanner(System.in);
		int a= num1.nextInt();
		System.out.println("enter 2nd number");
		Scanner num2=new Scanner(System.in);
		int b= num2.nextInt();

		int c=a-b;

		System.out.println("ans is"+ c);
	}
}