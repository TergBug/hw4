package org.mycode.Discount;

public class BusinessLogic {
    public Receipt generateReceipt(double total){
        Receipt receipt = new Receipt();
        receipt.setTotal(total);
        if(total>0 && total<=500) receipt.setDiscount(5);
        else if(total>500 && total<=1000) receipt.setDiscount(10);
        else if(total>1000) receipt.setDiscount(15);
        else return null;
        receipt.setAmountToPay(receipt.getTotal()*(1-0.01*receipt.getDiscount()));
        return receipt;
    }
}
