package by.epam.task08.view;

import by.epam.task08.entity.CustomerAggregeting;

import java.util.Scanner;

public class FindCustomers{
    public void outputCustomer(CustomerAggregeting[] customers) {
        System.out.println("List of customers whose credit card number is in the specified interval");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a six-digit number");
            int n = sc.nextInt();
            System.out.println("Enter a six-digit number");
            int m = sc.nextInt();
            if (n < 100000 || m < 100000) {
                System.out.println("Enter correct interval");
            } else {

                for (int i = 0; i < customers.length; i++) {
                    if (customers[i].getAccountNumber() >= n && customers[i].getAccountNumber() <= m) {
                        System.out.println("ID Customer:" + customers[i].getId() + "//Customer data:"
                                + customers[i].getCustomData() + "//Customer addres:" + customers[i].getAddres()
                                + "//Customer card number:" + customers[i].getCardNumber()
                                + "//Customer account number:" + customers[i].getAccountNumber());
                    }
                }
                break;
            }
        }
    }
}

