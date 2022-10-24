package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @Test
    void multiStrTest() {
        String s = "hello";
        int n = 3;
        assertEquals("hellohellohello", StringProcessor.multiStr(s, n));
        n = 4;
        assertEquals("hellohellohellohello", StringProcessor.multiStr(s, n));
        s = "s s";
        n = 2;
        assertEquals("s ss s", StringProcessor.multiStr(s, n));
    }

    @Test
    void numberOfEnterTest() {
        assertEquals(5, StringProcessor.numberOfEnterStrToStr("AAbaAAbAAAABABAA", "AA"));
        assertEquals(1, StringProcessor.numberOfEnterStrToStr("AAABABBB", "BAB"));
        assertEquals(2, StringProcessor.numberOfEnterStrToStr("cAbBaCCacAb", "cAb"));
    }

    @Test
    void replaceTest(){
        assertEquals("OneTwoThree", StringProcessor.replaceNumbersStr("123"));
        assertEquals("OneOneThree", StringProcessor.replaceNumbersStr("113"));
        assertEquals("OneOneOneOneOneOne", StringProcessor.replaceNumbersStr("111111"));
    }

    @Test
    void deleteNumbersTest(){
        String str = "123456789";
        StringBuilder sb = new StringBuilder(str);
        assertEquals("13579", StringProcessor.deleteSymbolStr(sb).toString());
        str = "abcdefg";
        sb = new StringBuilder(str);
        assertEquals("aceg", StringProcessor.deleteSymbolStr(sb).toString());
    }

    @Test
    void sixteenSysTest(){
        String s = "Васе 0x00000010 лет";
        assertEquals("Васе 16 лет", StringProcessor.sixteenTranslateStr(s));
        s = "Васе 0x00000013 лет";
        assertEquals("Васе 19 лет", StringProcessor.sixteenTranslateStr(s));
        s = "Васе 0x00000020 года";
        assertEquals("Васе 32 года", StringProcessor.sixteenTranslateStr(s));
    }


}