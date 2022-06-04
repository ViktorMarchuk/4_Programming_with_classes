package by.epam.aggregetion05.logic;

import by.epam.aggregetion05.entityTourist.Voucher;

public class SortingByType{
    public void getSort(Voucher[] vouchers){
        System.out.println("Sorting by type");
        boolean sort = false;
        while(!sort){
            sort = true;
            for(int i = 0; i < vouchers.length - 1; i++){
                if(vouchers[i].getVoucherType().compareToIgnoreCase(vouchers[i + 1].getVoucherType()) > 0){
                    Voucher temp = vouchers[i];
                    vouchers[i] = vouchers[i + 1];
                    vouchers[i + 1] = temp;
                    sort = false;
                }
            }
        }
        for(Voucher voucher: vouchers){
            System.out.println("Voucher type: " + voucher.getVoucherType() + " | Transfer: " + voucher.getTransfer() + " | Food: "
                    + voucher.getFood() + " | Term: " + voucher.getDay());
        }
    }
}
