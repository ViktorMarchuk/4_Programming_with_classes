package by.epam.aggregetion05.logic;

import by.epam.aggregetion05.entityTourist.Voucher;

public class SortingByFood extends SortingByType{
    @Override
    public void getSort(Voucher[] vouchers){
        System.out.println("Enter sorting by food");
        boolean sort = false;
        while(!sort){
            sort = true;
            for(int i = 0; i < vouchers.length - 1; i++){
                if(vouchers[i].getFood().compareToIgnoreCase(vouchers[i + 1].getFood()) > 0){
                    Voucher temp = vouchers[i];
                    vouchers[i] = vouchers[i + 1];
                    vouchers[i + 1] = temp;
                    sort = false;
                }
            }
        }
        for(Voucher voucher: vouchers){
            System.out.println("Food: " + voucher.getFood() + " | Voucher type: " + voucher.getVoucherType() + " | Term: " + voucher.getDay() + " day(s)");
        }
    }
}
