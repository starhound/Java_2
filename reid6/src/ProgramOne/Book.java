// Author: Wesley Reid
// Module 6 Programs
//

/*
    has instance data members (all private) String title, String author, int pages, double price.
    has a public static int variable named numBooks with an initial value of zero.
    has a parameterized constructor that will be used to make a Book object and assign values to its data members, and increment numBooks.
    has a no-arg constructor that increments numBooks.
    has getters and setters for all instance data members.
    has a toString() method that returns a string displaying the state of a Book instance.
    Use the numBooks variable to report the number of books instantiated.
*/

package ProgramOne;

public class Book {
    
    //data variables
    private String title, author; 
    private int pages;
    private double price; 
    static int numBooks = 0;
    
    //parameterized constructor 
    Book(String bookTitle, String bookAuthor, int bookPages, double bookPrice) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        price = bookPrice;
        numBooks++;
    }
    
    //no-arg constructor 
    Book() {
        numBooks++;
    }
    
    //getters and setters for data fields
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString() {
        //output variable
        String out = new String();
        
        //title
        out += "Book Title: ";
        out += this.title + "; ";
        
        //author
        out += "Author: ";
        out += this.author + "; ";
        
        //pages
        out += "Page Count: ";
        out += this.pages + "; ";
        
        //price
        out += "Price: $";
        out += this.price;
        
        return out; 
    }
}
