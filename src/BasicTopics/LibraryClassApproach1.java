package BasicTopics;

/**
 * Create a class 'Library' that contains an array of 'String' objects representing book titles.
 * The class should have methods to add a book to the library and display all the books in the library
 */

class Library {
        String[] books;
        int size;

        public Library(int capacity) {
            books = new String[capacity];
            size = 0;
        }

        public void addBook(String book) {
            if (size < books.length) {
                books[size] = book;
                size++;
            } else {
                System.out.println("Library is full. Cannot add more books.");
            }
        }

        public void displayBooks() {
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        }
}

public class LibraryClassApproach1 {

    public static void main(String[] args) {

        Library library = new Library(5);
        library.addBook("Book1");
        library.addBook("Book2");
        library.addBook("Book3");
        library.addBook("Book4");
        library.addBook("Book5");
        library.addBook("Book6"); // This will not be added as the library is full

        library.displayBooks();

    }


}
