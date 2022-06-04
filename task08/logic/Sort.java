package by.epam.task08.logic;

import by.epam.task08.entity.CustomerAggregeting;

public class Sort{

    public void sortCustomer(CustomerAggregeting[] customers) {
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < customers.length-1; i++) {
                if (customers[i].getCustomData().compareToIgnoreCase(customers[i + 1].getCustomData()) > 0) {
                    CustomerAggregeting temp = customers[i];
                    customers[i] = customers[i + 1];
                    customers[i + 1] = temp;
                    sort = false;

                }
            }
        }
        for (CustomerAggregeting customer : customers) {
            System.out.println("ID Customer:" + customer.getId() + "//Customer data:" + customer.getCustomData()
                    + "//Customer addres:" + customer.getAddres() + "//Customer card number:"
                    + customer.getCardNumber() + "//Customer account number:" + customer.getAccountNumber());
        }
    }
}

