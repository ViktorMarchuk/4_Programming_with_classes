package by.epam.aggregetion05.entityTourist;

import java.util.Objects;

public class Voucher{
    private String voucherType;
    private String transfer;
    private String food;
    private int day;
    public final int NUMBER_OF_OFFERS = 8;

    public Voucher(){

    }

    public Voucher(String voucherType, String transfer, String food, int day){
        this.voucherType = voucherType;
        this.transfer = transfer;
        this.food = food;
        this.day = day;
    }

    public String getVoucherType(){
        return voucherType;
    }

    public void setVoucherType(String voucherType){
        this.voucherType = voucherType;
    }

    public String getTransfer(){
        return transfer;
    }

    public void setTransfer(String transfer){
        this.transfer = transfer;
    }

    public String getFood(){
        return food;
    }

    public void setFood(String food){
        this.food = food;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    @Override
    public int hashCode(){
        return Objects.hash(voucherType, transfer, food, day);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Voucher other = (Voucher)obj;
        return Objects.equals(voucherType, other.voucherType) && Objects.equals(transfer, other.transfer)
                && Objects.equals(food, other.food) && Objects.equals(day, other.day);
    }

    @Override
    public String toString(){
        return "Voucher type " + voucherType + ", transfer " + transfer + ", food" + food + ", numbers of day " + day;
    }
}
