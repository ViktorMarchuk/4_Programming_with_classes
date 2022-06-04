package by.epam.aggregetion05.logic;

import by.epam.aggregetion05.entityTourist.Voucher;

public class SortingByTransport extends SortingByType{
    @Override
    public void getSort(Voucher[] vouchers){
        System.out.println("Enter sorting by transport");
        boolean sort = false;
        while(!sort){
            sort = true;
            for(int i = 0; i < vouchers.length - 1; i++){
                if(vouchers[i].getTransfer().compareToIgnoreCase(vouchers[i + 1].getTransfer()) > 0){
                    Voucher temp = vouchers[i];
                    vouchers[i] = vouchers[i + 1];
                    vouchers[i + 1] = temp;
                    sort = false;
                }
            }
        }
        for(Voucher voucher: vouchers){
            System.out.println("Transfer: " + voucher.getTransfer() + " | Voucher type: " + voucher.getVoucherType() + " | Food: "
                    + voucher.getFood() + " | Term: " + voucher.getDay() + " day(s)");
        }
    }
}
