class book1 {
    private String author_name;

    book1(String author_name) {
        this.author_name = author_name;
    }

    void display() {
        System.out.println(author_name);
    }
}

class book1_publication extends book1 {
    private String title;

    book1_publication(String title) {
        super(" ");
        this.title = title;
    }

    void display() {
        System.out.println(title);
    }
}

class paper1_publication extends book1 {
    private String title;

    paper1_publication(String title) {
        super(" ");
        this.title = title;
    }

    void display() {
        System.out.println(title);
    }
}


public class SuperDemo {
    public static void main(String[] args) {
        book1 b = new book1("Abhi Kanjia");
        b.display();
        book1 b1 = new book1_publication("Abhi Kanjia book1 Publication Pvt. Ltd.");
        b1.display();
        book1 b2 = new paper1_publication("Abhi Kanjia book1 Publication Pvt. Ltd.");
        b2.display();
    }
}
 

/*public class SuperDemo {
	public static void main(String[] args) {
		book1 b = new book1(args[0]);
		b.display();
		book1 b1 = new book1_publication(args[1]);
		b1.display();
		book1 b2 = new paper1_publication(args[2]);
		b2.display();
	}
}*/