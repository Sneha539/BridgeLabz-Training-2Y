import java.util.*;

public class LibraryBookCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();

        books.put("978-1111111111", "Data Structures");
        books.put("978-2222222222", "Operating Systems");
        books.put("978-3333333333", "Machine Learning Guide");
        books.put("978-4444444444", "Java Programming");

        String searchIsbn = "978-3333333333";
        if(books.containsKey(searchIsbn)){
            System.out.println(books.get(searchIsbn));
        } else {
            System.out.println("Book not found");
        }

        books.remove("978-2222222222");

        TreeMap<String,String> sorted = new TreeMap<>(books);
        for(String isbn : sorted.keySet()){
            System.out.println(isbn + " : " + sorted.get(isbn));
        }

        String searchTitle = "Java Programming";
        boolean found = false;
        for(String isbn : books.keySet()){
            if(books.get(isbn).equalsIgnoreCase(searchTitle)){
                System.out.println("Found: " + isbn + " : " + books.get(isbn));
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Book not found");
        }
    }
}
