package by.epam.task08.main;

import by.epam.task08.entity.CustomerAggregeting;
import by.epam.task08.logic.Sort;
import by.epam.task08.view.FindCustomers;
import by.epam.task08.view.ListOfCustomers;

/*
   8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
   и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
   и методами. Задать критерии выбора данных и вывести эти данные на консоль.
   Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
   Найти и вывести:
   a) список покупателей в алфавитном порядке;
   b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Main{
    public static void main(String[] args) {
        int customerCount = 5;
        CustomerAggregeting[] customers = new CustomerAggregeting[customerCount];
        customers[0] = new CustomerAggregeting(423, "Marchuk V.V.", "Minsk, 3 Svobody str", 2345, 875634);
        customers[1] = new CustomerAggregeting(234, "Shved A.T.", "Minsk, 14 Svobody str", 1243, 985743);
        customers[2] = new CustomerAggregeting(254, "Berg I.N.", "Minsk, 9 Svobody str", 2346, 485456);
        customers[3] = new CustomerAggregeting(543, "Jarosh J.K.", "Minsk, 45 Scoriny str", 4512, 764934);
        customers[4] = new CustomerAggregeting(124, "Arnold  T.U.", "Brest,45 Turovskaya str", 3477, 127465);

        Sort sort = new Sort();
        CustomerAggregeting customerAggregeting = new CustomerAggregeting();
        ListOfCustomers listOfCustomers = new ListOfCustomers();
        FindCustomers findCustomers = new FindCustomers();

        System.out.println("List of customers");
        listOfCustomers.getCustom(customers);
        System.out.println();
        System.out.println("Sorting list of customers by alphabet");
        sort.sortCustomer(customers);
        findCustomers.outputCustomer(customers);
    }
}
/*
List of customers
ID Customer:423//Customer data:Marchuk V.V.//Customer addres:Minsk, 3 Svobody str//Customer card number:2345//Customer account number:875634
ID Customer:234//Customer data:Shved A.T.//Customer addres:Minsk, 14 Svobody str//Customer card number:1243//Customer account number:985743
ID Customer:254//Customer data:Berg I.N.//Customer addres:Minsk, 9 Svobody str//Customer card number:2346//Customer account number:485456
ID Customer:543//Customer data:Jarosh J.K.//Customer addres:Minsk, 45 Scoriny str//Customer card number:4512//Customer account number:764934
ID Customer:124//Customer data:Arnold  T.U.//Customer addres:Brest,45 Turovskaya str//Customer card number:3477//Customer account number:127465

Sorting list of customers by alphabet
ID Customer:124//Customer data:Arnold  T.U.//Customer addres:Brest,45 Turovskaya str//Customer card number:3477//Customer account number:127465
ID Customer:254//Customer data:Berg I.N.//Customer addres:Minsk, 9 Svobody str//Customer card number:2346//Customer account number:485456
ID Customer:543//Customer data:Jarosh J.K.//Customer addres:Minsk, 45 Scoriny str//Customer card number:4512//Customer account number:764934
ID Customer:423//Customer data:Marchuk V.V.//Customer addres:Minsk, 3 Svobody str//Customer card number:2345//Customer account number:875634
ID Customer:234//Customer data:Shved A.T.//Customer addres:Minsk, 14 Svobody str//Customer card number:1243//Customer account number:985743
List of customers whose credit card number is in the specified interval
Enter a six-digit number
400000
Enter a six-digit number
600000
ID Customer:254//Customer data:Berg I.N.//Customer addres:Minsk, 9 Svobody str//Customer card number:2346//Customer account number:485456
 */