package org.mycode.discount;

import java.util.Date;
import java.util.Objects;

public class Receipt {
    private Date date;
    private double total;
    private double discount;
    private double amountToPay;
    public void setDate(Date date) {
        this.date = date;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }
    public double getTotal() {
        return total;
    }
    public double getDiscount() {
        return discount;
    }
    @Override
    public String toString(){
        String receiptStr = "";
        receiptStr+="\n--- Your receipt ---";
        receiptStr+="\nDate: "+((date==null) ? "undefined" : date.toString());
        receiptStr+="\nTotal: "+total;
        receiptStr+="\nDiscount: "+discount;
        receiptStr+="\nAmount to pay: "+amountToPay+"\n";
        return receiptStr;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Double.compare(receipt.total, total) == 0 &&
                Double.compare(receipt.discount, discount) == 0 &&
                Double.compare(receipt.amountToPay, amountToPay) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, discount, amountToPay);
    }
}
