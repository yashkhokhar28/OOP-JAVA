import java.util.Scanner;

class MyPoint1 {
    double x;
    double y;
    double z;

    MyPoint1() {
        x = 0;
        y = 0;
        z = 0;
    }

    MyPoint1(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double findDistance(MyPoint1 a) {
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2) + (Math.sqrt(Math.pow(this.z - a.z, 2))));
    }
}

class Setxy1 {
    double x, y, z;
    Scanner sc = new Scanner(System.in);

    double getX() {
        System.out.println("Enter X Cordinates : " + x);
        return x = sc.nextInt();
    }

    double getY() {
        System.out.println("Enter Y Cordinates: " + y);
        return y = sc.nextInt();
    }

    double getZ() {
        System.out.println("Enter Z Cordinates : " + z);
        return z = sc.nextInt();
    }
}

public class ThreeDPointDemo {
    public static void main(String[] args) {
        Setxy1 st = new Setxy1();
        MyPoint1 m1 = new MyPoint1();
        MyPoint1 m2 = new MyPoint1(st.getX(), st.getY(), st.getZ());
        //MyPoint1 m3 = new MyPoint1(st.getX(), st.getY(), st.getZ());

        System.out.printf("distance (%.1f,%.1f,%.1f) to (%.1f,%.1f,%.1f) : ", m1.x, m1.y, m1.z, m2.x, m2.y, m2.z);
        System.out.println(m1.findDistance(m2));

        //System.out.printf("distance (%.1f,%.1f) to (%.1f,%.1f) : ", m2.x, m2.y, m2.z, m3.x, m3.y, m3.z);
        //System.out.println(m2.findDistance(m3));
    }
}

