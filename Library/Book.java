package LibraryManagement.Library;

public class Book {
    private String title;
    private String author;
    private boolean issued = false;
    
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void markIssued(){
        issued = true;
    }

    public void markReturned(){
        issued = false;
    }

    public boolean isIssued(){
        return issued;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}