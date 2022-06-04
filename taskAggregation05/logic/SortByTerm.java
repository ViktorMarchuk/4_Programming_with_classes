package by.epam.aggregetion05.logic;

import by.epam.aggregetion05.entityTourist.Voucher;

public class SortByTerm extends SortingByType{
    @Override
    public void getSort(Voucher[] vouchers){
        System.out.println("Sorting by term");
        boolean sort = false;
        while(!sort){
            sort = true;
            for(int i = 0; i < vouchers.length - 1; i++){
                if(vouchers[i].getDay() > vouchers[i + 1].getDay()){
                    Voucher temp = vouchers[i];
                    vouchers[i] = vouchers[i + 1];
                    vouchers[i + 1] = temp;
                    sort = false;
                }
            }
        }
        for(Voucher voucher: vouchers){
            System.out.println("Term:" + voucher.getDay() +" day(s)" + " | Voucher type: " + voucher.getVoucherType() +
                    " | Transfer: " + voucher.getTransfer() + " | Food: " + voucher.getFood());
        }
    }
}
