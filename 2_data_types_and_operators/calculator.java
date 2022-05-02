import java.io.*;

public class calculator{
	public static void main(String[] args) {
		System.out.println("Enter The number :");
		Scanner num1;
		num1 = new Scanner(System.in);
		int a=num1.nextInt();
		System.out.println("Enter The number :");
		Scanner num2= new Scanner(System.in);
		int b=num2.nextInt();

		System.out.println("Press 1 For Addition");
		System.out.println("Press 2 For Subtraction");
		System.out.println("Press 3 For Multiplication");
		System.out.println("Press 4 For Division");

		System.out.println("Enter Your Choice");
		Scanner choice=new Scanner(System.in);
		int z=choice.nextInt();

		if (z==1) {
			System.out.println(a+b);
			
		}
		else if (z==2) {
			System.out.println(a-b);
			
		}
		else if (z==3) {
			System.out.println(a*b);
			
		}
		else if (z==4) {
			System.out.println(a/b);
			
		}

		else{
			System.out.println("wrong input enetred");
		}
	}
}
