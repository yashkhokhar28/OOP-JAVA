class book {
    private String author_name;

    public book(String author_name) {
        this.author_name = author_name;
    }

    void display() {
        System.out.println(author_name);
    }
}

class book_publication extends book {
    private String title;

    public book_publication(String title) {
        super(" ");
        this.title = title;
    }

    void display() {
        System.out.println(title);
    }
}

class paper_publication extends book {
    private String title;

    public paper_publication(String title) {
        super(" ");
        this.title = title;
    }

    void display() {
        System.out.println(title);
    }
}


public class Book_Demo {
    public static void main(String[] args) {
        book b = new book("Abhi Kanjia");
        b.display();
        book b1 = new book_publication("Abhi Kanjia Book Publication Pvt. Ltd.");
        b1.display();
        book b2 = new paper_publication("Abhi Kanjia Book Publication Pvt. Ltd.");
        b2.display();
    }
}
/*
public class Book_Demo {
    public static void main(String[] args) {
        book b = new book(args[0]);
        b.display();
        book b1 = new book_publication(args[1]);
        b1.display();
        book b2 = new paper_publication(args[2]);
        b2.display();
    }
}*/
