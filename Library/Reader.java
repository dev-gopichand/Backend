package LibraryManagement.Library;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private String email;

    private List<Book> borrowedBooksList = new ArrayList<>();

    public Reader(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Reader [name=" + name + ", email=" + email + "]";
    }

    public Book requestBook(Library library, String title, String author){
        Book book = library.issueBook(this, title, author);
        if (book != null){
            addBook(book);
        }
        return book;  
    }

    public boolean returnBook(Library library, Book book){
        boolean success = library.returnBook(book);
        if (success){
            borrowedBooksList.remove(book);
        }
        return success;  
    }

    public List<Book> booksAvailable(Library library) {
        return library.booksAvailable();
    }

    public void addBook(Book book) {
        borrowedBooksList.add(book);
    }

    public List<Book> borrowedBooks(){
        return borrowedBooksList;
    }
}
