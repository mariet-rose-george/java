package user;




class Boooks {
    
    String title;
    String author;
    final int boooksID;

    static int bookCount = 1000;
    final static String LIBRARY_NAME = "CENTRAL LIBRARY";


    public Boooks() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.boooksID = bookCount++;
    }

 
    public Boooks(String title, String author) {
        this.title = title;
        this.author = author;
        this.boooksID = bookCount++;
    }

    public void displayInfo() {
        System.out.println("Book ID: " + boooksID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public void displayInfo(boolean showLibrary) {
        displayInfo();
        if (showLibrary) {
            System.out.println("Library: " + LIBRARY_NAME);
        }
    }

    public static void displayTotalBooks() {
        System.out.println("Total number of books added: " + (bookCount - 1000));
    }
}
public class bookNew {
    public static void main(String[] args) {
       
        Boooks b1 = new Boooks();
        Boooks b2 = new Boooks("1984", "George Orwell"); 
        Boooks b3 = new Boooks("To Kill a Mockingbird", "Harper Lee");

        b1.displayInfo();
        System.out.println();
        b2.displayInfo(true);
        System.out.println();
        b3.displayInfo(true);
        System.out.println();

        Boooks.displayTotalBooks();
    }
}