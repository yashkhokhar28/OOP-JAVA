import java.util.*;
import java.io.*;

public class s_palindrom{
	public static void main(String[] args) {


		String s1,rev="";
		
		System.out.println("Enter String");

		Scanner a = new Scanner(System.in);

		s1 = a.nextLine();

		int l = s1.length();

		for (int i=l-1;i>=0;i--) {
			
			rev = rev + s1.charAt(i);
		}

		if(s1.equals(rev)){
			System.out.println("Palindrom");
		}
		else{
			System.out.println("Not Palindrom");
		}
	}
}