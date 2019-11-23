package org.mycode.Discount;

import java.util.Scanner;

public class AppView {
    private final String massageEnterTotal = "Enter total: ";
    private final String massageEnterTotalWrong = "Need positive number";
    private final String patternNumber = "\\d+";
    public void inputTotalAmount(){
        BusinessLogic bl = new BusinessLogic();
        System.out.println(bl.generateReceipt(validation(patternNumber, massageEnterTotal, massageEnterTotalWrong)).generateReceipt());
    }
    private double validation(String pattern, String shownText, String shownTextIfWrong){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(shownText);
            if(!scanner.hasNext(pattern)){
                scanner.next();
                System.out.println(shownTextIfWrong);
                continue;
            }
            return scanner.nextDouble();
        }while (true);
    }
}
