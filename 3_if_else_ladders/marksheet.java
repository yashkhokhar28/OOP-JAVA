import java.util.*;
import java.io.*;

public class marksheet {
	public static void main(String[] args) {
		System.out.println("Enter Marks Of Five Subject :");
		Scanner Maths = new Scanner(System.in);

		int a = Maths.nextInt();

		Scanner c_lan = new Scanner(System.in);

		int b = c_lan.nextInt();

		Scanner web = new Scanner(System.in);

		int c = web.nextInt();

		Scanner phy = new Scanner(System.in);

		int d = phy.nextInt();

		Scanner foe = new Scanner(System.in);

		int e = foe.nextInt();

		int f = (a + b + c + d + e) / 5;

		if (f >= 60) {
			System.out.println("First Class");
		} else if (f >= 50) {
			System.out.println("Second Class");
		} else if (f >= 40) {
			System.out.println("Third Class");
		} else if (f < 40) {
			System.out.println("Fail Class");
		}

	}
}