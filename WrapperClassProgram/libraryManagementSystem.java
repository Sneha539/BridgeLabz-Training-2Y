import java.util.ArrayList;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration(); // in days

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrower;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            borrower = borrowerName;
            System.out.println("Book reserved by " + borrower);
        } else {
            System.out.println("Book already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrower;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week for magazines
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            borrower = borrowerName;
            System.out.println("Magazine reserved by " + borrower);
        } else {
            System.out.println("Magazine already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved = false;
    private String borrower;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            isReserved = true;
            borrower = borrowerName;
            System.out.println("DVD reserved by " + borrower);
        } else {
            System.out.println("DVD already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();

        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Magazine m1 = new Magazine(102, "Tech Monthly", "Editorial Team");
        DVD d1 = new DVD(103, "Inception", "Christopher Nolan");

        items.add(b1);
        items.add(m1);
        items.add(d1);

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                if (r.checkAvailability()) {
                    r.reserveItem("Aarohi");
                } else {
                    System.out.println("Item not available.");
                }
            }

            System.out.println();
        }
    }
}
