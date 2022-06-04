package by.epam.aggregetion04.logic;

import by.epam.aggregetion04.entity.Account;

public class AccountManagement{
    public void blockAccount(Account[] accounts){
        System.out.println("This account(s) is blocked.");
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i].getAmountAccount() < 0)
                System.out.println("Account number: " + accounts[i].getAccountNumber() + "." + "\n" + "For unblocking account(s) you need add not less 10 $.");
        }
    }
}
