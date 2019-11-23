package org.mycode.Substring;

import java.util.Scanner;

public class CommonSubstring {
    private static final String messageFirstString = "Enter first string: ";
    private static final String messageSecondString = "Enter second string: ";
    private static final String messageCommonSubstring = "Max common substring: ";
    public static void main(String[] args) {
        CommonSubstringSeeker seeker = new CommonSubstringSeeker();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        usersInput(str1, str2);
        System.out.println(messageCommonSubstring+seeker.getCommonSubstring(str1.toString(), str2.toString()));
    }
    private static void usersInput(StringBuilder s1, StringBuilder s2){
        Scanner scanner = new Scanner(System.in);
        System.out.print(messageFirstString);
        s1.append(scanner.next());
        System.out.print(messageSecondString);
        s2.append(scanner.next());
    }
}
