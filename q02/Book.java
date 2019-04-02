package assignment05.q02;

public abstract class Book {
    String title ;
    double price ;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public abstract void setPrice() ;

    public String getTitle() {
        return title;
    }

    public abstract double getPrice() ;
}
