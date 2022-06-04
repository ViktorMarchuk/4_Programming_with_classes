package by.epam.task09.view;

import by.epam.task09.entity.BookAggregate;

import java.util.Scanner;

public class GetListOfBooks{
    public Scanner getScan() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public void getBookAuthor(BookAggregate[] books) {
        System.out.println("Enter the author");
        String m = getScan().next();
        boolean flag = true;
        System.out.println("List of books published by a given author");
        for(int i = 0; i < books.length; i++) {
            if(books[i].getAuthor().toLowerCase().contains(m)) {
                flag = false;
                System.out.println("Author: " + books[i].getAuthor() + "|Publisher:" + books[i].getPublisher()
                        + "|Year of publication:" + books[i].getYearOfPublication() + "| Other information about book: "
                        + books[i].getInfoAboutBook());
            }
        }
        if(flag) {
            System.out.println("Not found this author");
        }
    }

    public void getPublisher(BookAggregate[] books) {
        System.out.println("Enter the publisher");
        String n = getScan().next();
        boolean flag = true;
        System.out.println("List of books published by a given publisher");
        for(int i = 0; i < books.length; i++) {
            if(books[i].getPublisher().toLowerCase().contains(n)) {
                flag = false;
                System.out.println("Author: " + books[i].getAuthor() + "|Publisher:" + books[i].getPublisher()
                        + "|Year of publication:" + books[i].getYearOfPublication() + "| Other information about book: "
                        + books[i].getInfoAboutBook());
            }
        }
        if(flag) {
            System.out.println("Not found this publisher");
        }
    }

    public void getYear(BookAggregate[] books) {
        System.out.println("Enter the year");
        boolean flag = true;
        int x = getScan().nextInt();
        for(int i = 0; i < books.length; i++) {
            if(books[i].getYearOfPublication() >= x) {
                flag = false;
                System.out.println("Author: " + books[i].getAuthor() + "|Publisher:" + books[i].getPublisher()
                        + "|Year of publication:" + books[i].getYearOfPublication() + "| Other information about book: "
                        + books[i].getInfoAboutBook());
            }
        }
        if(flag) {
            System.out.println("Not found");
        }
    }
}

