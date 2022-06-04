package by.epam.task08.entity;

import java.util.Objects;

public class Customer{
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String addres;
    private int cardNumber;
    private int accountNumber;

    public Customer() {

    }

    public Customer(int id, String surname, String name, String patronymic, String addres, int cardNumber,
                    int accountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
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
        return Objects.hash(id, surname, name, patronymic, addres, cardNumber, accountNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj)
            return false;
        Customer other = (Customer) obj;
        return Objects.equals(addres, other.addres) && Objects.equals(surname, other.surname)
                && Objects.equals(name, other.name) && Objects.equals(surname, other.surname)
                && Objects.equals(patronymic, other.patronymic) && id == other.id && cardNumber == other.cardNumber
                && accountNumber == other.accountNumber;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}