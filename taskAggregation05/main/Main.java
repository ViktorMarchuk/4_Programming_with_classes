package by.epam.aggregetion05.main;
/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок
 */

import by.epam.aggregetion05.entityTourist.Voucher;
import by.epam.aggregetion05.logic.SortByTerm;
import by.epam.aggregetion05.logic.SortingByFood;
import by.epam.aggregetion05.logic.SortingByTransport;
import by.epam.aggregetion05.logic.SortingByType;
import by.epam.aggregetion05.view.*;

public class Main{
    public static void main(String[] args){
        Voucher voucher = new Voucher();
        Voucher[] vouchers = new Voucher[voucher.NUMBER_OF_OFFERS];
        ChoiceByAllParameters choice = new ChoiceByAllParameters();
        ChoiceByAllParameters transport = new ChoiceByTransport();
        ChoiceByAllParameters food = new ChoiceByFood();
        ChoiceByAllParameters term = new ChoiceByTerm();
        SortingByType sort = new SortingByType();
        SortingByType transfer = new SortingByTransport();
        SortingByType food1 = new SortingByFood();
        SortingByType term1 = new SortByTerm();

        vouchers[0] = new Voucher("Rest", "Fly by plane", "Three meals a day", 14);
        vouchers[1] = new Voucher("Shopping", "Bus ride", "Only breakfast", 3);
        vouchers[2] = new Voucher("Treatment", "Train ride", "Five meals a day", 21);
        vouchers[3] = new Voucher("Cruise", "Boat trip", "All inclusive", 31);
        vouchers[4] = new Voucher("Excursion", "Bus ride", "Only breakfast", 5);
        vouchers[5] = new Voucher("Rest", "Fly by plane", "Three meals a day", 14);
        vouchers[6] = new Voucher("Rest", "Fly by plane", "Two meals a day", 21);
        vouchers[7] = new Voucher("Rest", "Fly by plane", "Three meals a day", 7);

        choice.getVoucher(vouchers);
        System.out.println("______________________");
        transport.getVoucher(vouchers);
        System.out.println("______________________");
        food.getVoucher(vouchers);
        System.out.println("______________________");
        term.getVoucher(vouchers);
        System.out.println("______________________");
        sort.getSort(vouchers);
        System.out.println("______________________");
        transfer.getSort(vouchers);
        System.out.println("______________________");
        food1.getSort(vouchers);
        System.out.println("______________________");
        term1.getSort(vouchers);
    }
}
/*
Enter the search criteria
Type:
sh
Transport:
bus
Food:
only
Term:
3
Voucher type: Shopping | Transfer: Bus ride | Food: Only breakfast | Term: 3
______________________
Enter searching by transport
trai
Voucher type: Treatment | Transfer: Train ride | Food: Five meals a day | Term: 21
______________________
Enter searching by food
two
Voucher type: Rest | Transfer: Fly by plane | Food: Two meals a day | Term: 21
______________________
Enter searching by term
3
Voucher type: Shopping | Transfer: Bus ride | Food: Only breakfast | Term: 3
______________________
Sorting by type
Voucher type: Cruise | Transfer: Boat trip | Food: All inclusive | Term: 31
Voucher type: Excursion | Transfer: Bus ride | Food: Only breakfast | Term: 5
Voucher type: Rest | Transfer: Fly by plane | Food: Three meals a day | Term: 14
Voucher type: Rest | Transfer: Fly by plane | Food: Three meals a day | Term: 14
Voucher type: Rest | Transfer: Fly by plane | Food: Two meals a day | Term: 21
Voucher type: Rest | Transfer: Fly by plane | Food: Three meals a day | Term: 7
Voucher type: Shopping | Transfer: Bus ride | Food: Only breakfast | Term: 3
Voucher type: Treatment | Transfer: Train ride | Food: Five meals a day | Term: 21
______________________
Enter sorting by transport
Transfer: Boat trip | Voucher type: Cruise | Food: All inclusive | Term: 31 day(s)
Transfer: Bus ride | Voucher type: Excursion | Food: Only breakfast | Term: 5 day(s)
Transfer: Bus ride | Voucher type: Shopping | Food: Only breakfast | Term: 3 day(s)
Transfer: Fly by plane | Voucher type: Rest | Food: Three meals a day | Term: 14 day(s)
Transfer: Fly by plane | Voucher type: Rest | Food: Three meals a day | Term: 14 day(s)
Transfer: Fly by plane | Voucher type: Rest | Food: Two meals a day | Term: 21 day(s)
Transfer: Fly by plane | Voucher type: Rest | Food: Three meals a day | Term: 7 day(s)
Transfer: Train ride | Voucher type: Treatment | Food: Five meals a day | Term: 21 day(s)
______________________
Enter sorting by food
Food: All inclusive | Voucher type: Cruise | Term: 31 day(s)
Food: Five meals a day | Voucher type: Treatment | Term: 21 day(s)
Food: Only breakfast | Voucher type: Excursion | Term: 5 day(s)
Food: Only breakfast | Voucher type: Shopping | Term: 3 day(s)
Food: Three meals a day | Voucher type: Rest | Term: 14 day(s)
Food: Three meals a day | Voucher type: Rest | Term: 14 day(s)
Food: Three meals a day | Voucher type: Rest | Term: 7 day(s)
Food: Two meals a day | Voucher type: Rest | Term: 21 day(s)
______________________
Sorting by term
Term:3 day(s) | Voucher type: Shopping | Transfer: Bus ride | Food: Only breakfast
Term:5 day(s) | Voucher type: Excursion | Transfer: Bus ride | Food: Only breakfast
Term:7 day(s) | Voucher type: Rest | Transfer: Fly by plane | Food: Three meals a day
Term:14 day(s) | Voucher type: Rest | Transfer: Fly by plane | Food: Three meals a day
Term:14 day(s) | Voucher type: Rest | Transfer: Fly by plane | Food: Three meals a day
Term:21 day(s) | Voucher type: Treatment | Transfer: Train ride | Food: Five meals a day
Term:21 day(s) | Voucher type: Rest | Transfer: Fly by plane | Food: Two meals a day
Term:31 day(s) | Voucher type: Cruise | Transfer: Boat trip | Food: All inclusive

 */