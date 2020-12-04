// Author: Wesley Reid
// Module 6 Programs
//

/*
 This class needs a main method and two more methods.
 
     In main:
        create an array capable of holding six Book objects.
        use the parameterized constructor to specify the data in the first four elements of this array
        use the no-arg constructor to create the two remaining books in the array.  
        process the array with a foreach loop to display the array at this point.
        call the finishArray() method with the array as the only argument.
        call the reduceBooks() method with the array as the sole argument.
        repeat the code needed by Step 4 above.
        display the most expensive book after the discounts.
        
    In finishArray():
        this is a void method.
        use the setter methods to specify the data in all fields of the last two books in the array.
        
    In reduceBooks():
        this method returns a Book instance.
        use a loop (any type) to reduce the price of every book in the array by 40%.
        determine the most expensive book after the discounts and return this book to main.
 */

package ProgramOne;

public class TestBook {

    public static void main(String[] args) {
        
        //create an array capable of holding six Book objects.
        Book[] bookArray = new Book[6];
        
        //use the parameterized constructor to specify the data in the first four elements of this array
        //Prices pulled from Amazon.com
        bookArray[0] = new Book("Introduction to Java", "Y. Daniel Liang", 1320, 145.00);
        bookArray[1] = new Book("The C Programming Language", "Brian W. Kernighan", 272, 55.56);
        bookArray[2] = new Book("Starting with C++", "Tony Gaddis", 1280, 33.79);
        bookArray[3] = new Book("Network+ Guide to Networks", "Tamara Dean", 896, 78.10);
        bookArray[4] = new Book();
        bookArray[5] = new Book();
        
        System.out.println("Book array contents before library completion.");
        System.out.println("---------------------------------------------------");
        for(int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].toString());
        }
        
        //pass array to finishArray 
        finishArray(bookArray);
        
        System.out.print("\n");
        System.out.println("Books after completing library and 40% discount.");
        System.out.println("---------------------------------------------------");
        
        //create new instance of Book() from reduceBooks() return value
        Book highBook = reduceBooks(bookArray);
        
        for(int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].toString());
        }
        
        System.out.print("\n");
        System.out.println("Most expensive book after discount.");
        System.out.println("---------------------------------------------------");
        System.out.println(highBook.toString());
        
        //access numBooks to report library size
        System.out.print("\n");
        System.out.println("Total book count in library.");
        System.out.println("---------------------------------------------------");
        System.out.println(Book.numBooks);

    }
    
    public static void finishArray(Book[] bookArray) {
        //book 5 & 6 using setter methods

        bookArray[4].setTitle("Learning Python");
        bookArray[4].setAuthor("Mark Lutz");
        bookArray[4].setPages(1648);
        bookArray[4].setPrice(44.58);

        bookArray[5].setTitle("The Art of Assembly Language");
        bookArray[5].setAuthor("Randall Hyde");
        bookArray[5].setPages(760);
        bookArray[5].setPrice(43.84);
    }
    
    public static Book reduceBooks(Book[] bookArray) {
        //variables for sorting out the book with the highest value later
        int index = 0;
        double highPrice = 0.0;
        
        for(int i = 0; i < bookArray.length; i++) {
            //grab the book price
            double reducedPrice = bookArray[i].getPrice();
            
            //multiplying by 0.6 should leave us with a book price of 
            //60% the original
            reducedPrice = reducedPrice * 0.6;
            
            //bubble sort? because this is easy & there isn't a great amount of data
            //but I'd imagine is super inefficient
            if(reducedPrice > highPrice) {
                highPrice = reducedPrice;
                index = i;
            }
            
            //set new to price to Book instance we're going over in the loop
            bookArray[i].setPrice(reducedPrice);
        }
        
        //return index of bookArray that had highest price
        return bookArray[index];
        
    }
}
