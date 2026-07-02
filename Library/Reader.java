package LibraryManagement.Library;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private String email;

    private List<Book> booksReceived = new ArrayList<>();

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

    public void requestBook(Library library, Book book){
        boolean issued = library.issueBook(book);
        if (issued){
            booksReceived(book);
        }
    }

    public void returnBook(Library library, Book book){
        library.returnBook(book);
        booksReceived.remove(book);
    }

    public void booksAvailable(Library library) {
        library.booksAvailable();
    }

    public void booksReceived(Book book) {
        booksReceived.add(book);
    }
}
