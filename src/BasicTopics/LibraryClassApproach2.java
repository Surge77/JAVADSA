package BasicTopics;

import java.util.ArrayList;

/**
 * Create a class 'Library' that contains an array of 'String' objects representing book titles.
 * The class should have methods to add a book to the library and display all the books in the library
 */

class Library2 {
    private ArrayList<String> books;

    public Library2() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(title);
        System.out.println("Added '" + title + "' to the library.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }
}

public class LibraryClassApproach2 {

    public static void main(String[] args) {

        Library2 lib = new Library2();
        lib.addBook("Harry potter");
        lib.addBook("Rich dad");
        lib.addBook("Richness");

        lib.displayBooks();


    }
}
