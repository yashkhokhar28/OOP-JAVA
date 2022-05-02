class Count {
    static int i = 5;

    Count(int i) {
        this.i = i;
    }

    void print() {
        System.out.println("i = " + i);
    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
        int i = 0;
        Count c = new Count(i);
        c.print();
    }
}
