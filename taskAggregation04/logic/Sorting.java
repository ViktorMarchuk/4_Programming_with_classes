package by.epam.aggregetion04.logic;

import by.epam.aggregetion04.entity.Account;

public class Sorting{
    public void sortAccounts(Account[] accounts){
        System.out.println("Sorting bank accounts");
        boolean sort = false;
        while(!sort){
            sort = true;
            for(int i = 0; i < accounts.length - 1; i++){
                if(accounts[i].getAccountNumber().compareToIgnoreCase(accounts[i + 1].getAccountNumber()) > 0){
                    Account temp = accounts[i];
                    accounts[i] = accounts[i + 1];
                    accounts[i + 1] = temp;
                    sort = false;
                }
            }
        }
        for(Account account: accounts){
            System.out.println("Account number: " + account.getAccountNumber() + " | amount: " + account.getAmountAccount() + " $");
        }
    }
}
