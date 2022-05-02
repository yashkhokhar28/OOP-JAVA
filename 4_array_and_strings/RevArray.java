import java.io.*;
import java.util.*;

public class RevArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {

			a[i] = sc.nextInt();

		}

		for (int j = 4; j >= 0; j--) {

			System.out.println("element  = " + a[j]);
		}
	}
}