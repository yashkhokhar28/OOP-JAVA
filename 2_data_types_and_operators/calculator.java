import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter The number 1 :");
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();
        System.out.println("Enter The number 2 :");
        Scanner num2 = new Scanner(System.in);
        int b = num2.nextInt();

        System.out.println("Type Add For Addition");
        System.out.println("Type Sub For Subtraction");
        System.out.println("Type Multi For Multiplication");
        System.out.println("Type Div For Division");

        System.out.println("Enter Your Choice");
        Scanner choice = new Scanner(System.in);
        String z = choice.nextLine();

        if (z.equalsIgnoreCase("add")) {
            System.out.println(a + b);

        } else if (z.equalsIgnoreCase("sub")) {
            System.out.println(a - b);

        } else if (z.equalsIgnoreCase("multi")) {
            System.out.println(a * b);

        } else if (z.equalsIgnoreCase("div")) {
            System.out.println(a / b);

        } else {
            System.out.println("wrong input entered");
        }
    }
}
