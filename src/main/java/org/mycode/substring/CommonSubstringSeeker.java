package org.mycode.substring;

public class CommonSubstringSeeker {
    public String getCommonSubstring(String s1, String s2){
        if(s1.length()<2 || s2.length()<2) return "";
        String s = "";
        String out = "";
        for (int outerCounterI = 0; outerCounterI < s1.length(); outerCounterI++) {
            for (int outerCounterJ = 0; outerCounterJ < s2.length(); outerCounterJ++) {
                if(s1.charAt(outerCounterI)==s2.charAt(outerCounterJ)){
                    for (int innerCounterI = outerCounterI, innerCounterJ = outerCounterJ; innerCounterI < s1.length() && innerCounterJ<s2.length(); innerCounterI++, innerCounterJ++) {
                        if(s1.charAt(innerCounterI)!=s2.charAt(innerCounterJ)) break;
                        s += s1.charAt(innerCounterI);
                    }
                    if(s.length()>out.length()) out = s;
                    s = "";
                }
            }
        }
        return out;
    }
}
