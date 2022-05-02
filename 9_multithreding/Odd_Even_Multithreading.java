/*Write a program to create two threads, one thread will print odd numbers and second
thread will print even numbers between 1 to 20 numbers.*/

class Three implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.println(i);
        }
    }
}


class Four implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i < 20; i += 2) {
            System.out.println(i);
        }
    }
}

public class Odd_Even_Multithreading {
    public static void main(String[] args) {
        Three obj3 = new Three();
        Four obj4 = new Four();
        Thread t3 = new Thread(obj3, "child3");
        Thread t4 = new Thread(obj4, "child4");
        t3.start();
        t4.start();
    }
}