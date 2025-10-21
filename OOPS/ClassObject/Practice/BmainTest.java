package OOPS.ClassObject.Practice;

public class BmainTest {
    public static void main(String[] args) {
         // Creating a Book object
          Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);

          myBook.displayDetails(); // Display book details
          myBook.applyDiscount(10); // Apply a 10% discount
          myBook.displayDetails(); // Display updated book details

         //Print a blank line for separation
          System.out.println();
    }      

         
    
}
