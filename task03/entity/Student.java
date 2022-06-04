package by.epam.task03.entity;

import java.util.Arrays;
import java.util.Objects;

public class Student{
    private String surname;
    private int groupNumber;
    private int grades[];

    public Student() {

    }

    public Student(String surname, int groupNumber) {
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.grades = new int[5];

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber() {
        this.groupNumber = groupNumber;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;

    }

    public void addGrades(int grade1, int grade2, int grade3, int grade4, int grade5) {
        grades[0] = grade1;
        grades[1] = grade2;
        grades[2] = grade3;
        grades[3] = grade4;
        grades[4] = grade5;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(grades);
        result = prime * result + Objects.hash(groupNumber, surname);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Arrays.equals(grades, other.grades) && groupNumber == other.groupNumber
                && Objects.equals(surname, other.surname);
    }

    @Override
    public String toString() {
        return "Student [surname=" + surname + ", groupNumber=" + groupNumber + ", grades=" + Arrays.toString(grades)
                + "]";
    }
}
