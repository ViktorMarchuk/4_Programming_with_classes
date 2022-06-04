package by.epam.task03.logic;

import by.epam.task03.entity.Student;

public class Calculate{
    public void findStudent(Student[] students) {
        System.out.println("The students with grades 9 and 10. ");
        for(Student student : students) {
            int count = 0;
            for(int grade : student.getGrades()) {
                if(grade >= 9) {
                    count++;
                }
            }
            if(count == 5) {
                System.out.println("Student: " + student.getSurname() + " group: " + student.getGroupNumber());
            }
        }
    }
}

