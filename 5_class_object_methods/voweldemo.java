import java.util.Scanner;

class vowel{
	void vowel(){
			Scanner sc = new Scanner(System.in);

			String s1;
			int totalvowelcount = 0;

			do{
				System.out.println("enter sentence : ");

				s1 = sc.nextLine();

				for (int i=0;i<s1.length() ;i++ ) {
					if (s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u') {
						totalvowelcount++;
					}
				}

			}while(!s1.equals("quit"));

			System.out.println(totalvowelcount);
	}
}

public class voweldemo{
	public static void main(String[] args) {
		vowel n = new vowel();
		n.vowel();
	}
}