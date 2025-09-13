// My Book class for the library project.
// This class will store book details and demonstrate some Java concepts.

public class Book {

    // --- STATIC Members ---
    // This static variable is for the library's name. It's shared for ALL books.
    // So if the library name changes, it changes for every book object.
    static String libraryName = "Agra Public Library";

    // --- INSTANCE Members ---
    // These variables belong to each specific book object.
    String title;
    String author;

    // The 'final' keyword means this variable cannot be changed after it's set.
    // ISBN is a unique number for a book, so it should never change.
    final String isbn;


    // --- CONSTRUCTOR ---
    // This is called when we create a new Book object, like with `new Book(...)`.
    public Book(String title, String author, String isbn) {
        // Here, 'this' helps to make it clear we are setting the instance variable.
        // 'this.title' is the variable belonging to the object.
        // 'title' (on the right) is the parameter passed to the constructor.
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        System.out.println("New book added to the system: '" + this.title + "'");
    }


    // --- METHODS ---

    // A static method belongs to the class itself, not an individual object.
    // We can call it directly using the class name: Book.displayLibraryName().
    public static void displayLibraryName() {
        System.out.println("------------------------------------");
        System.out.println("This book belongs to: " + libraryName);
        System.out.println("------------------------------------");
    }

    // This method displays the details for a single book instance.
    public void displayBookDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn); // This is the final variable.
        System.out.println("--------------------");
    }


    // --- MAIN Method for Testing ---
    // This is where the program starts. I'll use it to test my class.
    public static void main(String[] args) {
        System.out.println("Starting the Library Management Program...");

        // We can call the static method even before creating any book objects.
        Book.displayLibraryName();

        // Let's create a couple of book objects.
        Book book1 = new Book("The Adventures of Tom Sawyer", "Mark Twain", "978-0143039563");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "978-0679783268");

        // Now, I will use 'instanceof' to check if my object is actually a 'Book'.
        // This is a good practice to avoid errors if you have different types of objects.
        System.out.println("\nVerifying object types before showing details...");

        if (book1 instanceof Book) {
            System.out.println("Object 'book1' is a valid Book. Displaying its details.");
            book1.displayBookDetails();
        } else {
            System.out.println("Warning: 'book1' is not a Book object.");
        }

        if (book2 instanceof Book) {
            System.out.println("Object 'book2' is a valid Book. Displaying its details.");
            book2.displayBookDetails();
        } else {
            System.out.println("Warning: 'book2' is not a Book object.");
        }

        // Just to prove that the 'final' variable 'isbn' cannot be changed.
        // If I uncomment the next line, the code will not compile.
        // book1.isbn = "some-new-isbn"; // This will give a compilation error.
        System.out.println("\nThe ISBN for '" + book1.title + "' is final and cannot be changed.");
    }
}