package org.example.classInJava.overload.Task;

public class Book {
    String title;
    String author;
    double price;

    Book(){}

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book GetBookDetail() {
        Book book = new Book("Citadel", "Archibald Canon", 12.5);
        return  book;
    }

    void printBookDetail()
    {
        System.out.println("The title is : " + title);
        System.out.println("The author is : " + author);
        System.out.println("The price is : " + price);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

