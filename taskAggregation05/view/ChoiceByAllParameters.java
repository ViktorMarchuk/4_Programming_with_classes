package by.epam.aggregetion05.view;

import by.epam.aggregetion05.entityTourist.Voucher;

import java.util.Scanner;

public class ChoiceByAllParameters{
    public Scanner getScanner(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public void getVoucher(Voucher[] vouchers){
        System.out.println("Enter the search criteria");
        System.out.println("Type:");
        String v = getScanner().next();
        System.out.println("Transport:");
        String t = getScanner().next();
        System.out.println("Food:");
        String f = getScanner().next();
        System.out.println("Term:");
        int d = getScanner().nextInt();
        boolean flag = true;
        for(int i = 0; i < vouchers.length; i++){
            if(vouchers[i].getVoucherType().toLowerCase().contains(v) && vouchers[i].getTransfer().toLowerCase().contains(t)
                    && vouchers[i].getFood().toLowerCase().contains(f) && vouchers[i].getDay() == d){
                System.out.println("Voucher type: " + vouchers[i].getVoucherType() + " | Transfer: " + vouchers[i].getTransfer() + " | Food: "
                        + vouchers[i].getFood() + " | Term: " + vouchers[i].getDay());
                flag = false;
            }
        }
        if(flag){
            System.out.println("Not found");
        }
    }
}