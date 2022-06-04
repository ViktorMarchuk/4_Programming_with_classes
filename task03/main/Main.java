package by.epam.task03.main;

import by.epam.task03.entity.Student;
import by.epam.task03.logic.Calculate;
import by.epam.task03.view.Output;

public class Main{
    /*
    3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
    из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
    номеров групп студентов, имеющих оценки, равные только 9 или 10
     */
    public static void main(String[] args) {
        int numberOfStudents = 10;

        Student student = new Student();
        Calculate calculate = new Calculate();
        Output output = new Output();

        Student[] students = new Student[numberOfStudents];
        students[0] = new Student("Kot A.A.", 1);
        students[1] = new Student("Bobrov T.T.", 2);
        students[2] = new Student("Korch  M.N.", 1);
        students[3] = new Student("Dok N.F.", 1);
        students[4] = new Student("Shmidt  A.F.", 3);
        students[5] = new Student("Anderson  N.K.", 2);
        students[6] = new Student("Kotov I.F.", 1);
        students[7] = new Student("Deil  E.K.", 3);
        students[8] = new Student("Mitte  N.K.", 1);
        students[9] = new Student("Korol  E.F.", 1);

        students[0].addGrades(5, 4, 6, 8, 9);
        students[1].addGrades(5, 3, 4, 3, 6);
        students[2].addGrades(7, 5, 6, 6, 5);
        students[3].addGrades(6, 7, 6, 7, 8);
        students[4].addGrades(10, 9, 9, 10, 9);
        students[5].addGrades(7, 7, 8, 7, 5);
        students[6].addGrades(10, 9, 10, 9, 9);
        students[7].addGrades(7, 5, 7, 6, 6);
        students[8].addGrades(9, 7, 8, 7, 8);
        students[9].addGrades(4, 6, 5, 5, 6);

        output.getList(students);
        System.out.println();
        calculate.findStudent(students);
    }
}
/*
The list of students.
Student: Kot A.A. group: 1
Student: Bobrov T.T. group: 2
Student: Korch  M.N. group: 1
Student: Dok N.F. group: 1
Student: Shmidt  A.F. group: 3
Student: Anderson  N.K. group: 2
Student: Kotov I.F. group: 1
Student: Deil  E.K. group: 3
Student: Mitte  N.K. group: 1
Student: Korol  E.F. group: 1

The students with grades 9 and 10.
Student: Shmidt  A.F. group: 3
Student: Kotov I.F. group: 1
 */