import java.util.Scanner;

class MyExc extends Exception {
    int a;

    MyExc(int a) {
        this.a = a;
    }

    void withdraw() {
        System.out.println("your balance is less than " + a);
    }
}

class Account {
    int a = 5000;

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter balance to withdraw ");
        int b = sc.nextInt();
        try {
            if ((a - b) > 0) {
                System.out.println("transection successfully happend");
                a = a - b;
                System.out.println("your new balance is " + a);
            } else {
                throw new MyExc(b);
            }
        } catch (MyExc e) {
            e.withdraw();
        }
    }
}

public class InSufficientFundExceptionDemo {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.withdraw();
    }
}
