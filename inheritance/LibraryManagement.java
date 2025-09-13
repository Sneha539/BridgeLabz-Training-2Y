// Superclass Book
class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// Subclass Author extending Book
class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}


// Main class to test
public class LibraryManagement {
    public static void main(String[] args) {
        Author bookAuthor = new Author("The Hobbit", 1937, "J.R.R. Tolkien", "An English writer and philologist.");
        
        System.out.println("Book and Author Details:");
        bookAuthor.displayInfo();
    }
}