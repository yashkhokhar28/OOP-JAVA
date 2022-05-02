import java.util.Scanner;

public class Str{
	public static void main(String[] args) {
		System.out.println("Enter A String :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for (int i=0;i<str.length() ;i++ ) {
			for (int k=str.length()-i-2;k>=0 ;k-- ) {
				System.out.print(" ");
			}
				for (int j=0;j<=i ;j++ ) {
						System.out.print(str.charAt(j)+" ");		
	    	}
	    	System.out.println();			
		}
	}
}