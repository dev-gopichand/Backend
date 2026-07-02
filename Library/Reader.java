package LibraryManagement.Library;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private String email;

    private List<Book> borrowedBooks = new ArrayList<>();

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
        Book book = library.issueBook(title, author);
        if (book != null){
            addBook(book);
        }
        return book;  
    }

    public void returnBook(Library library, Book book){
        library.returnBook(book);
        borrowedBooks.remove(book);
    }

    public List<Book> booksAvailable(Library library) {
        return library.booksAvailable();
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }

    public List<Book> borrowedBooks(){
        System.out.println("===== Viewing Borrowed Books ======");
        return borrowedBooks;
    }
}
