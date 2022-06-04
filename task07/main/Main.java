package by.epam.task07.main;

import by.epam.task07.entity.Triangle;
import by.epam.task07.logic.Calculate;

/*
   7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
   площади, периметра и точки пересечения медиан
 */
public class Main{
    public static void main(String[] args) {
        double x1 = 2.0;
        double y1 = 1.0;
        double x2 = 4.0;
        double y2 = 7.0;
        double x3 = 8.0;
        double y3 = 2.0;
        Calculate calculate = new Calculate();
        Triangle triangle = new Triangle();

        System.out.println("The square is: " + calculate.getSquare(x1, y1, x2, y2, x3, y3));
        System.out.println("The perimetr is: " + calculate.getPerimetr(x1, y1, x2, y2, x3, y3));
        System.out.println("The median is: " + calculate.getMedian(x1, y1, x2, y2, x3, y3));
        calculate.getCoordinateOfMedian(x1, y1, x2, y2, x3, y3);
    }
}

/*
The square is: 17.0
The perimetr is: 9.405221044033913
The median is: 7.053367989832942
The coordinates of median is X = 4.666666666666667 and Y =3.3333333333333335
 */