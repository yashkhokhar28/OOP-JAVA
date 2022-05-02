class MyException extends Exception {
    String s1;
    int x;

    MyException(String s1, int x) {
        s1 = s1;
        x = x;
    }

    String display() {
        return s1;
    }
}


public class nInteger {
    public static void main(String[] args) {

        int sum = 0;
        int flag;
        flag = 0;
        for (int i = 0; i < args.length; i++) {
            flag = 0;
            String s1 = "";
            try {
                int a = Integer.parseInt(args[i]);
                if (a < 0) {
                    flag = 1;
                    s1 = s1 + "negetive number";
                }
                if (a % 10 == 0) {
                    flag = 1;
                    s1 = s1 + "divided by 10";
                }
                if (a > 1000 && a < 2000) {
                    flag = 1;
                    s1 = s1 + "number is in between 1000,2000";
                }
                if (a > 7000) {
                    flag = 1;
                    s1 = s1 + "number is greater than 7000";
                }
                if (flag == 1) {
                    throw new MyException(s1, a);
                } else {
                    sum = sum + a;
                }
            } catch (MyException e) {
                System.out.println("error for" + e.x);
                System.out.println(e.display());
            }
        }
        System.out.println(sum);
    }
}
