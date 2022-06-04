package by.epam.task08.entity;

import java.util.Objects;

public class CustomerAggregeting{
    private int id;
    private String customData;
    private String addres;
    private int cardNumber;
    private int accountNumber;

    public CustomerAggregeting() {

    }

    public CustomerAggregeting(int id, String customData, String addres, int cardNumber, int accountNumber) {
        this.id = id;
        this.customData = customData;
        this.addres = addres;
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomData() {
        return customData;
    }

    public void setCustomData(String customData) {
        this.customData = customData;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, addres, cardNumber, customData, id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        CustomerAggregeting other = (CustomerAggregeting) obj;
        return accountNumber == other.accountNumber && Objects.equals(addres, other.addres)
                && cardNumber == other.cardNumber && Objects.equals(customData, other.customData) && id == other.id;
    }

    @Override
    public String toString() {
        return "CustomerAdd [id=" + id + ", customData=" + customData + ", addres=" + addres + ", cardNumber="
                + cardNumber + ", accountNumber=" + accountNumber + "]";
    }
}
