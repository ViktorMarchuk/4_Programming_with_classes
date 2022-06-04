package by.epam.aggregetion04.logic;

import by.epam.aggregetion04.entity.Account;

public class Amount{
    public void getAllAmount(Account[] accounts){
        double sum = 0;
        for(int i = 0; i < accounts.length; i++){
            sum += accounts[i].getAmountAccount();
        }
        System.out.println("Amount: " + sum + " $");
    }

    public void getNegativeAmount(Account[] accounts){
        double sum = 0;
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i].getAmountAccount() < 0){
                sum += accounts[i].getAmountAccount();
            }
        }
        System.out.println("Negative amount: " + sum + " $");
    }

    public void getPositiveAmount(Account[] accounts){
        double sum = 0;
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i].getAmountAccount() > 0){
                sum += accounts[i].getAmountAccount();
            }
        }
        System.out.println("Positive amount: " + sum + " $");
    }
}

