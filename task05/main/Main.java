package by.epam.task05.main;

import by.epam.task05.entity.Count;
import by.epam.task05.logic.Calculate;

/*
   Простейшие классы и объекты.
   5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
   на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
   произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
   позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности  класса.
 */
public class Main{
    public static void main(String[] args) {
        Count count = new Count();
        Calculate calculate = new Calculate();

        System.out.println("Default counter is " + count.getCurrent());
        for(int j = 0; j < 10; j++) {
        }
        System.out.println("Counter after increasing " + calculate.inc(count.getMin(), count.getMax(), count.getCurrent()));
        for(int j = 0; j < 10; j++) {
        }
        System.out.println("Counter after decreasing " + calculate.dec(count.getMin(), count.getMax(), count.getCurrent()));

        System.out.println();

        Count count1 = new Count(1, 9, 7);
        System.out.println("Counter with arbitrary values is " + count1.getCurrent());
        for(int i = 0; i < 10; i++) {
        }
        System.out.println("Counter after increasing " + calculate.inc(count1.getMin(), count1.getMax(), count1.getCurrent()));
        for(int i = 0; i < 8; i++) {
        }
        System.out.println("Counter after decreasing " + calculate.dec(count1.getMin(), count1.getMax(), count1.getCurrent()));
    }
}
/*
Default counter is 2
Counter after increasing 3
Counter after decreasing 1

Counter with arbitrary values is 7
Counter after increasing 8
Counter after decreasing 6
 */