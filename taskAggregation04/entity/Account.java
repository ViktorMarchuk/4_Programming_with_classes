package by.epam.aggregetion04.entity;

import java.util.Objects;

public class Account{
    private String accountNumber = "";
    private double amountAccount;
    public final int NUMBER_OF_ACCOUNTS = 5;

    public Account(){

    }

    public Account(String accountNumber, double amountAccount){
        this.accountNumber = accountNumber;
        this.amountAccount = amountAccount;

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getAmountAccount(){
        return amountAccount;
    }

    public void setAmountAccount(double amountAccount){
        this.amountAccount = amountAccount;
    }

    @Override
    public int hashCode(){
        return Objects.hash(accountNumber, amountAccount);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Account other = (Account)obj;
        return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(amountAccount, other.amountAccount);
    }

    @Override
    public String toString(){
        return "Account number  " + accountNumber + " is " + amountAccount;
    }
}
