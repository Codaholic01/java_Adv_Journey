package OOPS.ClassObject.Practice;
 // class definations
 class Book {

    // fields
    String title;
    String author;
    double price;


//constructor
    public Book(String title, String author, double price ){
        this.title = title;
        this.author = author;
        this.price = price;
    }

      // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    //Method apply to discount
    public void applyDiscount(double discountPercentage){
         price -= price * (discountPercentage / 100);
        System.out.println("Discount applied! New price: $" + price);
    }
       
}  
