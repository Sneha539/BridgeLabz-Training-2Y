abstract class LibraryItem {
    int itemId;
    String title, author;
    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    abstract int getLoanDuration();
}

class Book extends LibraryItem {
    Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    int getLoanDuration() {
        return 3;
    }
}

public class main5 {
    public static void main(String[] args) {
        LibraryItem i1 = new Book(1, "Java Basics", "James");
        LibraryItem i2 = new Magazine(2, "Tech Mag", "John");
        LibraryItem i3 = new DVD(3, "Movie", "Director");
        System.out.println(i1.title + " Loan: " + i1.getLoanDuration() + " days");
        System.out.println(i2.title + " Loan: " + i2.getLoanDuration() + " days");
        System.out.println(i3.title + " Loan: " + i3.getLoanDuration() + " days");
    }
}