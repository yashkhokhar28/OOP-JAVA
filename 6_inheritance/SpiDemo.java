/*Declare a class called student having following data members:id_no,
no_of_subjects_registered, subject_code, subject_credits,
grade_obtained and spi. Define constructor and calculate_spi methods.
Define main to instantiate an array for objects of class student
to process data of n students to be given as command line arguments.*/

import java.util.Scanner;

class student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code = new String[10];
    int[] subject_credits = new int[10];
    String[] grade_obtained = new String[10];
    double[] total = new double[10];
    double spi = 0;

    Scanner sc = new Scanner(System.in);

    void getDetails() {
        System.out.println("Enter Id No. :");
        id_no = sc.nextInt();
        System.out.println("Enter No Of Subject Registered : ");
        no_of_subjects_registered = sc.nextInt();

        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println("Enter Subject Code : ");
            subject_code[i] = sc.nextLine();
            System.out.println("Enter Subject Credits : ");
            subject_credits[i] = sc.nextInt();
            System.out.println("Enter Grade Obtained : ");
            grade_obtained[i] = sc.nextLine();
        }
    }   

    void displayStudentDetails() {
        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println("id no : " + id_no);
            System.out.println("subject code : " + subject_code);
            System.out.println("subject credits : " + subject_credits);
            System.out.println("grade obtained : " + grade_obtained);
        }
    }

    void calculateStudentSpi() {
        for (int i = 0; i < no_of_subjects_registered; i++) {
            if (grade_obtained[i].equalsIgnoreCase("a+")) {
                total[i] = 10 * subject_credits[i];
            } else if (grade_obtained[i].equalsIgnoreCase("a")) {
                total[i] = 9 * subject_credits[i];
            } else if (grade_obtained[i].equalsIgnoreCase("a")) {
                total[i] = 8 * subject_credits[i];
            } else if (grade_obtained[i].equalsIgnoreCase("b+")) {
                total[i] = 7 * subject_credits[i];
            } else if (grade_obtained[i].equalsIgnoreCase("b")) {
                total[i] = 6 * subject_credits[i];
            } else if (grade_obtained[i].equalsIgnoreCase("c+")) {
                total[i] = 5 * subject_credits[i];
            } else if (grade_obtained[i].equalsIgnoreCase("c")) {
                total[i] = 4 * subject_credits[i];
            } else if (grade_obtained[i].equalsIgnoreCase("d+")) {
                total[i] = 3 * subject_credits[i];
            } else if (grade_obtained[i].equalsIgnoreCase("d")) {
                total[i] = 2 * subject_credits[i];
            }
        }
        for (int i = 0; i < no_of_subjects_registered; i++) {
            spi = total[i] / subject_credits[i];
        }
        System.out.println("spi : " + spi);
    }
}

public class SpiDemo {
    public static void main(String[] args) {
        double a;
        a = Double.parseDouble(args[0]);
        student s1 = new student();
        for (int j = 0; j < a; j++) {
            System.out.println("Enter Details Of " + (j + 1) + " Student");
            s1.getDetails();
            s1.calculateStudentSpi();
        }
        for (int k = 0; k < a; k++) {
            System.out.println("Enter Details Of " + (k + 1) + " Student");
            s1.displayStudentDetails();
        }
    }
}
