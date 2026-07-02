package LibraryManagement;

import LibraryManagement.Library.Book;
import LibraryManagement.Library.Library;
import LibraryManagement.Library.Reader;

public class LibraryMain {
    public static void main(String[] args){
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");
        Book book4 = new Book("Pride and Prejudice", "Jane Austen");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        Reader reader1 = new Reader("Alice", "alice@example.com");
        reader1.requestBook(library, book4);
        Reader reader2 = new Reader("Gopi", "gopi@gmail.com");
        reader2.booksAvailable(library);
        reader1.returnBook(library, book4);
        reader2.booksAvailable(library);
    }
}
