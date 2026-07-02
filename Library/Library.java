package LibraryManagement.Library;

import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> booksAvailable(){
        return books;
    }

    public boolean issueBook(Book book){
        for (int i = 0; i < books.size(); i++){
            if (book.getTitle().equals(books.get(i).getTitle()) && book.getAuthor().equals(books.get(i).getAuthor()) && books.get(i).isIssued() != true){
                books.get(i).markIssued();
                System.out.println("Book issued successfully.");
                break;
            }
        }
        if (!book.isIssued()){
            System.out.println("Book not found or already issued.");
        }
        return false;
    }

    public void returnBook(Book book) {
        book.markReturned();
        System.out.println("Book is returned");
    }
}
