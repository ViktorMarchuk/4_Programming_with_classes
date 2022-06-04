package by.epam.task01.main;

import by.epam.task01.entity.Test01;
import by.epam.task01.logic.Calculate;
import by.epam.task01.view.Output;

/*
   1.Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
   переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
   наибольшее значение из этих двух переменных
 */
public class Main{
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Output output = new Output();
        Test01 test01 = new Test01(23, 54);

        calculate.getSum(test01.getA(), test01.getB());
        calculate.getHighestValue(test01.getA(), test01.getB());
        output.printSum(calculate.getSum(test01.getA(), test01.getB()));
        output.printHighestNum(calculate.getHighestValue(test01.getA(), test01.getB()));
    }
}
/*
Sum = 77
Highest number is 54
*/