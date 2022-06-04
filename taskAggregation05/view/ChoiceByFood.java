package by.epam.aggregetion05.view;

import by.epam.aggregetion05.entityTourist.Voucher;

public class ChoiceByFood extends ChoiceByAllParameters{
    @Override
    public void getVoucher(Voucher[] vouchers){
        System.out.println("Enter searching by food");
        String f = getScanner().next();
        boolean flag = true;
        for(int i = 0; i < vouchers.length; i++){
            if(vouchers[i].getFood().toLowerCase().contains(f)){
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
