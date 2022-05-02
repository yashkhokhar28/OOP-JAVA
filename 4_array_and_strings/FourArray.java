import java.io.*;
import java.util.*;

public class FourArray{
	public static void main(String[] args) {
		
		 int sum = 0;

		 Scanner sc = new Scanner(System.in);

		int a[] = new int[5];

		for (int i = 0;i < 5; i++ ) {
			
			a[i] = sc.nextInt();

			sum = sum + a[i];
		}

		System.out.println("sum = "+sum);

		System.out.println("avarage = "+(sum)/5);
	}
}