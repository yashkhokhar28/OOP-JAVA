import java.io.*;
import java.util.*;

public class Half{
     public static void main(String[] args) {
          System.out.println("Enter String ");

          Scanner sc = new Scanner(System.in);

          String s1 = sc.nextLine();

          int l = s1.length();

          System.out.println("Half String "+s1.substring(l/2));
     }
}