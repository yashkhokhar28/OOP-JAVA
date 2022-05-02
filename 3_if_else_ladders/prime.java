import java.util.*;
import java.io.*;

public class prime{
	public static void main(String[] args) {

		boolean flag = false;
		
		System.out.println("Enter Number :");

		Scanner num1 = new Scanner(System.in);

		int a = num1.nextInt();


		for (int i=2;i<=(a/2) ;i++ ) {
			
			flag = true;

			break;
		}

		if(!flag){
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		} 


	}
}