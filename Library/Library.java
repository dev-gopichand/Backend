package LibraryManagement.Library;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> booksAvailable(){
        List<Book> booksAvailableToIssue = new ArrayList<>();
        for (Book book : books){
            if (!book.isIssued()){
                booksAvailableToIssue.add(book);
            }
        }
        return booksAvailableToIssue;
    }

    public Book issueBook(Reader reader, String title, String author){
        if (reader.borrowedBooks().size() == 3){
            System.out.println("Borrowing limit is reached");
            return null;
        }
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

    public boolean returnBook(Book book) {
        for (Book currentBook : books){
            if (currentBook.equals(book) && currentBook.isIssued()){
                book.markReturned();
                return true;
            }
        }
        return false;
    }
}
