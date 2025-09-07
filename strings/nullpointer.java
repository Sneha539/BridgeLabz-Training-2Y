public class nullpointer {

    // Method that generates NullPointerException
    public static void generateException() {
        String text = null;
        // This line will throw NullPointerException
        System.out.println("Length: " + text.length());
    }

    // Method that handles NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException, text is null.");
        }
    }

    public static void main(String[] args) {
        // First call - will throw exception (uncomment to see crash)
        // generateException();

        // Refactored call - handles the exception safely
        handleException();
    }
}

