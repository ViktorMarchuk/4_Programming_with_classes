package by.epam.task09.entity;

import java.util.Objects;

public class Book{
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;
    private int price;
    private String typeOfBinding;

    public Book() {

    }

    public Book(int id, String title, String author, String publisher, int yearOfPublication, int numberOfPages,
                int price, String typeOfBindings) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBindings;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, id, numberOfPages, price, publisher, title, typeOfBinding, yearOfPublication);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(author, other.author) && id == other.id && numberOfPages == other.numberOfPages
                && price == other.price && Objects.equals(publisher, other.publisher)
                && Objects.equals(title, other.title) && Objects.equals(typeOfBinding, other.typeOfBinding)
                && yearOfPublication == other.yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
                + ", yearOfPublication=" + yearOfPublication + ", numberOfPages=" + numberOfPages + ", price=" + price
                + ", typeOfBinding=" + typeOfBinding + "]";
    }
}