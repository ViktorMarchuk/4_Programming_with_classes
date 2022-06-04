package by.epam.task09.view;

import by.epam.task09.entity.BookAggregate;

public class OutputBooks{
    public void output(BookAggregate[] books) {
        for(BookAggregate book : books) {
            System.out.println("Author: " + book.getAuthor() + "| Publisher:" + book.getPublisher()
                    + "| Year of publication: " + book.getYearOfPublication() + "| Other information about book: "
                    + book.getInfoAboutBook());
        }
    }
}