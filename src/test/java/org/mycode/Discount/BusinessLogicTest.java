package org.mycode.Discount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusinessLogicTest {
    private BusinessLogic testedBL = new BusinessLogic();
    private Receipt needReceipt0To500 = new Receipt();
    private Receipt needReceipt500To1000 = new Receipt();
    private Receipt needReceiptMore1000 = new Receipt();
    private double total0To500 = 300;
    private double total500To1000 = 789;
    private double totalMore1000 = 2500;
    private double totalNegative = -10;
    @Before
    public void setNeedReceipt(){
        needReceipt0To500.setTotal(total0To500);
        needReceipt0To500.setDiscount(5);
        needReceipt0To500.setAmountToPay(needReceipt0To500.getTotal()*(1-0.01*needReceipt0To500.getDiscount()));
        needReceipt500To1000.setTotal(total500To1000);
        needReceipt500To1000.setDiscount(10);
        needReceipt500To1000.setAmountToPay(needReceipt500To1000.getTotal()*(1-0.01*needReceipt500To1000.getDiscount()));
        needReceiptMore1000.setTotal(totalMore1000);
        needReceiptMore1000.setDiscount(15);
        needReceiptMore1000.setAmountToPay(needReceiptMore1000.getTotal()*(1-0.01*needReceiptMore1000.getDiscount()));
    }
    @Test
    public void shouldConstructReceipt() {
        assertEquals(needReceipt0To500, testedBL.generateReceipt(total0To500));
        assertEquals(needReceipt500To1000, testedBL.generateReceipt(total500To1000));
        assertEquals(needReceiptMore1000, testedBL.generateReceipt(totalMore1000));
        assertNull(testedBL.generateReceipt(totalNegative));
    }
}
