package LibraryManagement.Library;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> booksAvailable(){
        System.out.println("==== These are the available books =====");
        return books;
    }

    public Book issueBook(String title, String author){
        for (int i = 0; i < books.size(); i++){
            Book currentBook = books.get(i);
            if (title.equals(currentBook.getTitle()) && author.equals(currentBook.getAuthor()) && currentBook.isIssued() != true){
                System.out.println("Book issued successfully.");
                currentBook.markIssued();
                return currentBook;
            }
        }
        System.out.println("Book not found or already issued.");
        return null;
    }

    public void returnBook(Book book) {
        book.markReturned();
        System.out.println("Book is returned");
    }
}
