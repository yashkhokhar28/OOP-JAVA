import java.io.*;
import java.util.*;

public class conso_vowel{
	public static void main(String[] args) {
		System.out.println("enter string : ");


		int conso = 0;

		int vowel = 0;

		Scanner a = new Scanner(System.in);

		String s1 = a.next();

		int l = s1.length();

		for (int i = 0;i < l ;i++ ) {
			
			char ch = s1.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowel++;
			}
			else{
				conso++;
			}
	}
		
			System.out.println("consonant = "+conso);

			System.out.println("vowel = "+vowel);
}

}