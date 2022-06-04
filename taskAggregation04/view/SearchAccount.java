package by.epam.aggregetion04.view;

import by.epam.aggregetion04.entity.Account;

import java.util.Scanner;

public class SearchAccount{
    public void findAccount(Account[] accounts){
        Account account = new Account();
        System.out.println("Enter the account number");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        boolean flag = true;
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i].getAccountNumber().toLowerCase().contains(n)){
                System.out.println("Account number: " + accounts[i].getAccountNumber() + " | amount: " + accounts[i].getAmountAccount() + " $");
                flag = false;
            }
        }
        if(flag){
            System.out.println("The amount not found");
        }
    }
}
