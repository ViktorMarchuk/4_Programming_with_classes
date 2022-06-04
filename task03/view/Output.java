package by.epam.task03.view;

import by.epam.task03.entity.Student;

public class Output{
    public void getList(Student[] students) {
        System.out.println("The list of students.");
        for(Student student : students) {
            System.out.println("Student: " + student.getSurname() + " group: " + student.getGroupNumber());
        }
    }
}

