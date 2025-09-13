// This is my Product class for a shopping cart program.
// I'm practicing Java concepts like static, this, final, and instanceof.

public class Product {

    // --- STATIC Members ---
    // A static variable is shared by all product objects.
    // This is great for a universal discount that applies to every product.
    static double discount = 0.0; // Start with no discount.

    // --- INSTANCE Members ---
    // These variables are specific to each individual product.
    String productName;
    double price;
    int quantity;

    // The 'final' keyword means the productID can't be changed once assigned.
    // This is perfect for a unique ID.
    final String productID;


    // --- CONSTRUCTOR ---
    // This method is called when we create a new product, like `new Product(...)`.
    public Product(String productName, double price, int quantity, String productID) {
        // I'm using 'this' to make it clear I'm setting the instance variables
        // of this specific object, not the constructor parameters.
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
        System.out.println("Added to cart: " + this.productName);
    }


    // --- METHODS ---

    // A static method belongs to the class itself, not to an individual object.
    // We can use it to change the discount for all products at once.
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount < 100) {
            discount = newDiscount;
            System.out.println("\n!!! Discount updated for all products to " + discount + "% !!!");
        } else {
            System.out.println("Invalid discount percentage. Please enter a value between 0 and 99.");
        }
    }

    // This method prints the details for a single product instance.
    public void displayProductDetails() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product ID: " + this.productID);
        System.out.println("Original Price: $" + this.price);
        
        // Calculate the price after the static discount
        double finalPrice = this.price - (this.price * discount / 100);
        
        System.out.println("Current Discount: " + discount + "%");
        System.out.println("Price After Discount: $" + String.format("%.2f", finalPrice));
        System.out.println("Quantity in Cart: " + this.quantity);
        System.out.println("-----------------------");
    }


    // --- MAIN Method for Testing ---
    // My program will start running from here. I'll use it to test my class.
    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping Cart!");
        System.out.println("Current site-wide discount: " + Product.discount + "%");

        // Create a few product objects.
        Product item1 = new Product("Wireless Mouse", 25.00, 2, "WM-101");
        Product item2 = new Product("USB Keyboard", 45.50, 1, "UK-203");

        // Here I'm using 'instanceof' to check if the object is actually a Product.
        // It's a good way to prevent errors.
        System.out.println("\nChecking items in cart...");
        if (item1 instanceof Product) {
            System.out.println("Item 1 is a valid product. Displaying details.");
            item1.displayProductDetails();
        }

        // Let's announce a sale! We'll update the static discount variable.
        Product.updateDiscount(15.0); // 15% off for all products

        // Now, let's display the details again to see the new price.
        // The discount should apply to all items.
        System.out.println("\nDisplaying details after discount update...");
        if (item1 instanceof Product) {
            item1.displayProductDetails();
        }
        if (item2 instanceof Product) {
            item2.displayProductDetails();
        }
        
        // This is a test to show the 'final' keyword works.
        // If I try to uncomment the line below, my code will fail to compile
        // because a product's ID should never be changed.
        // item1.productID = "NEW-ID-999"; // This will cause a compilation error.
        System.out.println("\nReminder: The Product ID is a 'final' value and cannot be changed.");
    }
}