package by.epam.task06.main;

import by.epam.task06.entity.Time;
import by.epam.task06.logic.Change;
import by.epam.task06.view.Output;

/*
   Простейшие классы и объекты.
   6. Составьте описание класса для представления времени. Предусмотрите возможности установки времени и
   изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
   недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
   заданное количество часов, минут и секунд.
 */
public class Main{
    public static void main(String[] args) {
        Time time = new Time();
        Output output = new Output();
        Change change = new Change();

        System.out.println("The time: " + output.inputHours(time.getHour()) + ":"
                + output.inputMinutes(time.getMinute()) + ":" + output.inputSec(time.getSecunde()));
        System.out.println();
        System.out.println("Changed time: ");
        change.changeHours(output.inputHours(time.getHour()), 4);
        change.changeMin(output.inputMinutes(time.getMinute()), 23);
        change.changeSec(output.inputSec(time.getSecunde()), 15);
    }
}
/*
Input  hours
12
Input minutes
45
Input seconds
78
The time: 12:45:0

Changed time:
Input  hours
4
Result: 8
Input minutes
23
Result: 46
Input seconds
12
Result:27

 */