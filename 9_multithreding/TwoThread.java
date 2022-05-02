/*Write an application that executes two threads. One thread displays "Good Morning"
every 1000 milliseconds & another thread displays "Good Afternoon" every 3000
milliseconds. Create the threads by implementing the Runnable interface*/

class One implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morrning");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

class Two implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Afternoon");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class TwoThread {
    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();
        Thread t1 = new Thread(obj1, "child1");
        Thread t2 = new Thread(obj2, "child2");
        t1.start();
        t2.start();
    }
}