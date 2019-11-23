package org.mycode.Substring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonSubstringSeekerTest {
    private CommonSubstringSeeker testedSeeker = new CommonSubstringSeeker();
    private String firstStr = "asdfghjkl";
    private String secondStr = "qwerpoasdfmnzjklxcv";
    private String maxCommonSubstring = "asdf";
    @Test
    public void shouldGiveMaxCommonSubstring(){
        assertEquals(maxCommonSubstring, testedSeeker.getCommonSubstring(firstStr, secondStr));
    }
}
