import java.util.Scanner;

class MyPoint {
    double x;
    double y;

    MyPoint() {
        x = 0;
        y = 0;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double findDistance(MyPoint a) {
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
    }
}

class Setxy {
    double x, y;
    Scanner sc = new Scanner(System.in);

    double getX() {
        System.out.println("Enter X Cordinates : " + x);
        return x = sc.nextInt();
    }

    double getY() {
        System.out.println("Enter Y Cordinates: " + y);
        return y = sc.nextInt();
    }
}

public class TwoDPointDemo {
    public static void main(String[] args) {
        Setxy st = new Setxy();
        MyPoint m1 = new MyPoint();
        MyPoint m2 = new MyPoint(st.getX(), st.getY());
        //MyPoint m3 = new MyPoint(st.getX(), st.getY());

        System.out.printf("distance (%.1f,%.1f) to (%.1f,%.1f) : ", m1.x, m1.y, m2.x, m2.y);
        System.out.println(m1.findDistance(m2));

        //System.out.printf("distance (%.1f,%.1f) to (%.1f,%.1f) : ", m2.x, m2.y, m3.x, m3.y);
        //System.out.println(m2.findDistance(m3));
    }
}

