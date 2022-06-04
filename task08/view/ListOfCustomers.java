package by.epam.task08.view;

import by.epam.task08.entity.CustomerAggregeting;

public class ListOfCustomers{
    public void getCustom(CustomerAggregeting[] customers) {
        for(CustomerAggregeting customer : customers) {
            System.out.println("ID Customer:" + customer.getId() + "//Customer data:" + customer.getCustomData()
                    + "//Customer addres:" + customer.getAddres() + "//Customer card number:" + customer.getCardNumber()
                    + "//Customer account number:" + customer.getAccountNumber());
        }
    }
}